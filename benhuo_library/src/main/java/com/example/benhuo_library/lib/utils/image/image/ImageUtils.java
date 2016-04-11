package com.example.benhuo_library.lib.utils.image.image;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by 笨货 on 2016/4/9.
 */
public class ImageUtils {

    /**
     * 用Glide加载图片
     * @param context
     * @param imageUrl 图片路径
     * @param imageView 绑定的视图
     * @param defaultImage 默认的图片
     */
    public static void loadImage(Context context, String imageUrl, ImageView imageView, int defaultImage) {
        Glide.with(context)
                .load(imageUrl)
                .centerCrop()
                .placeholder(defaultImage) //设置默认图片
                .crossFade() //淡入淡出效果
                .diskCacheStrategy(DiskCacheStrategy.ALL) //全尺寸缓存
                .into(imageView);
    }

    /**
     * 用Glide加载图片
     * @param context
     * @param imageUrl 图片路径
     * @param imageView 绑定的视图
     */
    public static void loadImage(Context context, String imageUrl, ImageView imageView) {
        Glide.with(context)
                .load(imageUrl)
                .centerCrop()
                .crossFade() //淡入淡出效果
                .diskCacheStrategy(DiskCacheStrategy.ALL) //全尺寸缓存
                .into(imageView);
    }
}
