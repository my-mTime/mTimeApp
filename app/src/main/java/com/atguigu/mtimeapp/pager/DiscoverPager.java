package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.daiwei.DiscoverBasepage;
import com.atguigu.mtimeapp.daiwei.discover.FilmComment;
import com.atguigu.mtimeapp.daiwei.discover.Leaderboard;
import com.atguigu.mtimeapp.daiwei.discover.News;
import com.atguigu.mtimeapp.daiwei.discover.Prevue;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverHeaderEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;

import okhttp3.Request;

/**
 * Created by FlagWu on 2016/4/8.
 *
 * 发现页面
 */
public class DiscoverPager extends BasePager {

    private TabLayout tl_discover_tab;
    private ViewPager vp_discover_viewPager;
    private ArrayList<String> titles;
    private ArrayList<DiscoverBasepage> DiscoverPages;

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

    public DiscoverPager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.activity_discover, null);

        tl_discover_tab = (TabLayout) view.findViewById(R.id.tl_discover_tab);
        vp_discover_viewPager = (ViewPager) view.findViewById(R.id.vp_discover_viewPager);

        titles = new ArrayList<>();
        titles.add("新闻");
        titles.add("预告片");
        titles.add("排行榜");
        titles.add("影评");

        vp_discover_viewPager.setAdapter(new MyAdapter());
        tl_discover_tab.setTabMode(TabLayout.MODE_FIXED);
        tl_discover_tab.setupWithViewPager(vp_discover_viewPager);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        DiscoverPages = new ArrayList<>();
        DiscoverPages.add(new News(mActivity));
        DiscoverPages.add(new Prevue(mActivity));
        DiscoverPages.add(new Leaderboard(mActivity));
        DiscoverPages.add(new FilmComment(mActivity));
    }

    private class MyAdapter extends PagerAdapter {

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }

        @Override
        public int getCount() {
            return titles.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
//            View view = initContentView();
//            getHeaderData(position);
            DiscoverBasepage discoverBasepage = DiscoverPages.get(position);
            View view = discoverBasepage.childView;
            discoverBasepage.initData();
//            View view = DiscoverBasepage.view;
            container.addView(view);
            return view;
        }


        /**
         * 根据切换的页面显示对应的头部
         * @param position
         */
        private void getHeaderData(final int position) {
            OkHttpUtils.get().url(ContantsUtils.discover_header).build().execute(new StringCallback() {
                @Override
                public void onError(Request request, Exception e) {
                    Log.i("TAG", "onError===" + e);
                }

                @Override
                public void onResponse(String response) {

                    ProcessData(position, response);
                }
            });
        }

        private void ProcessData(int position, String response) {
            headerEntity = new Gson().fromJson(response, DiscoverHeaderEntity.class);

            if(headerEntity !=null) {
                DiscoverHeaderEntity.TrailerEntity trailer = headerEntity.getTrailer();

                tv_disconver_header_title.setText(trailer.getTitle());
                ImageUtils.loadImage(mActivity, trailer.getImageUrl(), iv_header_bg);

                switch (position) {
                    case 0:
                        tv_header_news_old.setVisibility(View.VISIBLE);
                        ll_header_news_ticketList.setVisibility(View.VISIBLE);
                        ib_header_prevue_play.setVisibility(View.GONE);
                        rg_header_leaderboard_topList.setVisibility(View.GONE);
                        iv_header_filmComment_icon.setVisibility(View.GONE);
                        tv_disconver_header_name.setVisibility(View.GONE);
                        break;
                    case 1:
                        tv_header_news_old.setVisibility(View.GONE);
                        ll_header_news_ticketList.setVisibility(View.GONE);
                        ib_header_prevue_play.setVisibility(View.VISIBLE);
                        rg_header_leaderboard_topList.setVisibility(View.GONE);
                        iv_header_filmComment_icon.setVisibility(View.GONE);
                        tv_disconver_header_name.setVisibility(View.GONE);
                        break;
                    case 2:
                        tv_header_news_old.setVisibility(View.GONE);
                        ll_header_news_ticketList.setVisibility(View.GONE);
                        ib_header_prevue_play.setVisibility(View.GONE);
                        rg_header_leaderboard_topList.setVisibility(View.VISIBLE);
                        iv_header_filmComment_icon.setVisibility(View.GONE);
                        tv_disconver_header_name.setVisibility(View.GONE);
                        break;
                    case 3:
                        tv_header_news_old.setVisibility(View.GONE);
                        ll_header_news_ticketList.setVisibility(View.GONE);
                        ib_header_prevue_play.setVisibility(View.GONE);
                        rg_header_leaderboard_topList.setVisibility(View.GONE);
                        iv_header_filmComment_icon.setVisibility(View.VISIBLE);
                        tv_disconver_header_name.setVisibility(View.VISIBLE);

                        DiscoverHeaderEntity.ReviewEntity review = headerEntity.getReview();
                        tv_disconver_header_name.setText(review.getMovieName());
                        ImageUtils.loadImage(mActivity, review.getImageUrl(), iv_header_filmComment_icon);
                        break;
                }
            }

        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        /**
         * 初始化各个页面
         * @return
         */
        private View initContentView() {
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
    }
}
