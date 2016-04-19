package com.atguigu.mtimeapp.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.domain.BuyTicketWillShowingBen;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;

import java.util.List;

/**
 * Created by 杨勇康 on 2016/4/12 0012.
 */
public class WillShowingAdapter extends BaseAdapter {

    public Context context;
    public List<BuyTicketWillShowingBen.AttentionEntity> attentionEntities;
    public List<BuyTicketWillShowingBen.MoviecomingsEntity> moviecomingsEntities;
    public ListView listView;
    public View viewHeader;

    public RecyclerViewAdapter adapter;
    public LinearLayoutManager layoutManager;

    public WillShowingAdapter(Context context, List<BuyTicketWillShowingBen.AttentionEntity> attentionEntities, List<BuyTicketWillShowingBen.MoviecomingsEntity> moviecomingsEntities, ListView listView) {
        this.context = context;
        this.attentionEntities = attentionEntities;
        this.moviecomingsEntities = moviecomingsEntities;
        this.listView = listView;
        layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        addHeader(context);
    }

    /**
     * 添加头部
     * @param context
     */
    public void addHeader(Context context) {
        viewHeader = View.inflate(context, R.layout.will_showing_header, null);//即将热映头部布局
        RecyclerView horizontal_recycle = (RecyclerView) viewHeader.findViewById(R.id.horizontal_recycle);
        TextView buyticket_willshow_tv = (TextView) viewHeader.findViewById(R.id.buyticket_willshow_tv);
        ImageView ig_ad = (ImageView) viewHeader.findViewById(R.id.ig_ad);
        buyticket_willshow_tv.setText("即将上映（"+moviecomingsEntities.size()+"部）");
        String imageurl = "http://img31.mtime.cn/mg/2016/04/12/100645.79051425.jpg";
        ImageUtils.loadImage(context, imageurl, ig_ad);
        adapter = new RecyclerViewAdapter();
        horizontal_recycle.setLayoutManager(layoutManager);
        horizontal_recycle.setAdapter(adapter);

        this.listView.addHeaderView(viewHeader);
    }
    public void removeHeader(ListView listView1){
        listView1.removeHeaderView(viewHeader);
    }

    @Override
    public int getCount() {
        return moviecomingsEntities.size();
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
            convertView = View.inflate(context, R.layout.item_willshowing_list,null);
            holder.ll_text_mouthview = (LinearLayout) convertView.findViewById(R.id.ll_text_mouthview);
            holder.moviecoming_item_text = (TextView) convertView.findViewById(R.id.moviecoming_item_text);
            holder.movecomingItemTvData = (TextView)convertView.findViewById(R.id.movecoming_item_tv_data);
            holder.movecomingItemIvIcon = (ImageView)convertView.findViewById(R.id.movecoming_item_iv_icon);
            holder.movecomingItemTvTitle = (TextView)convertView.findViewById(R.id.movecoming_item_tv_title);
            holder.movecomingItemTvDes = (TextView)convertView.findViewById(R.id.movecoming_item_tv_des);
            holder.movecomingItemTvDay = (TextView)convertView.findViewById(R.id.movecoming_item_tv_day);
            holder.movecomingItemBtnPrebuy = (Button)convertView.findViewById(R.id.movecoming_item_btn_prebuy);
            holder.movecomingItemBtnPremovie = (Button)convertView.findViewById(R.id.movecoming_item_btn_premovie);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        BuyTicketWillShowingBen.MoviecomingsEntity moviecomingsEntity = moviecomingsEntities.get(position);
        if(position == 0) {
            holder.ll_text_mouthview.setVisibility(View.VISIBLE);
            holder.moviecoming_item_text.setText(moviecomingsEntity.getRMonth()+"月");
        }else {
            if(moviecomingsEntity.getRMonth() == moviecomingsEntities.get(position-1).getRMonth()) {
                holder.ll_text_mouthview.setVisibility(View.GONE);
            }else {
                holder.ll_text_mouthview.setVisibility(View.VISIBLE);
                holder.moviecoming_item_text.setText(moviecomingsEntity.getRMonth()+"月");
            }
        }
        holder.movecomingItemTvData.setText(moviecomingsEntity.getRDay()+"日");
        ImageUtils.loadImage(context, moviecomingsEntity.getImage(), holder.movecomingItemIvIcon, R.drawable.movie_more_info);
        holder.movecomingItemTvTitle.setText(moviecomingsEntity.getTitle());
        holder.movecomingItemTvDes.setText(moviecomingsEntity.getWantedCount()+"人想看-"+
                moviecomingsEntity.getType()+"/"+moviecomingsEntity.getLocationName());
        holder.movecomingItemTvDay.setText("导演："+moviecomingsEntity.getDirector());
        return convertView;
    }

    class ViewHolder{
        LinearLayout ll_text_mouthview;
        TextView moviecoming_item_text;
        TextView movecomingItemTvData;
        ImageView movecomingItemIvIcon;
        TextView movecomingItemTvTitle;
        TextView movecomingItemTvDes;
        TextView movecomingItemTvDay;
        Button movecomingItemBtnPrebuy;
        Button movecomingItemBtnPremovie;

    }

    class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.HViewHolder>{
        @Override
        public HViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = View.inflate(context, R.layout.item_willshowing_hlist,null);
            return new HViewHolder(view);
        }

        @Override
        public void onBindViewHolder(HViewHolder holder, int position) {
            BuyTicketWillShowingBen.AttentionEntity attentionEntity = attentionEntities.get(position);
            holder.tvdate.setText(attentionEntity.getReleaseDate());
//                x.image().bind(holder.ivicon, attentionEntity.getImage());
            ImageUtils.loadImage(context, attentionEntity.getImage(), holder.ivicon, R.drawable.movie_more_info);
            holder.tvtitle.setText(attentionEntity.getTitle());
            holder.tvdes.setText(attentionEntity.getWantedCount()+"想看-"+attentionEntity.getType()+"/"+attentionEntity.getLocationName());
            holder.tvdoctor.setText("导演："+attentionEntity.getDirector());
            holder.tvactor.setText("演员："+attentionEntity.getActor1()+","+attentionEntity.getActor2());
            if(attentionEntity.isIsTicket()){
                holder.prebuy.setVisibility(View.VISIBLE);
            }else {
                holder.prebuy.setVisibility(View.GONE);
            }
            if(attentionEntity.getVideoCount()>0){
                holder.premovie.setVisibility(View.VISIBLE);
            }else {
                holder.premovie.setVisibility(View.GONE);
            }
        }

        @Override
        public int getItemCount() {
            return attentionEntities.size();
        }

        class HViewHolder extends RecyclerView.ViewHolder {
            private TextView tvdate;//上映日期
            private ImageView ivicon;//海报
            private TextView tvtitle;//电影名称
            private TextView tvdes;//电影描述
            private TextView tvdoctor;//导演
            private TextView tvactor;//演员
            private Button prebuy;//超前预订
            private Button premovie;//预告片

            public HViewHolder(View itemView) {
                super(itemView);
                tvdate = (TextView) itemView.findViewById(R.id.focus_item_tv_date);
                ivicon = (ImageView) itemView.findViewById(R.id.focus_item_iv_icon);
                tvtitle = (TextView) itemView.findViewById(R.id.focus_item_tv_title);
                tvdes = (TextView) itemView.findViewById(R.id.focus_item_tv_des);
                tvdoctor = (TextView) itemView.findViewById(R.id.focus_item_tv_doctor);
                tvactor = (TextView) itemView.findViewById(R.id.focus_item_tv_actor);
                prebuy = (Button) itemView.findViewById(R.id.focus_item_btn_prebuy);
                premovie = (Button) itemView.findViewById(R.id.focus_item_btn_premovie);
            }
        }
    }
}



