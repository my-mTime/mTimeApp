package com.atguigu.mtimeapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.domain.BuyTicketHotShowingBen;
import com.atguigu.mtimeapp.utils.ComperTimeUtils;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;

import java.util.List;

/**
 * Created by 杨勇康 on 2016/4/11 0011.
 * 正在热映适配器
 */
public class HotShowingAdapter extends BaseAdapter {
    private Context context;
    private List<BuyTicketHotShowingBen.MsEntity> MsEntitys;

    public HotShowingAdapter(Context context, List<BuyTicketHotShowingBen.MsEntity> MsEntitys) {
        this.context = context;
        this.MsEntitys = MsEntitys;
    }

    @Override
    public int getCount() {
        return MsEntitys.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item_hotshowing_buyticketlist,null);

            holder.ivMovieIcon = (ImageView) convertView.findViewById(R.id.iv_movie_icon);
            holder.tvMovieTitleHotshowing = (TextView) convertView.findViewById(R.id.tv_movie_title_hotshowing);
            holder.tvMovieScoreHotshowing = (TextView) convertView.findViewById(R.id.tv_movie_score_hotshowing);
            holder.tvMovieDesHotshowing = (TextView) convertView.findViewById(R.id.tv_movie_des_hotshowing);
            holder.tvPlayDateHotshowing = (TextView) convertView.findViewById(R.id.tv_play_date_hotshowing);
            holder.tvReleaseInformation = (TextView) convertView.findViewById(R.id.tv_release_information);
            holder.iv3dHotshowing = (ImageView) convertView.findViewById(R.id.iv_3d_hotshowing);
            holder.ivImaxHotshowing = (ImageView) convertView.findViewById(R.id.iv_imax_hotshowing);
            holder.ivChinaLarget = (ImageView) convertView.findViewById(R.id.iv_china_larget);
            holder.btnBuyTicket = (Button) convertView.findViewById(R.id.btn_buy_ticket);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        BuyTicketHotShowingBen.MsEntity msEntity = MsEntitys.get(position);
        ImageUtils.loadImage(context, msEntity.getImg(), holder.ivMovieIcon, R.drawable.movie_more_info);
        holder.tvMovieTitleHotshowing.setText(msEntity.getT());
        holder.tvMovieScoreHotshowing.setText(msEntity.getR()+"");
        if("".equals(msEntity.getCommonSpecial())) {
            holder.tvMovieDesHotshowing.setText(msEntity.getWantedCount() + "人想看—" + msEntity.getMovieType());
        }else {
            holder.tvMovieDesHotshowing.setText(msEntity.getCommonSpecial());
        }
        holder.tvReleaseInformation.setText("今日"+msEntity.getNearestCinemaCount()+"家影院上映"+msEntity.getNearestShowtimeCount()+"场");
        if(msEntity.isIs3D()) {
            holder.iv3dHotshowing.setVisibility(View.VISIBLE);
        }else {
            holder.iv3dHotshowing.setVisibility(View.GONE);
        }
        if(msEntity.isIsIMAX3D()) {
            holder.ivImaxHotshowing.setVisibility(View.VISIBLE);
        }else {
            holder.ivImaxHotshowing.setVisibility(View.GONE);
        }
        if (msEntity.isIsDMAX()){
            holder.ivChinaLarget.setVisibility(View.VISIBLE);
        }else {
            holder.ivChinaLarget.setVisibility(View.GONE);
        }
        
        if(msEntity.isIsTicket()) {
            if(msEntity.getRd() != null) {
                holder.tvPlayDateHotshowing.setText(msEntity.getRd()+"上映");
                if(ComperTimeUtils.compareTime(msEntity.getRd())) {
                    holder.btnBuyTicket.setText("预售");
                    holder.btnBuyTicket.setTextColor(Color.WHITE);
                    holder.btnBuyTicket.setBackgroundResource(R.drawable.btn_solid_green_h58);
                }else {
                    holder.btnBuyTicket.setText("购票");
                    holder.btnBuyTicket.setTextColor(Color.WHITE);
                    holder.btnBuyTicket.setBackgroundResource(R.drawable.btn_solid_orange_h80);
                }
            }else {
                holder.tvPlayDateHotshowing.setVisibility(View.GONE);
            }
        }else {
            holder.btnBuyTicket.setText("查影讯");
            holder.btnBuyTicket.setTextColor(Color.GREEN);
            holder.btnBuyTicket.setBackgroundResource(R.drawable.bt_line_green_66);
        }
        return convertView;
    }
    class ViewHolder{

        ImageView ivMovieIcon;
        TextView tvMovieTitleHotshowing;
        TextView tvMovieScoreHotshowing;
        TextView tvMovieDesHotshowing;
        TextView tvPlayDateHotshowing;
        TextView tvReleaseInformation;
        ImageView iv3dHotshowing;
        ImageView ivImaxHotshowing;
        ImageView ivChinaLarget;
        Button btnBuyTicket;
    }
}
