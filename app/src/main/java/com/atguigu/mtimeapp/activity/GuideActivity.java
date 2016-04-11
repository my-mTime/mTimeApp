package com.atguigu.mtimeapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.CacheUtils;


public class GuideActivity extends Activity {

    private ViewPager viewpaper_guide;
    private MyAdapter adapter;

    //准备图片数据
    private int images[] = {R.drawable.lead_bg1,R.drawable.lead_bg2,R.drawable.lead_bg3,R.drawable.lead_bg4};
    private int desimages[] = {R.drawable.lead_bg1_iv,R.drawable.lead_bg2_iv,R.drawable.lead_bg3_iv,R.drawable.lead_bg4_iv};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        adapter = new MyAdapter();
        viewpaper_guide.setAdapter(adapter);

    }
    private void initView() {
        setContentView(R.layout.activity_guide);
        viewpaper_guide = (ViewPager)findViewById(R.id.viewpaper_guide);
    }
    class MyAdapter extends PagerAdapter{


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = View.inflate(GuideActivity.this,R.layout.item_guide,null);
            view.findViewById(R.id.iv_bg_guide).setBackgroundResource(images[position]);
            view.findViewById(R.id.iv_guid_point).setBackgroundResource(desimages[position]);
            if(position == images.length-1) {
                view.findViewById(R.id.iv_guid4_des).setVisibility(View.VISIBLE);
                view.findViewById(R.id.btn_start_main).setVisibility(View.VISIBLE);
            }else {
                view.findViewById(R.id.iv_guid4_des).setVisibility(View.GONE);
                view.findViewById(R.id.btn_start_main).setVisibility(View.GONE);
            }
            view.findViewById(R.id.btn_start_main).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //进入城市定位界面
                    Intent intent = new Intent(GuideActivity.this, LocatorActivity.class);
                    CacheUtils.putboolen(GuideActivity.this, SplashActivity.START_MAIN, true);
                    startActivity(intent);
                    finish();
                }
            });
            container.addView(view);
            return view;
        }
        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }
    }
}
