package com.atguigu.mtimeapp.lixin;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.bigkoo.snappingstepper.SnappingStepper;
import com.bigkoo.snappingstepper.listener.SnappingStepperValueChangeListener;

public class ShoppingCartActivity extends Activity implements SnappingStepperValueChangeListener, CompoundButton.OnCheckedChangeListener {

    private LinearLayout llShoppingcartContainer;
    private LinearLayout llShoppingcartCheckall;
    private TextView tvShoppingcartTotalprice;
    private TextView tvShoppingcartHascollet;
    private CheckBox cb_all;
    private Button btnShoppingcartAccount;

    private CheckBox ivShoppingcartChecked;
    private boolean ischeck;
    private TextView tvShoppingcartName;
    private ImageView ivShoppingcartPic;
    private SnappingStepper stepper;
    private TextView tvShoppingcartCurrprice;
    private TextView tvShoppingcartOriprice;
    private TextView tvShoppingcartCount;
    private View itemView;


    private double titalpice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);

        itemView = View.inflate(this, R.layout.item_shoppingcart, null);

        initView();

        initData();
    }

    private void initData() {
        stepper.setOnValueChangeListener(this);

        ivShoppingcartChecked.setOnCheckedChangeListener(this);

        llShoppingcartContainer.addView(itemView);
    }

    private void initView() {

        llShoppingcartContainer = (LinearLayout) findViewById(R.id.ll_shoppingcart_container);
        llShoppingcartCheckall = (LinearLayout) findViewById(R.id.ll_shoppingcart_checkall);
        tvShoppingcartTotalprice = (TextView) findViewById(R.id.tv_shoppingcart_totalprice);
        tvShoppingcartHascollet = (TextView) findViewById(R.id.tv_shoppingcart_hascollet);
        cb_all = (CheckBox)findViewById(R.id.cb_all);
        btnShoppingcartAccount = (Button) findViewById(R.id.btn_shoppingcart_account);

        ivShoppingcartChecked = (CheckBox)itemView.findViewById(R.id.iv_shoppingcart_checked);

        tvShoppingcartName = (TextView)itemView.findViewById(R.id.tv_shoppingcart_name);
        ivShoppingcartPic = (ImageView)itemView.findViewById(R.id.iv_shoppingcart_pic);
        stepper = (SnappingStepper)itemView.findViewById(R.id.stepper);
        tvShoppingcartCurrprice = (TextView)itemView.findViewById(R.id.tv_shoppingcart_currprice);
        tvShoppingcartOriprice = (TextView)itemView.findViewById(R.id.tv_shoppingcart_oriprice);
        tvShoppingcartOriprice.getPaint().setFlags(Paint. STRIKE_THRU_TEXT_FLAG ); //中间横线
        tvShoppingcartCount = (TextView)itemView.findViewById( R.id.tv_shoppingcart_count );
    }

    @Override
    public void onValueChange(View view, int value) {
        switch (view.getId()) {
            case  R.id.stepper:
                double pic = Double.parseDouble(tvShoppingcartCurrprice.getText().toString());
                titalpice = value * pic;
                Toast.makeText(ShoppingCartActivity.this, titalpice+"", Toast.LENGTH_SHORT).show();
                tvShoppingcartCount.setText("x"+value);
                break;
        }
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        this.ischeck = isChecked;
        if(isChecked) {
//            double titalpic =
            tvShoppingcartTotalprice.setText(titalpice+"");
            btnShoppingcartAccount.setText("结算（"+titalpice+")");
        }else {
            tvShoppingcartTotalprice.setText("0");
            btnShoppingcartAccount.setText("结算(0)");
        }
    }
}
