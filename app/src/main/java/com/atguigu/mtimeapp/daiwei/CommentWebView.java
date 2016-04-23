package com.atguigu.mtimeapp.daiwei;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.daiwei.domain.ReviewDetailEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/22.
 */
public class CommentWebView extends Activity {

    private WebView wv_webView;
    private TextView tv_title_name;
    private ImageView iv_title_back;
    private ImageView iv_title_like;
    private ImageView iv_title_share;
    private String url;
    private int type;
    private int review = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        initView();
        initData();

//        wv_webView.loadDataWithBaseURL();
    }

    private void initData() {
        int reviewId = getIntent().getIntExtra("reviewId", -1);
        if(reviewId != -1) {
            type = review;
            url = ContantsUtils.film_comment +"reviewId="+reviewId;
        }
        getNetData(url);
    }

    /**
     * 得到网络数据
     */
    private void getNetData(String url) {
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG", "onError==" + e);
            }

            @Override
            public void onResponse(String response) {
                processData(response);
            }
        });
    }

    /**
     * 处理数据
     * @param json
     */
    private void processData(String json) {
        switch (type) {
            case 1 :
                ReviewDetailEntity reviewDetailEntity = parseJson(json);

                break;
        }
    }

    /**
     * 解析json数据
     * @param json
     */
    private ReviewDetailEntity parseJson(String json) {
        return new Gson().fromJson(json, ReviewDetailEntity.class);
    }

    private void initView() {
        wv_webView = (WebView)findViewById(R.id.wv_webView);
        tv_title_name = (TextView)findViewById(R.id.tv_title_name);
        iv_title_back = (ImageView)findViewById(R.id.iv_title_back);
        iv_title_like = (ImageView)findViewById(R.id.iv_title_like);
        iv_title_share = (ImageView)findViewById(R.id.iv_title_share);
        WebSettings settings = wv_webView.getSettings();
        settings.setJavaScriptEnabled(true);
    }
}
