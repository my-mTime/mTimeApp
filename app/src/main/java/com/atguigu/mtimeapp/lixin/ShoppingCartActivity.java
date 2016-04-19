package com.atguigu.mtimeapp.lixin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.bigkoo.snappingstepper.SnappingStepper;
import com.bigkoo.snappingstepper.listener.SnappingStepperValueChangeListener;

public class ShoppingCartActivity extends Activity implements SnappingStepperValueChangeListener {

    private LinearLayout llShoppingcartContainer;
    private LinearLayout llShoppingcartCheckall;
    private TextView tvShoppingcartTotalprice;
    private TextView tvShoppingcartHascollet;
    private Button btnShoppingcartAccount;

    private ImageView ivShoppingcartChecked;
    private TextView tvShoppingcartName;
    private ImageView ivShoppingcartPic;
    private SnappingStepper stepper;
    private TextView tvShoppingcartCurrprice;
    private TextView tvShoppingcartOriprice;
    private TextView tvShoppingcartCount;
    private View itemView;

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

        llShoppingcartContainer.addView(itemView);
    }

    private void initView() {

//        llShoppingcartContainer = (LinearLayout) findViewById(R.id.ll_shoppingcart_container);
//        llShoppingcartCheckall = (LinearLayout) findViewById(R.id.ll_shoppingcart_checkall);
//        tvShoppingcartTotalprice = (TextView) findViewById(R.id.tv_shoppingcart_totalprice);
//        tvShoppingcartHascollet = (TextView) findViewById(R.id.tv_shoppingcart_hascollet);
//        btnShoppingcartAccount = (Button) findViewById(R.id.btn_shoppingcart_account);

        ivShoppingcartChecked = (ImageView)itemView.findViewById(R.id.iv_shoppingcart_checked);
        tvShoppingcartName = (TextView)itemView.findViewById(R.id.tv_shoppingcart_name);
        ivShoppingcartPic = (ImageView)itemView.findViewById(R.id.iv_shoppingcart_pic);
        stepper = (SnappingStepper)itemView.findViewById(R.id.stepper);
        tvShoppingcartCurrprice = (TextView)itemView.findViewById(R.id.tv_shoppingcart_currprice);
        tvShoppingcartOriprice = (TextView)itemView.findViewById(R.id.tv_shoppingcart_oriprice);
        tvShoppingcartCount = (TextView)itemView.findViewById( R.id.tv_shoppingcart_count );
    }

    @Override
    public void onValueChange(View view, int value) {
        switch (view.getId()) {
            case  R.id.stepper:
                Toast.makeText(ShoppingCartActivity.this, value+"", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
