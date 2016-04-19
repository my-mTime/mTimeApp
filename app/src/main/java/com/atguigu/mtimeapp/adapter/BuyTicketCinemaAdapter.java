package com.atguigu.mtimeapp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.domain.BuyTicketCinemaBen;

import java.util.List;

/**
 * Created by 杨勇康 on 2016/4/13 0013.
 * 影院适配器
 */
public class BuyTicketCinemaAdapter extends BaseAdapter{

    private Context context;
    private List<BuyTicketCinemaBen> buyTicketCinemaBens ;
    private ListView listView;

    public BuyTicketCinemaAdapter(Context context, List<BuyTicketCinemaBen> buyTicketCinemaBens, ListView listView) {
        this.context = context;
        this.buyTicketCinemaBens = buyTicketCinemaBens;
        this.listView =listView;
    }

    @Override
    public int getCount() {
        return buyTicketCinemaBens.size();
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
        ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(context, R.layout.cinema_list_item,null);
            viewHolder.cinemaListCinemaName = (TextView)convertView.findViewById(R.id.cinema_list_cinema_name);
            viewHolder.cinemaListTicketPrice = (TextView)convertView.findViewById(R.id.cinema_list_ticket_price);
            viewHolder.cinemaListCinemaAddress = (TextView)convertView.findViewById(R.id.cinema_list_cinema_address);
            viewHolder.cinemaListItemVip = (ImageView)convertView.findViewById(R.id.cinema_list_item_vip);
            viewHolder.cinemaListItemImax = (ImageView)convertView.findViewById(R.id.cinema_list_item_imax);
            viewHolder.cinemaListItemP = (ImageView)convertView.findViewById(R.id.cinema_list_item_p);
            viewHolder.cinemaListItemWifi = (ImageView)convertView.findViewById(R.id.cinema_list_item_wifi);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        BuyTicketCinemaBen buyTicketCinemaBen = buyTicketCinemaBens.get(position);
        viewHolder.cinemaListCinemaName.setText(buyTicketCinemaBen.getCinameName());
        if(buyTicketCinemaBen.getMinPrice()==0){
            viewHolder.cinemaListTicketPrice.setVisibility(View.GONE);
        }else {
            viewHolder.cinemaListTicketPrice.setVisibility(View.VISIBLE);
            viewHolder.cinemaListTicketPrice.setText(buyTicketCinemaBen.getMinPrice()/100+"起");
        }
        viewHolder.cinemaListCinemaAddress.setText(buyTicketCinemaBen.getAddress());
        BuyTicketCinemaBen.FeatureEntity feature = buyTicketCinemaBen.getFeature();
        if(feature.getHasIMAX()==1){
            viewHolder.cinemaListItemVip.setVisibility(View.VISIBLE);
        }else {
            viewHolder.cinemaListItemVip.setVisibility(View.GONE);
        }
        if(feature.getHasVIP()==1){
            viewHolder.cinemaListItemImax.setVisibility(View.VISIBLE);
        }else {
            viewHolder.cinemaListItemImax.setVisibility(View.GONE);
        }
        if(feature.getHasPark()==1){
            viewHolder.cinemaListItemP.setVisibility(View.VISIBLE);
        }else {
            viewHolder.cinemaListItemP.setVisibility(View.GONE);
        }
        if(feature.getHasWifi()==1){
            viewHolder.cinemaListItemWifi.setVisibility(View.VISIBLE);
        }else {
            viewHolder.cinemaListItemWifi.setVisibility(View.GONE);
        }
        return convertView;
    }
    class ViewHolder{
        TextView cinemaListCinemaName;
        TextView cinemaListTicketPrice;
        TextView cinemaListCinemaAddress;
        ImageView cinemaListItemVip;
        ImageView cinemaListItemImax;
        ImageView cinemaListItemP;
        ImageView cinemaListItemWifi;

    }
}
