package com.example.citylist_demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;
import java.util.Map;

import okhttp3.Request;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private CityListBean cityListBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url="http://api.m.mtime.cn/Showtime/HotCitiesByCinema.api";
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Request request, Exception e) {
                        Log.e(TAG, "e=" + e.toString());
                    }

                    @Override
                    public void onResponse(String response) {
                        Log.e(TAG, "success");
                        cityListBean = new Gson().fromJson(response, CityListBean.class);
                        List<CityListBean.PEntity> p = cityListBean.getP();
                        Map<String, List<CityListBean.PEntity>> sortCityListMap = CityListSort.putListData(p);

                        List<CityListBean.PEntity> a = sortCityListMap.get("D");
                        for (int i = 0; i < a.size(); i++) {
                            Log.e(TAG, "d="+a.get(i).getN());
                        }
                    }
                });

    }
}
