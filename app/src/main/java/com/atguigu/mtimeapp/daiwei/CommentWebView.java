package com.atguigu.mtimeapp.daiwei;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.activity.LoginActivity;
import com.atguigu.mtimeapp.daiwei.domain.ReviewDetailEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/22.
 */
public class CommentWebView extends Activity implements View.OnClickListener {

    private WebView wv_webView;
    private TextView tv_title_name;
    private TextView tv_comment_detail_title;
    private ImageView iv_title_back;
    private ImageView iv_title_like;
    private ImageView iv_title_share;
    private CircleImageView civ_comment_detail_userIcon;
    private TextView tv_comment_detail_userName;
    private TextView tv_comment_detail_movieName;
    private TextView tv_comment_detail_grade;
    private ImageView iv_comment_detail_poster;
    private TextView tv_comment_detail_time;

    private String url;
    private int type;
    private int review = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        initView();
        initData();

    }

    private void initData() {
        int reviewId = getIntent().getIntExtra("reviewId", -1);
        if(reviewId != -1) {
            type = review;
            url = ContantsUtils.film_comment +"reviewId="+reviewId;
        }
        getNetData(url);
    }

    /**
     * 得到网络数据
     */
    private void getNetData(String url) {
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG", "onError==" + e);
            }

            @Override
            public void onResponse(String response) {
                processData(response);
            }
        });
    }

    /**
     * 处理数据
     * @param json
     */
    private void processData(String json) {
        switch (type) {
            case 1 :
                ReviewDetailEntity reviewDetailEntity = parseJson(json);

                String title = reviewDetailEntity.getTitle();
                tv_comment_detail_title.setText(title);
                String nickname = reviewDetailEntity.getNickname();
                tv_comment_detail_userName.setText(nickname);
                String time = reviewDetailEntity.getTime();
                tv_comment_detail_time.setText(time);
                String rating = reviewDetailEntity.getRating();
                tv_comment_detail_grade.setText(rating);
                String userImage = reviewDetailEntity.getUserImage();
                ImageUtils.loadImage(this, userImage, civ_comment_detail_userIcon, R.drawable.img_default_45x45);

                ReviewDetailEntity.RelatedObjEntity relatedObj = reviewDetailEntity.getRelatedObj();
                String name = relatedObj.getName();
                tv_comment_detail_movieName.setText(name);
                String image = relatedObj.getImage();
                ImageUtils.loadImage(this, image, iv_comment_detail_poster, R.drawable.img_default);
                String content = reviewDetailEntity.getContent();
                wv_webView.loadDataWithBaseURL("http://img31.mtime.cn/mg/", content, "text/html", "utf-8", null);
                break;
        }
    }

    /**
     * 解析json数据
     * @param json
     */
    private ReviewDetailEntity parseJson(String json) {
        return new Gson().fromJson(json, ReviewDetailEntity.class);
    }

    private void initView() {
        wv_webView = (WebView)findViewById(R.id.wv_webView);
        tv_title_name = (TextView)findViewById(R.id.tv_title_name);
        iv_title_back = (ImageView)findViewById(R.id.iv_title_back);
        iv_title_like = (ImageView)findViewById(R.id.iv_title_like);
        iv_title_share = (ImageView)findViewById(R.id.iv_title_share);
        tv_comment_detail_title = (TextView)findViewById(R.id.tv_comment_detail_title);
        civ_comment_detail_userIcon = (CircleImageView)findViewById(R.id.civ_comment_detail_userIcon);
        tv_comment_detail_movieName = (TextView)findViewById(R.id.tv_comment_detail_movieName);
        tv_comment_detail_userName = (TextView)findViewById(R.id.tv_comment_detail_userName);
        tv_comment_detail_grade = (TextView)findViewById(R.id.tv_comment_detail_grade);
        iv_comment_detail_poster = (ImageView)findViewById(R.id.iv_comment_detail_poster);
        tv_comment_detail_time = (TextView)findViewById(R.id.tv_comment_detail_time);

        tv_title_name.setVisibility(View.GONE);
        iv_title_share.setVisibility(View.VISIBLE);
        iv_title_back.setOnClickListener(this);
        iv_title_like.setOnClickListener(this);

        wv_webView.setWebViewClient(new WebViewClient());

        WebSettings settings = wv_webView.getSettings();
        settings.setJavaScriptEnabled(true); //设置是否支持JavaScript
        settings.setSupportZoom(true); //设置是否支持缩放
        settings.setDefaultTextEncodingName("utf-8");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_title_back :
                finish();
                break;
            case R.id.iv_title_like :
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.iv_title_share :

                break;
        }
    }
}
