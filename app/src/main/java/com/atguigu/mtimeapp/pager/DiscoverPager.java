package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.daiwei.DiscoverBasepage;
import com.atguigu.mtimeapp.daiwei.discover.FilmComment;
import com.atguigu.mtimeapp.daiwei.discover.Leaderboard;
import com.atguigu.mtimeapp.daiwei.discover.News;
import com.atguigu.mtimeapp.daiwei.discover.Prevue;

import java.util.ArrayList;

/**
 * Created by FlagWu on 2016/4/8.
 *
 * 发现页面
 */
public class DiscoverPager extends BasePager{
    private TabLayout tl_discover_tab;
    private ViewPager vp_discover_viewPager;
    private ArrayList<String> titles;
    private ArrayList<DiscoverBasepage> DiscoverPages;

    public DiscoverPager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.activity_discover, null);

        tl_discover_tab = (TabLayout)view.findViewById(R.id.tl_discover_tab);
        vp_discover_viewPager = (ViewPager)view.findViewById(R.id.vp_discover_viewPager);

        titles = new ArrayList<>();
        titles.add("新闻");
        titles.add("预告片");
        titles.add("排行榜");
        titles.add("影评");

        vp_discover_viewPager.setAdapter(new MyAdapter());
        tl_discover_tab.setTabMode(TabLayout.MODE_FIXED);
        tl_discover_tab.setupWithViewPager(vp_discover_viewPager);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        DiscoverPages = new ArrayList<>();
        DiscoverPages.add(new News(mActivity));
        DiscoverPages.add(new Prevue(mActivity));
        DiscoverPages.add(new Leaderboard(mActivity));
        DiscoverPages.add(new FilmComment(mActivity));
    }

    private class MyAdapter extends PagerAdapter {

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }

        @Override
        public int getCount() {
            return titles.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            DiscoverBasepage discoverBasepage = DiscoverPages.get(position);
            View view = discoverBasepage.childView;
            discoverBasepage.initData();
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
