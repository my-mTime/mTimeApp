package com.atguigu.mtimeapp.daiwei;

import android.app.Activity;
import android.view.View;

/**
 * Created by daiwei on 2016/4/11.
 *
 * 发现页面基类
 */
public abstract class DiscoverBasepage {

    public final Activity mActivity;
//    public static View view;
    /**
     * 是否初始化视图
     */
//    private boolean flag = false;
    public final View childView;
//    public DiscoverHeaderEntity headerEntity;
//    public ListView lv_discover;
//    public TextView tv_disconver_header_title;
//    public ImageView iv_header_bg;
//    public TextView tv_disconver_header_name;
//    public TextView tv_header_news_old;
//    public ImageView ib_header_prevue_play;
//    public ImageView iv_header_filmComment_icon;
//    public LinearLayout ll_header_news_ticketList;
//    public RadioGroup rg_header_leaderboard_topList;

    public DiscoverBasepage(Activity activity) {
        this.mActivity = activity;
        this.childView = initView();

//        if(!flag){
//            flag = true;
//            view = initView();
//        }

    }

//    private View initView() {
//        lv_discover = (ListView) View.inflate(mActivity, R.layout.discover, null);
//        View header = View.inflate(mActivity, R.layout.discover_header, null);
//        lv_discover.addHeaderView(header);
//
//        tv_disconver_header_title = (TextView) header.findViewById(R.id.tv_disconver_header_title);
//        iv_header_bg = (ImageView) header.findViewById(R.id.iv_header_bg);
//        iv_header_filmComment_icon = (ImageView) header.findViewById(R.id.iv_header_filmComment_icon);
//        tv_disconver_header_name = (TextView) header.findViewById(R.id.tv_disconver_header_name);
//        tv_header_news_old = (TextView) header.findViewById(R.id.tv_header_news_old);
//
//        ll_header_news_ticketList = (LinearLayout) header.findViewById(R.id.ll_header_news_ticketList);
//        rg_header_leaderboard_topList = (RadioGroup) header.findViewById(R.id.rg_header_leaderboard_topList);
//        ib_header_prevue_play = (ImageView) header.findViewById(R.id.ib_header_prevue_play);
//
//        return lv_discover;
//    }

    public abstract View initView();


    public void initData(){}
}
