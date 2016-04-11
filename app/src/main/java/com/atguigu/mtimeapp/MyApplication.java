package com.atguigu.mtimeapp;

import android.app.Application;

import org.xutils.x;

import cn.smssdk.SMSSDK;

/**
 * Created by FlagWu on 2016/4/10.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        SMSSDK.initSDK(this, "您的appkey", "您的appsecret");
        x.Ext.init(this);//初始化xutils
        x.Ext.setDebug(true);
    }
}
