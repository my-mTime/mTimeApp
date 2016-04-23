package com.atguigu.mtimeapp.daiwei.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * 作者：杨光福 on 2016/3/12 15:10
 * 微信：yangguangfu520
 * QQ号：541433511
 * 作用：自定义的VidewView
 */
public class VitamioVideoView extends io.vov.vitamio.widget.VideoView   {

    /**
     * 当我们在布局文件使用该类的时候，当构造这个类的时候Android系统用该构造方法实例化该类
     * @param context
     * @param attrs
     */
    public VitamioVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 在代码中实例化该类的时候，我们人为使用这个构造方法实例化该类
     * @param context
     */
    public VitamioVideoView(Context context) {
        super(context);
    }

    /**
     * 重写测量方法
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }


    /**
     * 想要设置视频的宽和高
     * @param videoWidth
     * @param videoHeight
     */
    public void setVideoSize(int videoWidth,int videoHeight){

        ViewGroup.LayoutParams params = getLayoutParams();
        params.width = videoWidth;
        params.height = videoHeight;
        setLayoutParams(params);
    }

}
