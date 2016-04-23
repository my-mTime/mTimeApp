package com.atguigu.mtimeapp.daiwei.discover;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.daiwei.DiscoverBasepage;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverHeaderEntity;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverNewsEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.atguigu.mtimeapp.utils.DateUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/13.
 * <p/>
 * 发现--新闻页面
 */
public class News extends DiscoverBasepage {

    /**
     * 头部数据
     */
    private DiscoverHeaderEntity headerEntity;
    /**
     * 列表数据
     */
    private List<DiscoverNewsEntity.NewsListEntity> newsListEntities;

    public ListView lv_discover;
    private TextView tv_disconver_header_title;
    private ImageView iv_header_bg;
    private TextView tv_disconver_header_name;
    private TextView tv_header_news_old;
    private ImageView ib_header_prevue_play;
    private ImageView iv_header_filmComment_icon;
    private LinearLayout ll_header_news_ticketList;
    private RadioGroup rg_header_leaderboard_topList;
    ;

    public News(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        lv_discover = (ListView) View.inflate(mActivity, R.layout.discover, null);
        View header = View.inflate(mActivity, R.layout.discover_header, null);
        lv_discover.addHeaderView(header);

        tv_disconver_header_title = (TextView) header.findViewById(R.id.tv_disconver_header_title);
        iv_header_bg = (ImageView) header.findViewById(R.id.iv_header_bg);

        iv_header_filmComment_icon = (ImageView) header.findViewById(R.id.iv_header_filmComment_icon);
        tv_disconver_header_name = (TextView) header.findViewById(R.id.tv_disconver_header_name);
        tv_header_news_old = (TextView) header.findViewById(R.id.tv_header_news_old);

        ll_header_news_ticketList = (LinearLayout) header.findViewById(R.id.ll_header_news_ticketList);
        rg_header_leaderboard_topList = (RadioGroup) header.findViewById(R.id.rg_header_leaderboard_topList);
        ib_header_prevue_play = (ImageView) header.findViewById(R.id.ib_header_prevue_play);
        return lv_discover;
    }


    @Override
    public void initData() {
        super.initData();
        Log.i("TAG", "发现--新闻页面数据初始化");

        getHeaderDataFromNet();
        getDataFromNet();
    }

    /**
     * 联网获取头部数据
     */
    private void getHeaderDataFromNet() {
        OkHttpUtils.get().url(ContantsUtils.discover_header).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG", "onError===" + e);
            }

            @Override
            public void onResponse(String response) {

                processHeaderData(response);
            }
        });
    }

    private void processHeaderData(String response) {
        headerEntity = new Gson().fromJson(response, DiscoverHeaderEntity.class);

        tv_header_news_old.setVisibility(View.VISIBLE);
        ll_header_news_ticketList.setVisibility(View.VISIBLE);
        ib_header_prevue_play.setVisibility(View.GONE);
        rg_header_leaderboard_topList.setVisibility(View.GONE);
        iv_header_filmComment_icon.setVisibility(View.GONE);
        tv_disconver_header_name.setVisibility(View.GONE);

        if (headerEntity != null) {
            DiscoverHeaderEntity.NewsEntity news = headerEntity.getNews();

            tv_disconver_header_title.setText(news.getTitle());
            ImageUtils.loadImage(mActivity, news.getImageUrl(), iv_header_bg, R.drawable.img_default_300x200);
        }
    }

    /**
     * 联网获取列表数据
     */
    private void getDataFromNet() {
        OkHttpUtils.get().url(ContantsUtils.discover_news).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG", "onError===" + e);
            }

            @Override
            public void onResponse(String response) {
                processData(response);
            }
        });
    }

    /**
     * 处理列表数据
     *
     * @param response
     */
    private void processData(String response) {
        DiscoverNewsEntity newsEntity = parseJson(response);
        newsListEntities = newsEntity.getNewsList();

        if (newsListEntities != null && !newsListEntities.isEmpty()) {
            lv_discover.setAdapter(new NewsAdapter());
        }
    }

    private DiscoverNewsEntity parseJson(String response) {
        return new Gson().fromJson(response, DiscoverNewsEntity.class);
    }

    public class NewsAdapter extends BaseAdapter {

        @Override
        public int getViewTypeCount() {
            return 3;
        }

        @Override
        public int getItemViewType(int position) {
            int itemViewType = -1;
            int type = newsListEntities.get(position).getType();
            switch (type) {
                case 0:
                    itemViewType = 0;
                    break;
                case 1:
                    itemViewType = 1;
                    break;
                case 2:
                    itemViewType = 2;
                    break;
            }
            return itemViewType;
        }

        @Override
        public int getCount() {
            return newsListEntities.size();
        }

        @Override
        public DiscoverNewsEntity.NewsListEntity getItem(int position) {
            return newsListEntities.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            int itemViewType = getItemViewType(position);
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = initTypeView(convertView, itemViewType, holder);
                initCommonView(convertView, holder);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            bindData(position, itemViewType, holder);

            return convertView;
        }

        private void bindData(int position, int itemViewType, ViewHolder holder) {
            DiscoverNewsEntity.NewsListEntity newsListEntity = getItem(position);

            String title = newsListEntity.getTitle();
            holder.tv_title.setText(title);
            int reviewNum = newsListEntity.getCommentCount();
            holder.tv_reviewNum.setText("评论 " + reviewNum);
            int time = newsListEntity.getPublishTime();
            String hhTime = DateUtils.formatDate(time, "HH");
            holder.tv_time.setText(hhTime+"小时前");


            switch (itemViewType) {
                case 0:
                case 2:
                    String title2 = newsListEntity.getTitle2();
                    holder.tv_title2.setText(title2);
                    break;
                case 1:
                    List<DiscoverNewsEntity.NewsListEntity.ImagesEntity> images = newsListEntity.getImages();
                    DiscoverNewsEntity.NewsListEntity.ImagesEntity imagesEntity = images.get(0);
                    String urlImg = imagesEntity.getUrlImg1();
                    ImageUtils.loadImage(mActivity, urlImg, holder.iv_iamge1, R.drawable.img_default_90x90);

                    imagesEntity = images.get(1);
                    urlImg = imagesEntity.getUrlImg1();
                    ImageUtils.loadImage(mActivity, urlImg, holder.iv_iamge2, R.drawable.img_default_90x90);

                    imagesEntity = images.get(2);
                    urlImg = imagesEntity.getUrlImg1();
                    ImageUtils.loadImage(mActivity, urlImg, holder.iv_iamge3, R.drawable.img_default_90x90);
                    break;
            }

        }

        private View initTypeView(View convertView, int itemViewType, ViewHolder holder) {
            switch (itemViewType) {
                case 0:
                    convertView = View.inflate(mActivity, R.layout.item_news, null);
                    holder.iv_paly = (ImageView) convertView.findViewById(R.id.iv_item_news_play);
                    holder.tv_title2 = (TextView) convertView.findViewById(R.id.tv_item_news_title2);
                    holder.iv_paly.setVisibility(View.GONE);
                    break;
                case 2:
                    convertView = View.inflate(mActivity, R.layout.item_news, null);
                    holder.iv_paly = (ImageView) convertView.findViewById(R.id.iv_item_news_play);
                    holder.tv_title2 = (TextView) convertView.findViewById(R.id.tv_item_news_title2);
                    holder.iv_paly.setVisibility(View.VISIBLE);
                    break;
                case 1:
                    convertView = View.inflate(mActivity, R.layout.item_news2, null);
                    holder.iv_iamge2 = (ImageView) convertView.findViewById(R.id.iv_item_news2_img2);
                    holder.iv_iamge3 = (ImageView) convertView.findViewById(R.id.iv_item_news2_img3);
                    break;
            }
            return convertView;
        }

        private void initCommonView(View convertView, ViewHolder holder) {
            holder.iv_iamge1 = (ImageView) convertView.findViewById(R.id.iv_item_news_image);
            holder.tv_title = (TextView) convertView.findViewById(R.id.tv_item_news_title);
            holder.tv_time = (TextView) convertView.findViewById(R.id.tv_item_news_time);
            holder.tv_reviewNum = (TextView) convertView.findViewById(R.id.tv_item_news_reviewNum);

        }

        private class ViewHolder {
            ImageView iv_paly;
            TextView tv_title;
            TextView tv_title2;
            TextView tv_time;
            TextView tv_reviewNum;

            ImageView iv_iamge1;
            ImageView iv_iamge2;
            ImageView iv_iamge3;
        }
    }

}
