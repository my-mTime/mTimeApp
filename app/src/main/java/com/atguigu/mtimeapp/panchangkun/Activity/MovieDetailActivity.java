package com.atguigu.mtimeapp.panchangkun.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.panchangkun.domain.MovieDetailListBean;
import com.atguigu.mtimeapp.panchangkun.domain.MovieDetailNewsBean;
import com.atguigu.mtimeapp.panchangkun.domain.MovieDetailPeopleBean;
import com.atguigu.mtimeapp.panchangkun.domain.MovieDetailUserSayBean;
import com.atguigu.mtimeapp.utils.NetUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;


public class MovieDetailActivity extends Activity implements View.OnClickListener {

    //首页上点击的是哪个影片
    private static final String MOVIELISTPOSITION = "movieListPosition";
    //电影的id
    private static final String MOVIEID = "movieId";
    //城市的id
    private static final String CITYLOCATION = "cityLocation";

    private ScrollView scrPlayMovieDetials;
    private LinearLayout llContentContainerDetials;

    private ImageView iconPalyMovieDetials;
    //表示电影类型的图标集合类
    private LinearLayout llMovietypePlayMovieDetials;

    private TextView tvLlMovieNameDetialsBuyticket;
    private TextView tvLlMovieUsDetialsBuyticket;
    private TextView tvScoreDetialsBuyticket;
    private TextView tvTimemovieDetialsBuyticket;
    private TextView tvTypemovieDetialsBuyticket;
    private TextView tvShowTimeDetialsBuyticket;
    private Button btnWantseeDetialsBuyticket;
    private Button btnWantscoreDetialsBuyticket;
    private TextView tvCommonSpecialPlayMovieDetialBuyticket;
    private Button btnScrollBuyticketDetials;
    private Button btnBuyticketPlayMovieItem;
    private int movieListPosition;
    private int movieId;
    private int cityLocation;

    private boolean isExpanded = false;
    private int lastHeight = 0;

    private ImageView iv_moviedetaildaoyan_img;
    private TextView tv_moviedetaildaoyan_name;

    private LinearLayout ll_moviedetail_scrollview;

    private TextView tv_moviedetail_news_title1;
    private TextView tv_moviedetail_news_title2;
    private ImageView iv_moviedetail_news_img;

    private LinearLayout ll_moviedetail_usersay;

    private ImageView iv_moviedetail_title_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        movieListPosition = getIntent().getIntExtra(MOVIELISTPOSITION, -1);
        movieId = getIntent().getIntExtra(MOVIEID, -1);
        cityLocation = getIntent().getIntExtra(CITYLOCATION, -1);
        findViews();
        requestMovieFromNet();
        requestStoryFromNet();
        requestPeopleFromNet();
        requestNewsFromNet();
        requestUserSayFromNet();
    }

    /**
     * 网友短评的网络请求
     */
    private void requestUserSayFromNet() {
        String url = NetUtils.MOVIE_DISCUSS + "?movieId=" + movieId + "&pageIndex=1";
//        String url = "http://api.m.mtime.cn/Showtime/MovieComments.api?movieId=211903&pageIndex=1";
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(MovieDetailActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String response) {
                initUserSayData(response);
            }
        });
    }

    /**
     * 装配网友短评的数据
     *
     * @param response
     */
    private void initUserSayData(String response) {
        MovieDetailUserSayBean UserSayBean = new Gson().fromJson(response, MovieDetailUserSayBean.class);

        for (int i = 0; i <= 10; i++) {
            String userName = UserSayBean.getCts().get(i).getCa();
            String userSay = UserSayBean.getCts().get(i).getCe();
            View view = View.inflate(this, R.layout.moviedetail_usersay_item, null);
            TextView name = (TextView) view.findViewById(R.id.tv_moviedetail_usersay_username);
            TextView say = (TextView) view.findViewById(R.id.tv_moviedetail_usersay_usersay);
            name.setText(userName);
            say.setText(userSay);
            ll_moviedetail_usersay.addView(view);
        }
    }

    /**
     * 相关新闻的联网请求
     */
    private void requestNewsFromNet() {
        String url = NetUtils.MOVIE_NEWS + "?movieId=" + movieId + "&pageIndex=1";
//        String url = "http://api.m.mtime.cn/Movie/News.api?movieId=211903&pageIndex=1";
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(MovieDetailActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String response) {
                initNewsData(response);
            }
        });

    }

    /**
     * 装配相关新闻的数据
     */
    private void initNewsData(String response) {
        MovieDetailNewsBean newsBean = new Gson().fromJson(response, MovieDetailNewsBean.class);

        List<MovieDetailNewsBean.NewsListEntity> newsList = newsBean.getNewsList();
        MovieDetailNewsBean.NewsListEntity newsListEntity = newsList.get(0);
        tv_moviedetail_news_title1.setText(newsListEntity.getTitle());
        tv_moviedetail_news_title2.setText(newsListEntity.getTitle2());
        ImageUtils.loadImage(this, newsListEntity.getImage(), iv_moviedetail_news_img);
    }


    /**
     * 联网请求演职人员数据
     */
    private void requestPeopleFromNet() {
        String url = NetUtils.PERSON_IN_MOVIE + "?movieId=" + movieId;
//        String url = "http://api.m.mtime.cn/Movie/MovieCreditsWithTypes.api" + "?movieId=211903";
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(MovieDetailActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String response) {
                initPersonInMovieData(response);
                Log.e("TAG", "lianwangchenggong");
            }
        });
    }

    /**
     * 装电影演职人员数据
     *
     * @param response
     */
    private void initPersonInMovieData(String response) {
        Gson gson = new Gson();
        MovieDetailPeopleBean peopleBean = gson.fromJson(response, MovieDetailPeopleBean.class);
        //装配导演信息
        String directImage = peopleBean.getTypes().get(0).getPersons().get(0).getImage();
        String directName = peopleBean.getTypes().get(0).getPersons().get(0).getName();
        ImageUtils.loadImage(MovieDetailActivity.this, directImage, iv_moviedetaildaoyan_img);
        tv_moviedetaildaoyan_name.setText(directName);
        //装配演员信息
        for (int i = 0; i <= 10; i++) {
            View view = View.inflate(this, R.layout.moviedetail_index_item, null);
            ImageView personImg = (ImageView) view.findViewById(R.id.iv_moviedetailitem_img);
            TextView personName = (TextView) view.findViewById(R.id.tv_moviedetailitem_name);
            String image = peopleBean.getTypes().get(1).getPersons().get(i).getImage();
            ImageUtils.loadImage(MovieDetailActivity.this, image, personImg);
            String name = peopleBean.getTypes().get(1).getPersons().get(i).getName();
            personName.setText(name);
            ll_moviedetail_scrollview.addView(view);
        }
    }

    //剧情数据
    private void requestStoryFromNet() {
        setStoryText();
    }

    /**
     * 设置剧情点击下拉
     */
    private void setStoryText() {
        final ViewGroup expandableContainer = (ViewGroup) findViewById(R.id.expandable_container);

        findViewById(R.id.expandable_text).setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if (isExpanded) {
                            ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) expandableContainer
                                    .getLayoutParams();

                            params.height = lastHeight;

                            expandableContainer.setLayoutParams(params);
                            expandableContainer.invalidate();
                        } else {
                            lastHeight = expandableContainer.getHeight();

                            ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) expandableContainer
                                    .getLayoutParams();

                            params.height = ViewGroup.LayoutParams.WRAP_CONTENT;

                            expandableContainer.setLayoutParams(params);
                            expandableContainer.invalidate();
                        }

                        isExpanded = !isExpanded;

                    }
                });
    }

    /**
     * 联网请求
     */
    private void requestMovieFromNet() {
        String url = NetUtils.MOVIE_LIST + "?locationId=" + cityLocation;
//        String url = "http://api.m.mtime.cn/Showtime/LocationMovies.api?locationId=290";
//        movieListPosition = 0;
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(MovieDetailActivity.this, "网络错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(String response) {
                initMovieMessageData(response);
            }
        });
    }

    /**
     * 装电影详情的方法
     *
     * @param response
     */
    private void initMovieMessageData(String response) {
//        Toast.makeText(MovieDetailActivity.this, response, Toast.LENGTH_SHORT).show();

        MovieDetailListBean detailListBean = new Gson().fromJson(response, MovieDetailListBean.class);

        MovieDetailListBean.MsEntity entity = detailListBean.getMs().get(movieListPosition);
        //顶部购买按钮内容
//        boolean isTicket = entity.isIsTicket();

        //名称
        String tCn = entity.getTCn();
        tvLlMovieNameDetialsBuyticket.setText(tCn);
        int le = tCn.length() > 6 ? 5 : tCn.length();
        String substring = tCn.substring(0, le);
        tvLlMovieNameDetialsBuyticket.setText(substring);
        //英文名
        tvLlMovieUsDetialsBuyticket.setText(entity.getTEn());
        //得分
        boolean isWill = entity.getR() <= 0;
        if (isWill) {
            tvScoreDetialsBuyticket.setVisibility(View.INVISIBLE);
        } else {
            tvScoreDetialsBuyticket.setVisibility(View.VISIBLE);
            tvScoreDetialsBuyticket.setText(entity.getR() + "");
        }
        //分钟
        String length = entity.getD();
        if (length != null) {
            tvTimemovieDetialsBuyticket.setText(length);
        } else {
            tvTimemovieDetialsBuyticket.setText("--分钟");
        }

        //类型
        tvTimemovieDetialsBuyticket.setText(entity.getMovieType());

        //上映时间
        tvShowTimeDetialsBuyticket.setText("上映时间:" + entity.getRd());
        //电影图片
        ImageUtils.loadImage(MovieDetailActivity.this, entity.getImg(), iconPalyMovieDetials);

//        //我想看btn
//        btnWantseeDetialsBuyticket.setOnClickListener(pmiaOnClickListener.setPosition(0));
//        //评论btn
//        btnWantscoreDetialsBuyticket.setOnClickListener(pmiaOnClickListener.setPosition(1));
        //一句话描述
        String commonSpecial = entity.getCommonSpecial();
        if (!commonSpecial.equals("")) {
            tvCommonSpecialPlayMovieDetialBuyticket.setVisibility(View.VISIBLE);
            tvCommonSpecialPlayMovieDetialBuyticket.setText("“" + commonSpecial);
        } else {
            tvCommonSpecialPlayMovieDetialBuyticket.setVisibility(View.INVISIBLE);
        }
    }


    private void findViews() {
        scrPlayMovieDetials = (ScrollView) findViewById(R.id.scr_play_movie_detials);
        llContentContainerDetials = (LinearLayout) findViewById(R.id.ll_content_container_detials);
        iconPalyMovieDetials = (ImageView) findViewById(R.id.icon_paly_movie_detials);
        llMovietypePlayMovieDetials = (LinearLayout) findViewById(R.id.ll_movietype_play_movie_detials);
        tvLlMovieNameDetialsBuyticket = (TextView) findViewById(R.id.tv_ll_movie_name_detials_buyticket);
        tvLlMovieUsDetialsBuyticket = (TextView) findViewById(R.id.tv_ll_movie_us_detials_buyticket);
        tvScoreDetialsBuyticket = (TextView) findViewById(R.id.tv_score_detials_buyticket);
        tvTimemovieDetialsBuyticket = (TextView) findViewById(R.id.tv_timemovie_detials_buyticket);
        tvTypemovieDetialsBuyticket = (TextView) findViewById(R.id.tv_typemovie_detials_buyticket);
        tvShowTimeDetialsBuyticket = (TextView) findViewById(R.id.tv_showTime_detials_buyticket);
        btnWantseeDetialsBuyticket = (Button) findViewById(R.id.btn_wantsee_detials_buyticket);
        btnWantscoreDetialsBuyticket = (Button) findViewById(R.id.btn_wantscore_detials_buyticket);
        tvCommonSpecialPlayMovieDetialBuyticket = (TextView) findViewById(R.id.tv_commonSpecial_play_movie_detial_buyticket);
        btnScrollBuyticketDetials = (Button) findViewById(R.id.btn_scroll_buyticket_detials);
        btnBuyticketPlayMovieItem = (Button) findViewById(R.id.btn_buyticket_play_movie_item);

        iv_moviedetaildaoyan_img = (ImageView) findViewById(R.id.iv_moviedetaildaoyan_img);
        tv_moviedetaildaoyan_name = (TextView) findViewById(R.id.tv_moviedetaildaoyan_name);

        ll_moviedetail_scrollview = (LinearLayout) findViewById(R.id.ll_moviedetail_scrollview);

        tv_moviedetail_news_title1 = (TextView) findViewById(R.id.tv_moviedetail_news_title1);
        tv_moviedetail_news_title2 = (TextView) findViewById(R.id.tv_moviedetail_news_title2);
        iv_moviedetail_news_img = (ImageView) findViewById(R.id.iv_moviedetail_news_img);

        ll_moviedetail_usersay = (LinearLayout) findViewById(R.id.ll_moviedetail_usersay);

        iv_moviedetail_title_back = (ImageView) findViewById(R.id.iv_moviedetail_title_back);

        btnWantseeDetialsBuyticket.setOnClickListener(this);
        btnWantscoreDetialsBuyticket.setOnClickListener(this);
        btnScrollBuyticketDetials.setOnClickListener(this);
        btnBuyticketPlayMovieItem.setOnClickListener(this);
        iv_moviedetail_title_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnWantseeDetialsBuyticket) {
            // Handle clicks for btnWantseeDetialsBuyticket
        } else if (v == btnWantscoreDetialsBuyticket) {
            // Handle clicks for btnWantscoreDetialsBuyticket
        } else if (v == btnScrollBuyticketDetials) {
            // Handle clicks for btnScrollBuyticketDetials
        } else if (v == btnBuyticketPlayMovieItem) {
            // Handle clicks for btnBuyticketPlayMovieItem
        } else if (v == iv_moviedetail_title_back) {
            finish();
        }
    }
}
