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
import com.atguigu.mtimeapp.daiwei.domain.DiscoverFilmCommentEntity;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverHeaderEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/13.
 * <p/>
 * 发现--影评页面
 */
public class FilmComment extends DiscoverBasepage {

    /**
     * 头部数据
     */
    private DiscoverHeaderEntity headerEntity;
    public ListView lv_discover;
    private TextView tv_disconver_header_title;
    private ImageView iv_header_bg;
    private TextView tv_disconver_header_name;
    private TextView tv_header_news_old;
    private ImageView ib_header_prevue_play;
    private ImageView iv_header_filmComment_icon;
    private LinearLayout ll_header_news_ticketList;
    private RadioGroup rg_header_leaderboard_topList;
    private List<DiscoverFilmCommentEntity> filmComment;

    public FilmComment(Activity activity) {
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
        Log.i("TAG", "发现--影评页面数据初始化");

        getHeaderDataFromNet();
        getDataFromNet();
    }

    /**
     * 获取列表数据
     */
    private void getDataFromNet() {
        OkHttpUtils.get().url(ContantsUtils.discover_filmComment).build().execute(new StringCallback() {
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

    private void processData(String json) {
        filmComment = parseJson(json);

        if(filmComment != null&& !filmComment.isEmpty()) {
            lv_discover.setAdapter(new FilmCommentAdapter());
        }

    }

    private List<DiscoverFilmCommentEntity> parseJson(String json) {
        return new Gson().fromJson(json, new TypeToken<List<DiscoverFilmCommentEntity>>(){}.getType());
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

        tv_header_news_old.setVisibility(View.GONE);
        ll_header_news_ticketList.setVisibility(View.GONE);
        ib_header_prevue_play.setVisibility(View.GONE);
        rg_header_leaderboard_topList.setVisibility(View.GONE);
        iv_header_filmComment_icon.setVisibility(View.VISIBLE);
        tv_disconver_header_name.setVisibility(View.VISIBLE);

        if (headerEntity != null) {
            DiscoverHeaderEntity.ReviewEntity review = headerEntity.getReview();

            tv_disconver_header_title.setText(review.getTitle());
            ImageUtils.loadImage(mActivity, review.getImageUrl(), iv_header_bg, R.drawable.img_default_300x200);

            tv_disconver_header_name.setText(review.getMovieName());
            ImageUtils.loadImage(mActivity, review.getPosterUrl(), iv_header_filmComment_icon, R.drawable.img_default);
        }
    }
    public class FilmCommentAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return filmComment.size();
        }

        @Override
        public Object getItem(int position) {
            return filmComment.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = View.inflate(mActivity, R.layout.item_filmcomment, null);
                holder.iv_userIcon = (ImageView) convertView.findViewById(R.id.iv_item_comment_userIcon);
                holder.iv_poster = (ImageView) convertView.findViewById(R.id.iv_item_comment_poster);
                holder.tv_title = (TextView) convertView.findViewById(R.id.tv_item_prevue_title);
                holder.tv_summary = (TextView) convertView.findViewById(R.id.tv_item_prevue_summary);
                holder.tv_userName = (TextView) convertView.findViewById(R.id.tv_item_comment_userName);
                holder.tv_movieName = (TextView) convertView.findViewById(R.id.tv_item_comment_movieName);
                holder.tv_grade = (TextView) convertView.findViewById(R.id.tv_item_comment_grade);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            DiscoverFilmCommentEntity FilmCommentEntity = filmComment.get(position);
            DiscoverFilmCommentEntity.RelatedObjEntity relatedObj = FilmCommentEntity.getRelatedObj();
            String movieName = relatedObj.getTitle();
            holder.tv_movieName.setText(movieName);
            String coverImg = relatedObj.getImage();
            ImageUtils.loadImage(mActivity, coverImg, holder.iv_poster, R.drawable.img_default);

            String title = FilmCommentEntity.getTitle();
            holder.tv_title.setText(title);
            String userName = FilmCommentEntity.getNickname();
            holder.tv_userName.setText(userName);
            String summary = FilmCommentEntity.getSummary();
            holder.tv_summary.setText(summary);
            String rating = FilmCommentEntity.getRating();
            holder.tv_grade.setText(rating);
            String userIcon = FilmCommentEntity.getUserImage();
            ImageUtils.loadImage(mActivity, userIcon, holder.iv_userIcon, R.drawable.img_default_45x45);

            return convertView;
        }

        private class ViewHolder{
            ImageView iv_userIcon;
            ImageView iv_poster;
            TextView tv_title;
            TextView tv_summary;
            TextView tv_userName;
            TextView tv_movieName;
            TextView tv_grade;

        }
    }

}
