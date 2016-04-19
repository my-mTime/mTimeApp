package com.atguigu.mtimeapp.pager;


import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.adapter.BuyTicketCinemaAdapter;
import com.atguigu.mtimeapp.adapter.HotShowingAdapter;
import com.atguigu.mtimeapp.adapter.WillShowingAdapter;
import com.atguigu.mtimeapp.base.BasePager;
import com.atguigu.mtimeapp.domain.BuyTicketCinemaBen;
import com.atguigu.mtimeapp.domain.BuyTicketHotShowingBen;
import com.atguigu.mtimeapp.domain.BuyTicketWillShowingBen;
import com.atguigu.mtimeapp.utils.LocatorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FlagWu on 2016/4/8.
 * 这里是购票界面
 */
public class BuyTicketPager extends BasePager {
    //主布局中
    private ImageView iv_top_left;
    private LinearLayout ll_select_city;
    private TextView tv_select_city;
    private RadioGroup rg_switch_moive_cinema;
    private ImageButton ib_search_film_data;
    private LinearLayout loading;
    private LinearLayout loading_failed;

    private LinearLayout ll_buy_ticket;
    private RelativeLayout fl_buy_ticket;
    private RadioGroup rg_movie_fragment;
    private ListView lv_buy_tickety;
    private ListView lv_cineman;
    /**
     * 标识选中哪个RadioButton
     */
    private int tag = 0;
    /**
     * 影院实体类
     */
    private ArrayList<BuyTicketCinemaBen> buyTicketCinemaBens;
    /**
     * 影院适配器
     */
    private BuyTicketCinemaAdapter cinemaAdapter;
    /**
     * 是否加载过影院数据
     */
    private boolean isloadcinemaAdapter = false;
    /**
     * 正在热映实体类
     */
    private BuyTicketHotShowingBen ticketHotShowingBen;
    private List<BuyTicketHotShowingBen.MsEntity> msEntities;
    /**
     * 正在热映适配器
     */
    private HotShowingAdapter adapter;
    /**
     * 即将上映实体类
     */
    private BuyTicketWillShowingBen willShowingBen;
    private List<BuyTicketWillShowingBen.AttentionEntity> attentionEntities;
    private List<BuyTicketWillShowingBen.MoviecomingsEntity> moviecomingsEntities;
    /**
     * 即将上映适配器
     */
    private WillShowingAdapter wadapter;
    /**
     * 是否加载过即将上映数据
     */
    private boolean isloadwadapter = false;


    public BuyTicketPager(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.buyticket_pager,null);
        FindView(view);
        rg_switch_moive_cinema.check(R.id.rb_choice_movie);//默认选择电影
        rg_movie_fragment.check(R.id.movie_rb_playing);//默认选择正在热映
        rg_switch_moive_cinema.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_choice_movie:
                        fl_buy_ticket.setVisibility(View.GONE);
                        ll_buy_ticket.setVisibility(View.VISIBLE);
                        break;
                    case R.id.rb_choice_cinema:
                        tag = 2;
                        if(isloadcinemaAdapter) {
                            cinemaAdapter = new BuyTicketCinemaAdapter(mActivity,buyTicketCinemaBens,lv_cineman);
                            lv_cineman.setAdapter(cinemaAdapter);
                        }else {
                            getDataFromNet();
                        }
                        fl_buy_ticket.setVisibility(View.VISIBLE);
                        ll_buy_ticket.setVisibility(View.GONE);
                        break;
                }
            }
        });
        rg_movie_fragment.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.movie_rb_playing:
                        tag = 0;
                        if (wadapter != null) {
                            wadapter.removeHeader(lv_buy_tickety);
                        }
                        if (msEntities == null) {
                            getDataFromNet();
                        } else {
                            adapter = new HotShowingAdapter(mActivity, msEntities);
                            lv_buy_tickety.setAdapter(adapter);
                            adapter.notifyDataSetChanged();
                        }
                        break;

                    case R.id.movie_rb_going:
                        tag = 1;
                        if (isloadwadapter) {
                            wadapter = new WillShowingAdapter(mActivity, attentionEntities, moviecomingsEntities, lv_buy_tickety);
                            lv_buy_tickety.setAdapter(wadapter);
                        } else {
                            getDataFromNet();
                        }
//                        ll_buy_ticket.removeView(lv_buy_tickety);
                        break;
                }
            }
        });
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        //加载网络数据
        getDataFromNet();
    }
    /**
     * 初始化视图控件
     * @param view
     */
    private void FindView(View view) {
        loading = (LinearLayout) view.findViewById(R.id.loading);
        loading_failed = (LinearLayout) view.findViewById(R.id.loading_failed);

        iv_top_left = (ImageView) view.findViewById(R.id.iv_top_left);
        iv_top_left.setVisibility(View.GONE);

        ll_select_city = (LinearLayout) view.findViewById(R.id.ll_select_city);
        tv_select_city = (TextView) view.findViewById(R.id.tv_select_city);
        ll_select_city.setVisibility(View.VISIBLE);
        LocatorUtils.setLocationOption(mActivity, tv_select_city);

        rg_switch_moive_cinema = (RadioGroup) view.findViewById(R.id.rg_switch_moive_cinema);
        rg_switch_moive_cinema.setVisibility(View.VISIBLE);

        ib_search_film_data = (ImageButton) view.findViewById(R.id.ib_search_film_data);
        ib_search_film_data.setVisibility(View.VISIBLE);

        ll_buy_ticket = (LinearLayout) view.findViewById(R.id.ll_buy_ticket);
        rg_movie_fragment = (RadioGroup) view.findViewById(R.id.rg_movie_fragment);
        lv_buy_tickety = (ListView) view.findViewById(R.id.lv_buy_tickety);


        fl_buy_ticket = (RelativeLayout) view.findViewById(R.id.fl_buy_ticket);
        lv_cineman = (ListView) view.findViewById(R.id.lv_cineman);
        fl_buy_ticket.setVisibility(View.GONE);//默认不显示此布局

    }
    /**
     * 获取网络数据
     */
    private void getDataFromNet(){
        loading.setVisibility(View.VISIBLE);
        //默认uri为北京的影院
        String uri=null;
        if(tag==0){//tag=0标识正在热映，uri不一样
            uri = "http://api.m.mtime.cn/Showtime/LocationMovies.api";
        }else if(tag==1){//tag=1标识即将热映
            uri="http://api.m.mtime.cn/Movie/MovieComingNew.api";
        }else if(tag==2){//tag=2标识影院
            uri="http://api.m.mtime.cn/OnlineLocationCinema/OnlineCinemasByCity.api";
        }
        String add = "?locationId=290";

//        Log.e("TAG", uri + add);
//        OkHttpUtils.post().url(uri+add).build().execute(new StringCallback() {
//            @Override
//            public void onError(Request request, Exception e) {
//                Toast.makeText(mActivity, "请检查网络设置", Toast.LENGTH_SHORT).show();
//                Log.e("TAG", "联网失败：");
//            }
//
//            @Override
//            public void onResponse(String json) {
//                //解析网络数据
//                Log.e("TAG","联网成功：");
//                parsersJson(json);
//                Log.e("TAG","联网成功：");
//            }
//        });
        Log.e("TAG", uri + add);
        RequestParams params = new RequestParams(uri+add);

        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String json) {
                //解析网络数据
                Log.e("TAG", "联网成功：");
                Log.e("TAG", "联网成功：" + json);
                loading.setVisibility(View.GONE);
                parsersJson(json);

            }
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(mActivity, "请检查网络设置", Toast.LENGTH_SHORT).show();
//                Log.e("TAG", "联网失败：");
                loading_failed.setVisibility(View.VISIBLE);
            }
            @Override
            public void onCancelled(CancelledException cex) {
            }
            @Override
            public void onFinished() {

            }
        });
    }
    /**
     * 解析json数据
     * @param json
     */
    private void parsersJson(String json) {
        switch (tag){
            case 0:
                ticketHotShowingBen = getHotShowingBen(json);
                msEntities = ticketHotShowingBen.getMs();
                adapter = new HotShowingAdapter(mActivity,msEntities);
                lv_buy_tickety.setAdapter(adapter);
                break;
            case 1:
                willShowingBen = getWillShowingBen(json);
                attentionEntities = willShowingBen.getAttention();
                moviecomingsEntities = willShowingBen.getMoviecomings();
                wadapter = new WillShowingAdapter(mActivity,attentionEntities,moviecomingsEntities,lv_buy_tickety);
                isloadwadapter = true;
                lv_buy_tickety.setAdapter(wadapter);
                break;
            case 2:
                buyTicketCinemaBens = new Gson().fromJson(json,new TypeToken<ArrayList<BuyTicketCinemaBen>>(){}.getType());
                isloadcinemaAdapter = true;
                cinemaAdapter = new BuyTicketCinemaAdapter(mActivity,buyTicketCinemaBens,lv_cineman);
                lv_cineman.setAdapter(cinemaAdapter);
                break;
        }

    }

    /**
     * 根据json得到对应实体类
     * @param json
     * @return
     */
    private BuyTicketHotShowingBen getHotShowingBen(String json) {
        return new Gson().fromJson(json,BuyTicketHotShowingBen.class);
    }
    private BuyTicketWillShowingBen getWillShowingBen(String json) {
        return new Gson().fromJson(json,BuyTicketWillShowingBen.class);
    }
}
