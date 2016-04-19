package com.atguigu.mtimeapp.utils;

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

/**
 * Created by 杨勇康 on 2016/4/13 0013.
 * 定位服务工具类
 */
public class LocatorUtils {

    public static LocationClient mLocationClient;
    public static MyLocationListener myLocationListener;

    //定位设置相关参数
    public static void setLocationOption(Context context, TextView textView){
        mLocationClient = new LocationClient(context);
        myLocationListener = new MyLocationListener(textView);
        mLocationClient.registerLocationListener(myLocationListener);
        LocationClientOption option = new LocationClientOption();
        option.setCoorType("bd09ll");
        option.setScanSpan(10000);// 10分钟扫描1次
        option.setOpenGps(true); //打开gps
        option.setServiceName("com.baidu.location.service_v2.9");
        // 设置是否返回POI的电话和地址等详细信息。默认值为false，即不返回POI的电话和地址信息。
        option.setPoiExtraInfo(true);
        // 需要地址信息，设置为其他任何值（string类型，且不能为null）时，都表示无地址信息。
        option.setAddrType("all");
        option.setPriority(LocationClientOption.NetWorkFirst);//网络
        option.setPriority(LocationClientOption.GpsFirst); //gps
        option.setPoiNumber(3);
        //禁用启用缓存定位数据
        option.disableCache(true);
        mLocationClient.setLocOption(option);
        mLocationClient.start();
    }
    //实现定位
    static class MyLocationListener implements BDLocationListener {
        private TextView textView;
        public MyLocationListener(TextView textView) {
            this.textView = textView;
        }

        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            if(bdLocation.getCity() == null) {
//                textView.setText("定位失败，请选择城市");
            }else {
                textView.setText(bdLocation.getCity());
                Log.e("TAG", "bdLocation.getCity():" + bdLocation.getCity());
                mLocationClient.stop();
            }
        }
        @Override
        public void onReceivePoi(BDLocation bdLocation) {

        }
    }

}
