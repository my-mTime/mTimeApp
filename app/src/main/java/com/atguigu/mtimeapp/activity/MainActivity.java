package com.atguigu.mtimeapp.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.pager.BuyTicketPager;
import com.atguigu.mtimeapp.pager.DiscoverPager;
import com.atguigu.mtimeapp.pager.HomePager;
import com.atguigu.mtimeapp.pager.UserPager;
import com.atguigu.mtimeapp.pager.StorePager;

import java.util.ArrayList;

/**
 * Created by FlagWu on 2016/4/8.
 */
public class MainActivity extends FragmentActivity {

    private FrameLayout fl_content_main;
    private RadioGroup rg_bottom;

    /**
     * 代表各个页面
     */
    private int position;

    /**
     * 装载各个页面的集合
     */
    private ArrayList<BasePager> basePagers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initPager();
    }

    /**
     * 初始化视图
     */
    private void initView() {
        setContentView(R.layout.activity_main);
        fl_content_main = (FrameLayout) findViewById(R.id.fl_content_main);
        rg_bottom = (RadioGroup) findViewById(R.id.rg_bottom);
    }

    /**
     *初始化各个页面
     */
    private void initPager() {
        basePagers = new ArrayList<>();
        basePagers.add(new HomePager(this));
        basePagers.add(new BuyTicketPager(this));
        basePagers.add(new StorePager(this));
        basePagers.add(new DiscoverPager(this));
        basePagers.add(new UserPager(this));

        rg_bottom.setOnCheckedChangeListener(new MainOnCheckedChangeListener());
        //默认选中第一个
        rg_bottom.check(R.id.rb_home);

    }

    /**
     * 初始化数据
     */
    private void initData() {

    }

    private class MainOnCheckedChangeListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.rb_home:
                    position = 0;
                    break;
                case R.id.rb_BuyTicket:
                    position = 1;
                    break;
                case R.id.rb_store:
                    position = 2;
                    break;
                case R.id.rb_discover:
                    position = 3;
                    break;
                case R.id.rb_user:
                    position = 4;
                    break;
            }

            setFragment();
        }
    }

    /**
     * 根据所点击的按钮，把Fragment切换为相应页面
     */
    private void setFragment() {
        //得到FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        //开启事物
        FragmentTransaction ft = fm.beginTransaction();
        //替换视图
        ft.replace(R.id.fl_content_main, new Fragment(){
            @Nullable
            @Override
            public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                BasePager basePager = getBasePager();
                if(basePager != null) {
                    return basePager.rootView;
                }
                return null;
            }
        });
        //提交事务
        ft.commit();
    }

    public BasePager getBasePager() {
        BasePager basePager = basePagers.get(position);
        if (basePager != null){
            basePager.initData();//初始化数据
        }
        return basePager;
    }

}
