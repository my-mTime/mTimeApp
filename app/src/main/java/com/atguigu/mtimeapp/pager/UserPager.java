package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.activity.LoginActivity;
import com.atguigu.mtimeapp.activity.RegisterActivity;
import com.atguigu.mtimeapp.base.BasePager;

/**
 * Created by FlagWu on 2016/4/8.
 */
public class UserPager extends BasePager {

    private LinearLayout fl_user_top;
    private LinearLayout ll_tv_btn;
    private RadioGroup rg_shopinfo;
    private TextView tv_user_login;
    private TextView tv_user_reg;


    public UserPager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.user_pager, null);
        fl_user_top = (LinearLayout) view.findViewById(R.id.ll_user_top);
        ll_tv_btn = (LinearLayout) view.findViewById(R.id.ll_tv_btn);
        rg_shopinfo = (RadioGroup) view.findViewById(R.id.rg_shopinfo);
        tv_user_login = (TextView) view.findViewById(R.id.tv_user_login);
        tv_user_reg = (TextView) view.findViewById(R.id.tv_user_reg);

        MyOnClickListener();
        return view;
    }

    public void MyOnClickListener(){
        tv_user_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mActivity, LoginActivity.class);
                mActivity.startActivity(intent);
            }
        });

        tv_user_reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mActivity, RegisterActivity.class);
                mActivity.startActivity(intent);
            }
        });
    }

    @Override
    public void initData() {
        super.initData();
    }
}
