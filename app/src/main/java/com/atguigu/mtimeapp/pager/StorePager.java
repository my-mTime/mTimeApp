package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.adapter.StoreAdapter;
import com.atguigu.mtimeapp.adapter.StoreTopicAdapter;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.domain.StoreBean;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.atguigu.mtimeapp.view.MyGrideView;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.example.benhuo_library.lib.utils.image.utils.DensityUtils;
import com.google.gson.Gson;
import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;
import okhttp3.Request;

/**
 * Created by FlagWu on 2016/4/8.
 * 商城界面
 */
public class StorePager extends BasePager {

    //头布局
    private AutoScrollViewPager vpScrollImage;
    private LinearLayout llPointContainer;
    //导航
    private ImageView ivStorenavi0;
    private TextView tvStorenavi0;
    private ImageView ivStorenavi1;
    private TextView tvStorenavi1;
    private ImageView ivStorenavi2;
    private TextView tvStorenavi2;
    private ImageView ivStorenavi3;
    private TextView tvStorenavi3;
    private ImageView ivStorenavi4;
    private TextView tvStorenavi4;
    private ImageView ivStorenavi5;
    private TextView tvStorenavi5;
    private ImageView ivStorenavi6;
    private TextView tvStorenavi6;
    private ImageView ivStorenavi7;
    private TextView tvStorenavi7;
    //更多商品
    private ImageView ivStoreliheBg;
    private ImageView ivStorelihe0;
    private ImageView ivStorelihe1;
    private ImageView ivStorelihe2;
    private ImageView ivStorelihe3;
    private TextView tvStoreliheEn;
    private TextView tvStoreliheCn;
    private MyGrideView gvStorelihe;
    private TextView tvStoreliheMore;
    //cell
    private ImageView ivStoreitem0;
    private ImageView ivStoreitem1;
    private ImageView ivStoreitem2;
    private ImageView ivStoreitem3;

    private PullToRefreshListView lv_storepager;
    private View headView;
    private StoreTopicAdapter storeTopicAdapter;
    //topic 的数据
    private List<StoreBean.TopicEntity.SubListEntity> subList;

    public StorePager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.store_pager_list, null);

        headView = View.inflate(mActivity, R.layout.store_list_head, null);

        initHeadView(headView);

        lv_storepager = (PullToRefreshListView) view.findViewById(R.id.lv_storepager);

        return view;
    }

    @Override
    public void initData() {
        super.initData();

        //联网请求
        OkHttpUtils.get().url(ContantsUtils.STORE_URL).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                StoreBean storeBean = new Gson().fromJson(response, StoreBean.class);

                List<StoreBean.CategoryEntity> category = storeBean.getCategory();
                ListView refreshableView = lv_storepager.getRefreshableView();
                //添加头布局
                refreshableView.addHeaderView(headView);
                int measuredHeight = vpScrollImage.getMeasuredHeight();
                Log.e("TAG", "measuredHeight=" + measuredHeight);
                int height = vpScrollImage.getHeight();
                Log.e("TAG", "height=" + height);
                int minimumHeight = vpScrollImage.getMinimumHeight();
                Log.e("TAG", "minimumHeight=" + minimumHeight);
                Log.e("TAG", "headViewHeight="+headView.getHeight());
                Log.e("TAG", "headViewMeasureHeight="+headView.getMeasuredHeight());

                List<StoreBean.ScrollImgEntity> scrollImg = storeBean.getScrollImg();
                //添加轮播图
                addAdView(scrollImg);

                List<StoreBean.NavigatorIconEntity> navigatorIcon = storeBean.getNavigatorIcon();
                //添加导航
                addNavigator(navigatorIcon);

                List<StoreBean.TopicEntity> topic = storeBean.getTopic();
                //添加更多
                addMoreShop(topic);

                //添加cell
                StoreBean.CellAEntity cellA = storeBean.getCellA();
                StoreBean.CellBEntity cellB = storeBean.getCellB();
                StoreBean.CellCEntity cellC = storeBean.getCellC();
                ImageUtils.loadImage(mActivity, cellA.getImg(), ivStoreitem0);
                ImageUtils.loadImage(mActivity, cellB.getImg(), ivStoreitem3);
                StoreBean.CellCEntity.ListEntity listEntity0 = cellC.getList().get(0);
                StoreBean.CellCEntity.ListEntity listEntity1 = cellC.getList().get(1);
                ImageUtils.loadImage(mActivity, listEntity0.getImage(), ivStoreitem1);
                ImageUtils.loadImage(mActivity, listEntity1.getImage(), ivStoreitem2);

                lv_storepager.setAdapter(new StoreAdapter(mActivity, category));

            }
        });


    }

    /**
     * 添加更多商品
     *
     * @param topic
     */
    private void addMoreShop(List<StoreBean.TopicEntity> topic) {
        StoreBean.TopicEntity topic0 = topic.get(0);
        ImageUtils.loadImage(mActivity, topic0.getCheckedImage(), ivStorelihe0, R.drawable.img_default_45x45);
        ImageUtils.loadImage(mActivity, topic0.getBackgroupImage(), ivStoreliheBg);
        tvStoreliheEn.setText(topic0.getTitleEn());
        tvStoreliheCn.setText(topic0.getTitleCn());

        StoreBean.TopicEntity topic1 = topic.get(1);
        ImageUtils.loadImage(mActivity, topic1.getUncheckImage(), ivStorelihe1, R.drawable.img_default_45x45);

        StoreBean.TopicEntity topic2 = topic.get(2);
        ImageUtils.loadImage(mActivity, topic2.getUncheckImage(), ivStorelihe2, R.drawable.img_default_45x45);

        StoreBean.TopicEntity topic3 = topic.get(3);
        ImageUtils.loadImage(mActivity, topic3.getUncheckImage(), ivStorelihe3, R.drawable.img_default_45x45);

        subList = topic0.getSubList();
        storeTopicAdapter = new StoreTopicAdapter(mActivity, subList);
        gvStorelihe.setAdapter(storeTopicAdapter);

        //设置点击事件
        ivStorelihe0.setOnClickListener(new TopicOnClickListener(topic));
        ivStorelihe1.setOnClickListener(new TopicOnClickListener(topic));
        ivStorelihe2.setOnClickListener(new TopicOnClickListener(topic));
        ivStorelihe3.setOnClickListener(new TopicOnClickListener(topic));
    }

    class TopicOnClickListener implements View.OnClickListener {

        private List<StoreBean.TopicEntity> topic;

        public TopicOnClickListener(List<StoreBean.TopicEntity> topic) {
            this.topic = topic;
        }

        @Override
        public void onClick(View v) {
            ImageUtils.loadImage(mActivity, topic.get(0).getUncheckImage(), ivStorelihe0);
            ImageUtils.loadImage(mActivity, topic.get(1).getUncheckImage(), ivStorelihe1);
            ImageUtils.loadImage(mActivity, topic.get(2).getUncheckImage(), ivStorelihe2);
            ImageUtils.loadImage(mActivity, topic.get(3).getUncheckImage(), ivStorelihe3);
            switch (v.getId()) {
                case R.id.iv_storelihe_0:
                    ImageUtils.loadImage(mActivity, topic.get(0).getCheckedImage(), ivStorelihe0);
                    ImageUtils.loadImage(mActivity, topic.get(0).getBackgroupImage(), ivStoreliheBg);
                    tvStoreliheEn.setText(topic.get(0).getTitleEn());
                    tvStoreliheCn.setText(topic.get(0).getTitleCn());
                    subList = topic.get(0).getSubList();
                    break;
                case R.id.iv_storelihe_1:
                    ImageUtils.loadImage(mActivity, topic.get(1).getCheckedImage(), ivStorelihe1);
                    ImageUtils.loadImage(mActivity, topic.get(1).getBackgroupImage(), ivStoreliheBg);
                    tvStoreliheEn.setText(topic.get(1).getTitleEn());
                    tvStoreliheCn.setText(topic.get(1).getTitleCn());
                    subList = topic.get(1).getSubList();
                    break;
                case R.id.iv_storelihe_2:
                    ImageUtils.loadImage(mActivity, topic.get(2).getCheckedImage(), ivStorelihe2);
                    ImageUtils.loadImage(mActivity, topic.get(2).getBackgroupImage(), ivStoreliheBg);
                    tvStoreliheEn.setText(topic.get(2).getTitleEn());
                    tvStoreliheCn.setText(topic.get(2).getTitleCn());
                    subList = topic.get(2).getSubList();
                    break;
                case R.id.iv_storelihe_3:
                    ImageUtils.loadImage(mActivity, topic.get(3).getCheckedImage(), ivStorelihe3);
                    ImageUtils.loadImage(mActivity, topic.get(3).getBackgroupImage(), ivStoreliheBg);
                    tvStoreliheEn.setText(topic.get(3).getTitleEn());
                    tvStoreliheCn.setText(topic.get(3).getTitleCn());
                    subList = topic.get(3).getSubList();
                    break;
            }

            storeTopicAdapter = new StoreTopicAdapter(mActivity, subList);
//            storeTopicAdapter.notifyDataSetChanged();
            gvStorelihe.setAdapter(storeTopicAdapter);
        }
    }

    /**
     * 添加导航
     *
     * @param navigatorIcon
     */
    private void addNavigator(List<StoreBean.NavigatorIconEntity> navigatorIcon) {
        StoreBean.NavigatorIconEntity navigator0 = navigatorIcon.get(0);
        tvStorenavi0.setText(navigator0.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator0.getImage(), ivStorenavi0, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator1 = navigatorIcon.get(1);
        tvStorenavi1.setText(navigator1.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator1.getImage(), ivStorenavi1, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator2 = navigatorIcon.get(2);
        tvStorenavi2.setText(navigator2.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator2.getImage(), ivStorenavi2, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator3 = navigatorIcon.get(3);
        tvStorenavi3.setText(navigator3.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator3.getImage(), ivStorenavi3, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator4 = navigatorIcon.get(4);
        tvStorenavi4.setText(navigator4.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator4.getImage(), ivStorenavi4, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator5 = navigatorIcon.get(5);
        tvStorenavi5.setText(navigator5.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator5.getImage(), ivStorenavi5, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator6 = navigatorIcon.get(6);
        tvStorenavi6.setText(navigator6.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator6.getImage(), ivStorenavi6, R.drawable.img_default_45x45);

        StoreBean.NavigatorIconEntity navigator7 = navigatorIcon.get(7);
        tvStorenavi7.setText(navigator7.getIconTitle());
        ImageUtils.loadImage(mActivity, navigator7.getImage(), ivStorenavi7, R.drawable.img_default_45x45);
    }

    /**
     * 添加轮播图
     *
     * @param scrollImg
     */
    private void addAdView(List<StoreBean.ScrollImgEntity> scrollImg) {
        setAutoAdParams(vpScrollImage, llPointContainer, scrollImg.size());
        vpScrollImage.setAdapter(new AdViewAdapter(scrollImg));
        vpScrollImage.setCurrentItem((Integer.MAX_VALUE / 2 - Integer.MAX_VALUE / 2 % scrollImg.size()));
        vpScrollImage.startAutoScroll();
    }

    class AdViewAdapter extends PagerAdapter {

        private List<StoreBean.ScrollImgEntity> scrollImg;

        public AdViewAdapter(List<StoreBean.ScrollImgEntity> scrollImg) {
            this.scrollImg = scrollImg;
        }

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
            ImageUtils.loadImage(mActivity, scrollImg.get(position % scrollImg.size()).getImage(), imageView, R.drawable.img_default_300x200);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }

    private int prePos;

    private void setAutoAdParams(AutoScrollViewPager viewPager, final LinearLayout llPointContainer, final int size) {
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

        addAdPoint(llPointContainer, size);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //把上一次设为默认
                llPointContainer.getChildAt(prePos % size).setSelected(false);
                //当前设为红点
                llPointContainer.getChildAt(position % size).setSelected(true);
                //当前赋值给上次
                prePos = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    /**
     * 添加小圆点
     *
     * @param ll_container
     */
    private void addAdPoint(LinearLayout ll_container, int count) {
        ll_container.removeAllViews();
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
            ll_container.addView(point);
        }
    }

    /**
     * 初始化头布局
     *
     * @param headView
     */
    private void initHeadView(View headView) {
        vpScrollImage = (AutoScrollViewPager) headView.findViewById(R.id.vp_scroll_image);
        llPointContainer = (LinearLayout) headView.findViewById(R.id.ll_point_container);
        ivStorenavi0 = (ImageView) headView.findViewById(R.id.iv_storenavi0);
        tvStorenavi0 = (TextView) headView.findViewById(R.id.tv_storenavi0);
        ivStorenavi1 = (ImageView) headView.findViewById(R.id.iv_storenavi1);
        tvStorenavi1 = (TextView) headView.findViewById(R.id.tv__storenavi1);
        ivStorenavi2 = (ImageView) headView.findViewById(R.id.iv_storenavi2);
        tvStorenavi2 = (TextView) headView.findViewById(R.id.tv_storenavi2);
        ivStorenavi3 = (ImageView) headView.findViewById(R.id.iv_storenavi3);
        tvStorenavi3 = (TextView) headView.findViewById(R.id.tv_storenavi3);
        ivStorenavi4 = (ImageView) headView.findViewById(R.id.iv_storenavi4);
        tvStorenavi4 = (TextView) headView.findViewById(R.id.tv_storenavi4);
        ivStorenavi5 = (ImageView) headView.findViewById(R.id.iv_storenavi5);
        tvStorenavi5 = (TextView) headView.findViewById(R.id.tv__storenavi5);
        ivStorenavi6 = (ImageView) headView.findViewById(R.id.iv_storenavi6);
        tvStorenavi6 = (TextView) headView.findViewById(R.id.tv_storenavi6);
        ivStorenavi7 = (ImageView) headView.findViewById(R.id.iv_storenavi7);
        tvStorenavi7 = (TextView) headView.findViewById(R.id.tv_storenavi7);
        ivStoreliheBg = (ImageView) headView.findViewById(R.id.iv_storelihe_bg);
        ivStorelihe0 = (ImageView) headView.findViewById(R.id.iv_storelihe_0);
        ivStorelihe1 = (ImageView) headView.findViewById(R.id.iv_storelihe_1);
        ivStorelihe2 = (ImageView) headView.findViewById(R.id.iv_storelihe_2);
        ivStorelihe3 = (ImageView) headView.findViewById(R.id.iv_storelihe_3);
        tvStoreliheEn = (TextView) headView.findViewById(R.id.tv_storelihe_en);
        tvStoreliheCn = (TextView) headView.findViewById(R.id.tv_storelihe_cn);
        gvStorelihe = (MyGrideView) headView.findViewById(R.id.gv_storelihe);
        tvStoreliheMore = (TextView) headView.findViewById(R.id.tv_storelihe_more);
        ivStoreitem0 = (ImageView) headView.findViewById(R.id.iv_storeitem_0);
        ivStoreitem1 = (ImageView) headView.findViewById(R.id.iv_storeitem_1);
        ivStoreitem2 = (ImageView) headView.findViewById(R.id.iv_storeitem_2);
        ivStoreitem3 = (ImageView) headView.findViewById(R.id.iv_storeitem_3);
    }
}
