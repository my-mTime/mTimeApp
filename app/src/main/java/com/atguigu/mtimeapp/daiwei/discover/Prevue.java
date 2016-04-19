package com.atguigu.mtimeapp.daiwei.discover;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.daiwei.DiscoverBasepage;
import com.atguigu.mtimeapp.daiwei.domain.DiscoverPrevueEntity;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/13.
 *
 * 发现--预告片页面
 */
public class Prevue extends DiscoverBasepage {

    /**
     * 头部数据
     */
//    private final DiscoverHeaderEntity headerEntity;
    public ListView lv_discover;
    private List<DiscoverPrevueEntity.TrailersEntity> trailers;
    private TextView tv_disconver_header_title;
    private ImageView iv_header_bg;

    public Prevue(Activity activity) {
        super(activity);
//        this.headerEntity = headerEntity;
    }

    @Override
    public View initView() {
        lv_discover = (ListView) View.inflate(mActivity, R.layout.discover, null);
        View header = View.inflate(mActivity, R.layout.discover_header, null);
        lv_discover.addHeaderView(header);

        tv_disconver_header_title = (TextView) header.findViewById(R.id.tv_disconver_header_title);
        iv_header_bg = (ImageView) header.findViewById(R.id.iv_header_bg);
        return lv_discover;
    }


    @Override
    public void initData() {
        super.initData();
        Log.i("TAG", "发现--预告片页面数据初始化");
        if(trailers!= null) {
//            DiscoverHeaderEntity.TrailerEntity trailer = headerEntity.getTrailer();
//            tv_disconver_header_title.setText(trailer.getTitle());
//
//            ImageUtils.loadImage(mActivity, trailer.getImageUrl(), iv_header_bg);
        }
        getDataFromNet();
    }

    /**
     * 联网获取列表数据
     */
    private void getDataFromNet() {
        OkHttpUtils.get().url(ContantsUtils.discover_prevue).build().execute(new StringCallback() {
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

    /**
     * 处理数据
     * @param response
     */
    private void processData(String response) {
        DiscoverPrevueEntity prevueEntity = parseJson(response);
        trailers = prevueEntity.getTrailers();

        if(trailers !=null && !trailers.isEmpty()) {
            lv_discover.setAdapter(new PrevueAdapter());
        }
    }

    private DiscoverPrevueEntity parseJson(String response) {
        return new Gson().fromJson(response, DiscoverPrevueEntity.class);
    }

    public class PrevueAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return trailers.size();
        }

        @Override
        public DiscoverPrevueEntity.TrailersEntity getItem(int position) {
            return trailers.get(position);
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
                convertView = View.inflate(mActivity, R.layout.item_prevue, null);
                holder.iv_icon = (ImageView) convertView.findViewById(R.id.iv_item_prevue_icon);
                holder.tv_title = (TextView) convertView.findViewById(R.id.tv_item_prevue_title);
                holder.tv_summary = (TextView) convertView.findViewById(R.id.tv_item_prevue_summary);

                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            DiscoverPrevueEntity.TrailersEntity trailersEntity = getItem(position);
            String movieName = trailersEntity.getMovieName();
            holder.tv_title.setText(movieName);
            String summary = trailersEntity.getSummary();
            holder.tv_summary.setText(summary);
            String coverImg = trailersEntity.getCoverImg();
            ImageUtils.loadImage(mActivity, coverImg, holder.iv_icon, R.drawable.img_default_300x200);

            return convertView;
        }

        private class ViewHolder{
            ImageView iv_icon;
            TextView tv_title;
            TextView tv_summary;
        }
    }

}
