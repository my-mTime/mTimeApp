package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.adapter.HomePagerAdapter;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.domain.HomeBean;
import com.atguigu.mtimeapp.domain.HomeRecomFilmBean;
import com.atguigu.mtimeapp.domain.HomeTimeBean;
import com.atguigu.mtimeapp.lixin.GlobalTopActivity;
import com.atguigu.mtimeapp.lixin.MTimeHotActivity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.atguigu.mtimeapp.utils.ToWebUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.example.benhuo_library.lib.utils.image.utils.DensityUtils;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import okhttp3.Request;

/**
 * Created by FlagWu on 2016/4/8.
 */
public class HomePager extends BasePager {

    private PullToRefreshListView lvHomehead;

    //轮播图
    private AutoScrollViewPager viewPager;
    private LinearLayout llHomeheadContainer;
    private AutoScrollViewPager viewPager2;
    private LinearLayout llHomeheadContainer2;

    //扫描
    private EditText etHosearchContent;
    private ImageButton ivHosearchScan;

    //推荐电影
    private TextView tvHomerefilmCity;
    private TextView tvHomerefilmCount;
    private LinearLayout llHomerefilmContainer;
    private TextView tvHomerefilmSooncount;
    private TextView tvHomerefilmMoviecount;

    //电影商场
    private TextView tvHofilmsh0;
    private TextView tvHofilmsh01;
    private TextView tvHofilmsh1;
    private TextView tvHofilmsh11;
    private TextView tvHofilmsh2;
    private TextView tvHofilmsh21;
    private TextView tvHofilmsh3;
    private TextView tvHofilmsh31;
    private TextView tvHofilmsh4;
    private TextView tvHofilmsh41;
    private TextView tvHofilmsh5;
    private TextView tvHofilmsh51;
    private ImageView iv_hofilmsh_0;
    private ImageView iv_hofilmsh_1;
    private ImageView iv_hofilmsh_2;
    private ImageView iv_hofilmsh_3;
    private ImageView iv_hofilmsh_4;
    private ImageView iv_hofilmsh_5;

    private TextView tvHopointtiCategory;
    private TextView tvHopointtiAll;

    //entry
    private LinearLayout llHoentry0;
    private ImageView ivHoentry0;
    private TextView tvHoentry0;
    private LinearLayout llHoentry1;
    private ImageView ivHoentry1;
    private TextView tvHoentry1;
    private LinearLayout llHoentry2;
    private ImageView ivHoentry2;
    private TextView tvHoentry2;
    private LinearLayout llHoentry3;
    private ImageView ivHoentry3;
    private TextView tvHoentry4;

    //推荐的电影
    private ImageView ivHomerecitPic;
    private TextView tvHomerecitTag;
    private TextView tvHomerecitScore;
    private TextView tvHomerecitName;
    private Button btnHomerecitBuy;

    private LinearLayout loading;
    private LinearLayout loading_failed;

    private View headView;
    /**
     * 推荐的电影的数据
     */
    private List<HomeRecomFilmBean.MoviesEntity> recom_movies;
    /**
     * 顶部广告轮播条
     */
    private List<HomeBean.TopPostersEntity> topPosters;
    /**
     * 中间广告条
     */
    private List<HomeBean.AdvListEntity> advList;
    /**
     * 电影商场
     */
    private HomeBean.AreaSecondEntity areaSecond;
    /**
     * 时光精选数据
     */
    private List<HomeTimeBean.DataEntity> data;
    /**
     * 时光精选的Adapter
     */
    private HomePagerAdapter homePagerAdapter;

    public HomePager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        headView = View.inflate(mActivity, R.layout.home_head_view, null);
        View view = View.inflate(mActivity, R.layout.home_pager_list, null);

        loading = (LinearLayout) view.findViewById(R.id.loading);
        loading_failed = (LinearLayout) view.findViewById(R.id.loading_failed);

        initHeadView();

        lvHomehead = (PullToRefreshListView) view.findViewById(R.id.lv_homehead);

        return view;
    }

    private boolean hasAddHeadView = false;

    @Override
    public void initData() {
        //推荐电影
        getRecomFilm();
        //获取主页数据
        OkHttpUtils.post().url(ContantsUtils.HOME_PAGER_URL).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {

                HomeBean homeBean = new Gson().fromJson(response, HomeBean.class);
                topPosters = homeBean.getTopPosters();
                advList = homeBean.getAdvList();
                areaSecond = homeBean.getAreaSecond();

                //顶部广告轮播条
                addAdTop(topPosters);

                //中间的广告轮播条
                addCenterAd(advList);

                //电影商城
                addFilmECshop(areaSecond);

                //时光精选
                getTimeListData();
            }

            @Override
            public void onBefore(Request request) {
                super.onBefore(request);

            }

            @Override
            public void onAfter() {
                super.onAfter();
            }
        });

        /**
         * 设置entry的监听
         */
        setEntryListener();

    }

    private void setEntryListener() {
        llHoentry0.setOnClickListener(new MyOnClickListener(null));
        llHoentry1.setOnClickListener(new MyOnClickListener(null));
        llHoentry2.setOnClickListener(new MyOnClickListener(null));
        llHoentry3.setOnClickListener(new MyOnClickListener(null));
    }

    private void getTimeListData() {
        //时光精选列表
        OkHttpUtils.get().url(ContantsUtils.HOME_TIME_SELECTION).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                loading.setVisibility(View.GONE);
                loading_failed.setVisibility(View.VISIBLE);
            }

            @Override
            public void onResponse(String response) {
                loading.setVisibility(View.GONE);
                HomeTimeBean homeTimeBean = new Gson().fromJson(response, HomeTimeBean.class);
                data = homeTimeBean.getData();
                if (!hasAddHeadView) {
                    ListView refreshableView = lvHomehead.getRefreshableView();
                    refreshableView.addHeaderView(headView);//添加头布局
                    hasAddHeadView = true;
                }
                lvHomehead.setMode(PullToRefreshBase.Mode.DISABLED);
                homePagerAdapter = new HomePagerAdapter(mActivity, data);
                lvHomehead.setAdapter(homePagerAdapter);
//                lvHomehead.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {
//                    @Override
//                    public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
//
//                    }
//
//                    @Override
//                    public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
//                        //加载更多
//                        loadMorePager++;
//                        LoadMore();
//                    }
//                });
            }

            @Override
            public void onBefore(Request request) {
                super.onBefore(request);
                loading.setVisibility(View.VISIBLE);
            }
        });
    }

    private int loadMorePager = 1;

    /**
     * 加载更多
     */
    private void LoadMore() {
        String loadMoreUrl = ContantsUtils.HOME_TIME_SELECTION + "?pageIndex="+loadMorePager;
        OkHttpUtils.get().url(loadMoreUrl).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                lvHomehead.onRefreshComplete();
            }

            @Override
            public void onResponse(String response) {
                lvHomehead.onRefreshComplete();
                HomeTimeBean homeTimeBean = new Gson().fromJson(response, HomeTimeBean.class);
                List<HomeTimeBean.DataEntity> moreData = homeTimeBean.getData();
                data.addAll(moreData);
                homePagerAdapter.notifyDataSetChanged();
            }
        });
    }

    /**
     * 添加电影商城
     * @param areaSecond
     */
    private void addFilmECshop(HomeBean.AreaSecondEntity areaSecond) {
        HomeBean.AreaSecondEntity.SubFirstEntity subFirst = areaSecond.getSubFirst();
        HomeBean.AreaSecondEntity.SubSecondEntity subSecond = areaSecond.getSubSecond();
        HomeBean.AreaSecondEntity.SubFifthEntity subThird = areaSecond.getSubThird();
        HomeBean.AreaSecondEntity.SubFourthEntity subFourth = areaSecond.getSubFourth();
        HomeBean.AreaSecondEntity.SubFifthEntity subFifth = areaSecond.getSubFifth();

        tvHofilmsh0.setTextColor(Color.parseColor(subFirst.getTitleColor()));
        tvHofilmsh0.setText(subFirst.getTitle());
        tvHofilmsh01.setText(subFirst.getTitleSmall());
        ImageUtils.loadImage(mActivity, subFirst.getImage2(), iv_hofilmsh_0, R.drawable.img_default_300x200);

        tvHofilmsh1.setTextColor(Color.parseColor(subSecond.getTitleColor()));
        tvHofilmsh1.setText(subSecond.getTitle());
        tvHofilmsh11.setText(subSecond.getTitleSmall());
        ImageUtils.loadImage(mActivity, subSecond.getImage2(), iv_hofilmsh_1, R.drawable.img_default_300x200);

        tvHofilmsh2.setTextColor(Color.parseColor(subThird.getTitleColor()));
        tvHofilmsh2.setText(subThird.getTitle());
        tvHofilmsh21.setText(subThird.getTitleSmall());
        ImageUtils.loadImage(mActivity, subThird.getImage2(), iv_hofilmsh_2, R.drawable.img_default_300x200);

//        tvHofilmsh3.setTextColor(Color.parseColor(subFourth.getTitleColor()));
//        tvHofilmsh3.setText(subFirst.getTitle());
//        tvHofilmsh31.setText(subFifth.getTitleSmall());
//        ImageUtils.loadImage(mActivity,subFirst.getImage2(),iv_hofilmsh_3,R.drawable.img_default_300x200);

        tvHofilmsh4.setTextColor(Color.parseColor(subFifth.getTitleColor()));
        tvHofilmsh4.setText(subFifth.getTitle());
        tvHofilmsh41.setText(subFifth.getTitleSmall());
        ImageUtils.loadImage(mActivity, subFifth.getImage2(), iv_hofilmsh_4, R.drawable.img_default_300x200);

//        tvHofilmsh5.setTextColor(Color.parseColor(subFirst.getTitleColor()));
//        tvHofilmsh5.setText(subFirst.getTitle());
//        tvHofilmsh51.setText(subFifth.getTitleSmall());
//        ImageUtils.loadImage(mActivity,subFirst.getImage2(),iv_hofilmsh_5,R.drawable.img_default_300x200);

        iv_hofilmsh_0.setOnClickListener(new MyOnClickListener(subFirst.getGotoPage().getUrl()));
        iv_hofilmsh_1.setOnClickListener(new MyOnClickListener(subFirst.getGotoPage().getUrl()));
        iv_hofilmsh_2.setOnClickListener(new MyOnClickListener(subFirst.getGotoPage().getUrl()));
        iv_hofilmsh_4.setOnClickListener(new MyOnClickListener(subFirst.getGotoPage().getUrl()));
    }

    /**
     * 添加中间的广告轮播条
     * @param advList
     */
    private void addCenterAd(List<HomeBean.AdvListEntity> advList) {
        addAdPoint(llHomeheadContainer2, advList.size());
        setAutoAdParams(viewPager2, advList.size());
//        setPointChanged(viewPager2,advList.size());
        final int count= advList.size();
        final int[] prePos = {0};
        viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //把上一次设为默认
                llHomeheadContainer2.getChildAt(prePos[0] % count).setSelected(false);
                //当前设为红点
                llHomeheadContainer2.getChildAt(position % count).setSelected(true);
                //当前赋值给上次
                prePos[0] = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager2.setAdapter(new MyCenterAdAdapter());
        viewPager2.setCurrentItem((Integer.MAX_VALUE / 2 - Integer.MAX_VALUE / 2 % this.advList.size()));
        viewPager2.startAutoScroll();
    }

    /**
     * 添加顶部广告轮播条
     * @param topPosters
     */
    private void addAdTop(List<HomeBean.TopPostersEntity> topPosters) {

        addAdPoint(llHomeheadContainer, topPosters.size());

        setAutoAdParams(viewPager, topPosters.size());
        setPointChanged(viewPager, topPosters.size());

        viewPager.setAdapter(new MyTopAdAdapter());
        //解决最后一个跳转到第一个闪动问题
        viewPager.setCurrentItem((Integer.MAX_VALUE / 2 - Integer.MAX_VALUE / 2 % topPosters.size()));
        viewPager.startAutoScroll();//开始自动轮播
    }

    /**
     * 添加小圆点
     *
     * @param llHomeheadContainer
     */
    private void addAdPoint(LinearLayout llHomeheadContainer, int count) {
        llHomeheadContainer.removeAllViews();
        for (int i = 0; i < count; i++) {
            ImageView point = new ImageView(mActivity);
            point.setImageResource(R.drawable.home_ad_point);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(DensityUtils.dip2px(mActivity, 15), DensityUtils.dip2px(mActivity, 15));

            if (i == 0) {
                point.setSelected(true);
            } else {
                params.leftMargin = DensityUtils.dip2px(mActivity, 8);
                point.setSelected(false);
            }
            point.setLayoutParams(params);

            //把点添加到线性布局中
            llHomeheadContainer.addView(point);
        }
    }

    private void setAutoAdParams(AutoScrollViewPager viewPager, int count) {
        //设置延时时间
        viewPager.setInterval(2000);
        //设置轮播的方向 AutoScrollViewPager.RIGHT/AutoScrollViewPager.LEFT
        viewPager.setDirection(AutoScrollViewPager.RIGHT);
        //设置是否自动循环轮播，默认为true
        //注意：一旦设为true，则不能和ViewPagerIndicator一起使用
        viewPager.setCycle(true);
        //设置切换动画的时长
        viewPager.setScrollDurationFactor(2);
        //设置当滑动到最后一个或者第一个时，如何切换下一张
        /**
         * SLIDE_BORDER_MODE_NONE：不能再滑动
         * SLIDE_BORDER_MODE_TO_PARENT：移动父视图的Pager
         * SLIDE_BORDER_MODE_CYCLE：循环
         * 默认为SLIDE_BORDER_MODE_NONE
         */
        viewPager.setSlideBorderMode(AutoScrollViewPager.SLIDE_BORDER_MODE_CYCLE);
        //当滑动到最后一张或第一张时是否开启动画，默认为true
        viewPager.setBorderAnimation(false);
        //当触摸的时候，停止轮播
        viewPager.setStopScrollWhenTouch(true);
//        setPointChanged(viewPager, count);
    }

    private int prePos=0;

    /**
     * 改变小圆点的显示位置
     *
     * @param viewPager
     * @param count
     */
    private void setPointChanged(final AutoScrollViewPager viewPager, final int count) {

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //把上一次设为默认
                int i=prePos % count;
                llHomeheadContainer.getChildAt(prePos % count).setSelected(false);
                //当前设为红点
                int j=position % count;
                llHomeheadContainer.getChildAt(position % count).setSelected(true);
                //当前赋值给上次
                prePos = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    class MyCenterAdAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = new ImageView(mActivity);
            HomeBean.AdvListEntity advListEntity = advList.get(position % advList.size());
            final String webUrl=advListEntity.getUrl();
            ImageUtils.loadImage(mActivity, advListEntity.getImg(), imageView, R.drawable.img_default_300x200);
            container.addView(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ToWebUtils.startToWebPager(mActivity, webUrl);
                }
            });
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
//            super.destroyItem(container, position, object);
            container.removeView((View) object);
        }
    }

    class MyTopAdAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = new ImageView(mActivity);
            HomeBean.TopPostersEntity topPoster = topPosters.get(position % topPosters.size());
            ImageUtils.loadImage(mActivity, topPoster.getImg(), imageView, R.drawable.img_default_300x200);
            container.addView(imageView);
            final String webUrl=topPoster.getUrl();
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    ToWebUtils.startToWebPager(mActivity, webUrl);
                }
            });
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

    private boolean hasSetRecomFilm = false;

    private void getRecomFilm() {
        /**
         * 推荐电影的联网请求
         */
        OkHttpUtils.get().url(ContantsUtils.HOME_RECOM_FILM).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                HomeRecomFilmBean recomFilmBean = new Gson().fromJson(response, HomeRecomFilmBean.class);
                recom_movies = recomFilmBean.getMovies();
                if (!hasSetRecomFilm) {
                    hasSetRecomFilm = true;
                    //添加推荐的电影
                    addRecomFilm();
                }
            }
        });
    }

    /**
     * 添加推荐的电影
     */
    private void addRecomFilm() {
        for (int i = 0; i < recom_movies.size(); i++) {
            //初始化布局
            View recomFilmVew = View.inflate(mActivity, R.layout.home_recom_film_item, null);
            ivHomerecitPic = (ImageView) recomFilmVew.findViewById(R.id.iv_homerecit_pic);
            tvHomerecitTag = (TextView) recomFilmVew.findViewById(R.id.tv_homerecit_tag);
            tvHomerecitScore = (TextView) recomFilmVew.findViewById(R.id.tv_homerecit_score);
            tvHomerecitName = (TextView) recomFilmVew.findViewById(R.id.tv_homerecit_name);
            btnHomerecitBuy = (Button) recomFilmVew.findViewById(R.id.btn_homerecit_buy);

            final HomeRecomFilmBean.MoviesEntity moviesEntity = recom_movies.get(i);
            //设置数据
            ImageUtils.loadImage(mActivity, moviesEntity.getImg(), ivHomerecitPic, R.drawable.img_default);
            if (moviesEntity.isIs3D()) {
                tvHomerecitTag.setVisibility(View.VISIBLE);
                tvHomerecitTag.setText("3D");
            } else {
                tvHomerecitTag.setVisibility(View.GONE);
            }
            if (moviesEntity.getRatingFinal() == -1) {
                tvHomerecitScore.setVisibility(View.GONE);
            } else {
                tvHomerecitScore.setVisibility(View.VISIBLE);
                tvHomerecitScore.setText(moviesEntity.getRatingFinal() + "");
            }
            tvHomerecitName.setText(moviesEntity.getTitleCn());
            btnHomerecitBuy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(mActivity, moviesEntity.getTitleCn(), Toast.LENGTH_SHORT).show();
                }
            });

            llHomerefilmContainer.setGravity(Gravity.CENTER);
            llHomerefilmContainer.addView(recomFilmVew);
        }
    }

    class MyOnClickListener implements View.OnClickListener{

        private String url;
        public MyOnClickListener(String url) {
            this.url=url;
        }

        @Override
        public void onClick(View v) {
            if(v==iv_hofilmsh_0) {
                ToWebUtils.startToWebPager(mActivity, url);
            }else if(v==iv_hofilmsh_1) {
                ToWebUtils.startToWebPager(mActivity, url);
            }else if(v==iv_hofilmsh_2){
                ToWebUtils.startToWebPager(mActivity, url);
            } else if(v==iv_hofilmsh_4){
                ToWebUtils.startToWebPager(mActivity, url);
            }else if(v==llHoentry0){
                Intent intent = new Intent(mActivity, MTimeHotActivity.class);
                mActivity.startActivity(intent);
            } else if(v==llHoentry1){
                Intent intent = new Intent(mActivity, GlobalTopActivity.class);
                mActivity.startActivity(intent);
            }else if(v==llHoentry2){

            } else if(v==llHoentry3){

            }
        }
    }

    private void initHeadView() {

        viewPager = (AutoScrollViewPager) headView.findViewById(R.id.view_pager);
        llHomeheadContainer = (LinearLayout) headView.findViewById(R.id.ll_homehead_container);
        viewPager2 = (AutoScrollViewPager) headView.findViewById(R.id.view_pager2);
        llHomeheadContainer2 = (LinearLayout) headView.findViewById(R.id.ll_homehead_container2);

        etHosearchContent = (EditText) headView.findViewById(R.id.et_hosearch_content);
        ivHosearchScan = (ImageButton) headView.findViewById(R.id.iv_hosearch_scan);

        tvHomerefilmCity = (TextView) headView.findViewById(R.id.tv_homerefilm_city);
        tvHomerefilmCount = (TextView) headView.findViewById(R.id.tv_homerefilm_count);
        llHomerefilmContainer = (LinearLayout) headView.findViewById(R.id.ll_homerefilm_container);
        tvHomerefilmSooncount = (TextView) headView.findViewById(R.id.tv_homerefilm_sooncount);
        tvHomerefilmMoviecount = (TextView) headView.findViewById(R.id.tv_homerefilm_moviecount);

        tvHofilmsh0 = (TextView) headView.findViewById(R.id.tv_hofilmsh_0);
        tvHofilmsh01 = (TextView) headView.findViewById(R.id.tv_hofilmsh_01);
        tvHofilmsh1 = (TextView) headView.findViewById(R.id.tv_hofilmsh_1);
        tvHofilmsh11 = (TextView) headView.findViewById(R.id.tv_hofilmsh_11);
        tvHofilmsh2 = (TextView) headView.findViewById(R.id.tv_hofilmsh_2);
        tvHofilmsh21 = (TextView) headView.findViewById(R.id.tv_hofilmsh_21);
        tvHofilmsh3 = (TextView) headView.findViewById(R.id.tv_hofilmsh_3);
        tvHofilmsh31 = (TextView) headView.findViewById(R.id.tv_hofilmsh_31);
        tvHofilmsh4 = (TextView) headView.findViewById(R.id.tv_hofilmsh_4);
        tvHofilmsh41 = (TextView) headView.findViewById(R.id.tv_hofilmsh_41);
        tvHofilmsh5 = (TextView) headView.findViewById(R.id.tv_hofilmsh_5);
        tvHofilmsh51 = (TextView) headView.findViewById(R.id.tv_hofilmsh_51);
        iv_hofilmsh_0 = (ImageView) headView.findViewById(R.id.iv_hofilmsh_0);
        iv_hofilmsh_1 = (ImageView) headView.findViewById(R.id.iv_hofilmsh_1);
        iv_hofilmsh_2 = (ImageView) headView.findViewById(R.id.iv_hofilmsh_2);
        iv_hofilmsh_3 = (ImageView) headView.findViewById(R.id.iv_hofilmsh_3);
        iv_hofilmsh_4 = (ImageView) headView.findViewById(R.id.iv_hofilmsh_4);
        iv_hofilmsh_5 = (ImageView) headView.findViewById(R.id.iv_hofilmsh_5);

        tvHopointtiCategory = (TextView) headView.findViewById(R.id.tv_hopointti_category);
        tvHopointtiAll = (TextView) headView.findViewById(R.id.tv_hopointti_all);

        llHoentry0 = (LinearLayout) headView.findViewById(R.id.ll_hoentry0);
        ivHoentry0 = (ImageView) headView.findViewById(R.id.iv_hoentry0);
        tvHoentry0 = (TextView) headView.findViewById(R.id.tv_hoentry0);
        llHoentry1 = (LinearLayout) headView.findViewById(R.id.ll_hoentry1);
        ivHoentry1 = (ImageView) headView.findViewById(R.id.iv_hoentry1);
        tvHoentry1 = (TextView) headView.findViewById(R.id.tv_hoentry1);
        llHoentry2 = (LinearLayout) headView.findViewById(R.id.ll_hoentry2);
        ivHoentry2 = (ImageView) headView.findViewById(R.id.iv_hoentry2);
        tvHoentry2 = (TextView) headView.findViewById(R.id.tv_hoentry2);
        llHoentry3 = (LinearLayout) headView.findViewById(R.id.ll_hoentry3);
        ivHoentry3 = (ImageView) headView.findViewById(R.id.iv_hoentry3);
        tvHoentry4 = (TextView) headView.findViewById(R.id.tv_hoentry_4);
    }
}
