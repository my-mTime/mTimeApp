package com.atguigu.mtimeapp.lixin;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/13.
 * 全球票行榜的ViewPager
 */
public class GlobalTopPagerAdapter extends PagerAdapter {

    private Context context;
    private List<GlobalTopTagBean.TopListEntity> topList;

    public GlobalTopPagerAdapter(Context context, List<GlobalTopTagBean.TopListEntity> topList) {
        this.context = context;
        this.topList = topList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
