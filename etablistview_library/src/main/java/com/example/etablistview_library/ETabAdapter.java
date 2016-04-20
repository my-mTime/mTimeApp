package com.example.etablistview_library;

import android.view.View;
import android.widget.BaseAdapter;

/**
 * Created by 笨货 on 2016/3/21.
 * 自定义的Adapter
 */
public abstract class ETabAdapter extends BaseAdapter{

    /**
     * 设置更多的数据，子类必须实现
     * @param obj
     */
    public abstract void setMoreData(Object obj);

    /**
     * 判断是否已完成加载更多数据
     * @return
     */
    public abstract boolean isCompleteLoadMore();

    /**
     * 得到头布局
     * @return
     */
    public abstract View getHeadView();

}
