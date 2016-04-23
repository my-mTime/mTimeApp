package com.atguigu.mtimeapp.lixin;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;

/**
 * 全球票房榜
 */
public class GlobalTopActivity extends Activity {

    private ViewPager vp_globaltop;
    private TabLayout tablayout_indicator;
    private ImageView iv_title_back;
    private TextView tv_title_name;
    private ImageView iv_title_show;
    private TextView tv_globaltop_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_top);

        initView();
        initData();
    }

    private void initData() {
        iv_title_show.setVisibility(View.VISIBLE);

        OkHttpUtils.get().url(ContantsUtils.GLOBAL_TOP_TAG).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                GlobalTopTagBean topTagBean = new Gson().fromJson(response, GlobalTopTagBean.class);
                List<GlobalTopTagBean.TopListEntity> topList = topTagBean.getTopList();
                setDetailData(topList);
            }
        });


    }

    /**
     * 得到列表数据
     * @param topList
     */
    private void setDetailData(List<GlobalTopTagBean.TopListEntity> topList) {
        vp_globaltop.setAdapter(new GlobalTopPagerAdapter(this,topList));
        //TabLayout关联ViewPager
        tablayout_indicator.setupWithViewPager(vp_globaltop);
        //一定要设置设置滚动模式
        tablayout_indicator.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    private void initView() {
        vp_globaltop = (ViewPager)findViewById(R.id.vp_globaltop);
        tablayout_indicator = (TabLayout)findViewById(R.id.tablayout_indicator);
        iv_title_back = (ImageView)findViewById(R.id.iv_title_back);
        tv_title_name = (TextView)findViewById(R.id.tv_title_name);
        iv_title_show = (ImageView)findViewById(R.id.iv_title_share);
        tv_globaltop_title = (TextView)findViewById(R.id.tv_globaltop_title);
    }
}
