package com.atguigu.mtimeapp.daiwei.discover;

        import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.daiwei.DiscoverBasepage;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverHeaderEntity;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverLeaderboardEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/13.
 * <p/>
 * 发现--排行榜页面
 */
public class Leaderboard extends DiscoverBasepage {

    /**
     * 头部数据
     */
    private DiscoverHeaderEntity headerEntity;
    public ListView lv_discover;
    private TextView tv_disconver_header_title;
    private ImageView iv_header_bg;
    private TextView tv_disconver_header_name;
    private TextView tv_header_news_old;
    private ImageView ib_header_prevue_play;
    private ImageView iv_header_filmComment_icon;
    private LinearLayout ll_header_news_ticketList;
    private RadioGroup rg_header_leaderboard_topList;
    private List<DiscoverLeaderboardEntity.TopListsEntity> topLists;

    public Leaderboard(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        lv_discover = (ListView) View.inflate(mActivity, R.layout.discover, null);
        View header = View.inflate(mActivity, R.layout.discover_header, null);
        lv_discover.addHeaderView(header);

        tv_disconver_header_title = (TextView) header.findViewById(R.id.tv_disconver_header_title);
        iv_header_bg = (ImageView) header.findViewById(R.id.iv_header_bg);

        iv_header_filmComment_icon = (ImageView) header.findViewById(R.id.iv_header_filmComment_icon);
        tv_disconver_header_name = (TextView) header.findViewById(R.id.tv_disconver_header_name);
        tv_header_news_old = (TextView) header.findViewById(R.id.tv_header_news_old);

        ll_header_news_ticketList = (LinearLayout) header.findViewById(R.id.ll_header_news_ticketList);
        rg_header_leaderboard_topList = (RadioGroup) header.findViewById(R.id.rg_header_leaderboard_topList);
        ib_header_prevue_play = (ImageView) header.findViewById(R.id.ib_header_prevue_play);
        return lv_discover;
    }

    @Override
    public void initData() {
        Log.i("TAG", "发现--排行榜页面数据初始化");

        getHeaderDataFromNet();
        getDataFromNet();
    }

    /**
     * 获取列表数据
     */
    private void getDataFromNet() {
        OkHttpUtils.get().url(ContantsUtils.discover_leaderboard).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG", "onError===" + e);
            }

            @Override
            public void onResponse(String response) {
                processData(response);
            }
        });
    }

    private void processData(String json) {
        DiscoverLeaderboardEntity LeaderboardEntity = parseJson(json);
        topLists = LeaderboardEntity.getTopLists();

        if(topLists != null&& !topLists.isEmpty()) {
            lv_discover.setAdapter(new TopListAdapter());
        }

    }

    private DiscoverLeaderboardEntity parseJson(String json) {
        return new Gson().fromJson(json, DiscoverLeaderboardEntity.class);
    }

    /**
     * 联网获取头部数据
     */
    private void getHeaderDataFromNet() {
        OkHttpUtils.get().url(ContantsUtils.discover_header).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {
                Log.i("TAG", "onError===" + e);
            }

            @Override
            public void onResponse(String response) {
                processHeaderData(response);
            }
        });
    }

    private void processHeaderData(String response) {
        headerEntity = new Gson().fromJson(response, DiscoverHeaderEntity.class);

        tv_header_news_old.setVisibility(View.GONE);
        ll_header_news_ticketList.setVisibility(View.GONE);
        ib_header_prevue_play.setVisibility(View.GONE);
        rg_header_leaderboard_topList.setVisibility(View.VISIBLE);
        iv_header_filmComment_icon.setVisibility(View.GONE);
        tv_disconver_header_name.setVisibility(View.GONE);

        if (headerEntity != null) {
            DiscoverHeaderEntity.TopListEntity topList = headerEntity.getTopList();

            tv_disconver_header_title.setText(topList.getTitle());
            ImageUtils.loadImage(mActivity, topList.getImageUrl(), iv_header_bg);
        }
    }
    public class TopListAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return topLists.size();
        }

        @Override
        public Object getItem(int position) {
            return topLists.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = View.inflate(mActivity, R.layout.item_leaderboard, null);
                holder.tv_nameCn = (TextView) convertView.findViewById(R.id.tv_item_prevue_title);
                holder.tv_summary = (TextView) convertView.findViewById(R.id.tv_item_prevue_summary);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            DiscoverLeaderboardEntity.TopListsEntity topListsEntity = (DiscoverLeaderboardEntity.TopListsEntity) getItem(position);
            String movieName = topListsEntity.getTopListNameCn();
            holder.tv_nameCn.setText(movieName);
            String summary = topListsEntity.getSummary();
            holder.tv_summary.setText(summary);

            return convertView;
        }

        private class ViewHolder{
            TextView tv_nameCn;
            TextView tv_summary;
        }
    }

}
