package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.mtimeapp.base.BasePager;

/**
 * Created by FlagWu on 2016/4/8.
 */
public class DiscoverPager extends BasePager{
    private TextView textView;

    public DiscoverPager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        textView = new TextView(mActivity);
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    @Override
    public void initData() {
        super.initData();
        textView.setText("发现页");
    }
}
