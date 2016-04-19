package com.atguigu.mtimeapp.daiwei;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.atguigu.mtimeapp.daiwei.domain.DiscoverHeaderEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/11.
 *
 * 发现页面基类
 */
public abstract class DiscoverBasepage {

    public final Activity mActivity;
    public final View childView;
    private DiscoverHeaderEntity headerEntity;

    public DiscoverBasepage(Activity activity) {
        this.mActivity = activity;
        this.childView = initView();

        getHeaderDataFromNet();
    }

    public abstract View initView();


    public void initData(){}

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

                ProcessData(response);
            }
        });
    }

    private void ProcessData(String response){
        headerEntity = new Gson().fromJson(response, DiscoverHeaderEntity.class);


    }

}
