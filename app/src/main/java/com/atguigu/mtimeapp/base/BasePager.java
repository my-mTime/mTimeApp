package com.atguigu.mtimeapp.base;

import android.app.Activity;
import android.view.View;

/**
 * Created by FlagWu on 2016/4/8.
 */
public abstract class BasePager {


    /**
     * 根视图/子类视图
     */
    public View rootView;
    /**
     * 上下文
     */
    public final Activity mActivity;



    public BasePager(Activity activity){
        this.mActivity = activity;

        rootView = initView();
    }

    /**
     * 子类强制实现该方法
     * @return
     */
    public abstract View initView();

    /**
     * 子类需要数据时实现该方法
     */
    public void initData(){

    }
}
