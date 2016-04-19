package com.atguigu.mtimeapp.yangyongkang;

import android.app.Application;

import org.xutils.x;

import cn.smssdk.SMSSDK;

/**
 * Created by FlagWu on 2016/4/10.
 */
public class MyApplication extends Application{

    public static int id;
    public static String cityname;

    @Override
    public void onCreate() {
        super.onCreate();
        SMSSDK.initSDK(this, "您的appkey", "您的appsecret");
        x.Ext.init(this);//初始化xutils
        x.Ext.setDebug(true);
    }

    public static void putCityIno(int cityid, String name) {
        id = cityid;
        cityname = name;
    }

    public static int getId() {
        return id;
    }

    public static String getCityname() {
        return cityname;
    }
}
