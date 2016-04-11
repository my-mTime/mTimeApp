package com.atguigu.mtimeapp.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by 笨货 on 2016/3/21.
 * 自定义的Adapter
 */
public abstract class MyBaseAdapter extends BaseAdapter{


    public String getId;
    public String getType;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    //设置更多的数据，子类必须实现
    public abstract void setMoreData(Object obj);

    public abstract boolean isCompleteLoadMore();

    public abstract View getHeadView();

}
