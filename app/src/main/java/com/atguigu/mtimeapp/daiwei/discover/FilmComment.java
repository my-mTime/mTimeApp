package com.atguigu.mtimeapp.daiwei.discover;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.mtimeapp.daiwei.DiscoverBasepage;

/**
 * Created by daiwei on 2016/4/13.
 *
 * 发现--影评页面
 */
public class FilmComment extends DiscoverBasepage {

    private TextView textView;

    public FilmComment(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        textView = new TextView(mActivity);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(25);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        Log.i("TAG", "发现--影评页面数据初始化");
        textView.setText("影评页面数据初始化");
    }
}
