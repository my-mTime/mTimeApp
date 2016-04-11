package com.atguigu.mtimeapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.NetUtils;


public class FirstActivity extends Activity {

    private ImageView iv_logo;
    private ImageView iv_top_left;

    private WebView wv_top;
    private WebSettings settings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        setContentView(R.layout.activity_first);
        iv_logo = (ImageView)findViewById(R.id.iv_logo);
        iv_top_left = (ImageView)findViewById(R.id.iv_top_left);
        wv_top = (WebView)findViewById(R.id.wv_top);
    }

    private void initData() {
        iv_logo.setVisibility(View.VISIBLE);
        wv_top.loadUrl(NetUtils.HOME_TOP_FIRST);
        settings = wv_top.getSettings();

        settings.setJavaScriptEnabled(true);

        settings.setBuiltInZoomControls(true);//如果加载的页面是可以缩放，显示支持缩放按钮

        settings.setUseWideViewPort(true);//支持双击屏幕放大缩小

    }
}
