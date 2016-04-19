package com.atguigu.mtimeapp.utils;

import android.content.Context;
import android.content.Intent;

import com.atguigu.mtimeapp.activity.FirstActivity;

/**
 * Created by 笨货 on 2016/4/13.
 * 启动webVIew的页面
 */
public class ToWebUtils {
    public static void startToWebPager(Context context, String webUrl) {
        Intent intent = new Intent(context, FirstActivity.class);
        intent.putExtra("webUrl", webUrl);
        context.startActivity(intent);
    }
}
