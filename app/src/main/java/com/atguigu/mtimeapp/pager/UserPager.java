package com.atguigu.mtimeapp.pager;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.activity.LoginActivity;
import com.atguigu.mtimeapp.activity.RegisterActivity;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.lixin.ShoppingCartActivity;

/**
 * Created by FlagWu on 2016/4/8.
 */
public class UserPager extends BasePager implements View.OnClickListener {

    private LinearLayout fl_user_top;
    private LinearLayout ll_tv_btn;
    private RadioGroup rg_shopinfo;
    private Button btn_cart ,btn_ticket,btn_goods,btn_card;
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
        btn_cart = (Button) view.findViewById(R.id.btn_cart);
        btn_ticket = (Button) view.findViewById(R.id.btn_ticket);
        btn_goods = (Button) view.findViewById(R.id.btn_goods);
        btn_card = (Button) view.findViewById(R.id.btn_card);
        tv_user_login = (TextView) view.findViewById(R.id.tv_user_login);
        tv_user_reg = (TextView) view.findViewById(R.id.tv_user_reg);

        btn_cart.setOnClickListener(this);
        btn_ticket.setOnClickListener(this);
        btn_goods.setOnClickListener(this);
        btn_card.setOnClickListener(this);


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

        tv_user_reg.setOnClickListener(new View.OnClickListener() {
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cart :
                Intent intent = new Intent(mActivity,ShoppingCartActivity.class);
                mActivity.startActivity(intent);
                break;
        }
    }
}
