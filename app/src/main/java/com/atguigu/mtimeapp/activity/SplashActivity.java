package com.atguigu.mtimeapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.CacheUtils;


public class SplashActivity extends Activity {

    public static final String START_MAIN = "start_main";
    private boolean istoMain =false;
    private Handler handler = new Handler(){
        public void handleMessage(Message msg){
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        istoMain = CacheUtils.getboolean(this, START_MAIN);
        if(istoMain == false) {
            Intent intent = new Intent(this, GuideActivity.class);
            startActivity(intent);
            finish();
        }else {
            setContentView(R.layout.activity_splash);

            handler.sendEmptyMessageDelayed(1,2000);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeMessages(1);
    }
}
