package com.example.etablistview_library;

import android.app.Activity;
import android.view.View;

/**
 * Created by 笨货 on 2016/4/1.
 * Pager的基类
 */
public abstract class BasePager {

    public Activity mActivity;
    public View rootView;

    public BasePager(Activity mActivity) {
        this.mActivity = mActivity;
        rootView = initView();
    }

    /**
     * 子类必须实现，初始化布局
     *
     * @return
     */
    public abstract View initView();

    /**
     * 初始化数据，子类通过重写方法实现
     */
    public void initData() {

    }
}
