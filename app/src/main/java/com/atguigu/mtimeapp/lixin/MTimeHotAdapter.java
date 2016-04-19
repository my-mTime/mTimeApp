package com.atguigu.mtimeapp.lixin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/13.
 */
public class MTimeHotAdapter extends BaseAdapter {

    private Context context;
    private List<MTimeHotBean.ListEntity> list;

    public MTimeHotAdapter(Context context, List<MTimeHotBean.ListEntity> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
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
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.item_mtimehot, null);
            holder.ivMtimehotIcon = (ImageView) convertView.findViewById(R.id.iv_mtimehot_icon);
            holder.ivMtimehotRanking = (ImageView) convertView.findViewById(R.id.iv_mtimehot_ranking);
            holder.llMtimehotInfo = (LinearLayout) convertView.findViewById(R.id.ll_mtimehot_info);
            holder.tvMtimehotCname = (TextView) convertView.findViewById(R.id.tv_mtimehot_cname);
            holder.tvMtimehotScore = (TextView) convertView.findViewById(R.id.tv_mtimehot_score);
            holder.tvMtimehotEname = (TextView) convertView.findViewById(R.id.tv_mtimehot_ename);
            holder.tvMtimehotAuthor = (TextView) convertView.findViewById(R.id.tv_mtimehot_author);
            holder.tvMtimehotActor = (TextView) convertView.findViewById(R.id.tv_mtimehot_actor);
            holder.tvMtimehotShowtime = (TextView) convertView.findViewById(R.id.tv_mtimehot_showtime);
            holder.tvMtimehotWantsee = (TextView) convertView.findViewById(R.id.tv_mtimehot_wantsee);
            holder.btnMtimehotBuy = (Button) convertView.findViewById(R.id.btn_mtimehot_buy);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        MTimeHotBean.ListEntity listEntity = list.get(position);

        ImageUtils.loadImage(context, listEntity.getPosterUrl(), holder.ivMtimehotIcon, R.drawable.img_default);
        holder.tvMtimehotCname.setText(listEntity.getName());
        holder.tvMtimehotEname.setText(listEntity.getNameEn());
        if (listEntity.getRating().equals("-1.0")) {
            holder.tvMtimehotScore.setVisibility(View.GONE);
        } else {
            holder.tvMtimehotScore.setText(listEntity.getRating());
        }
        holder.tvMtimehotAuthor.setText(listEntity.getDirector());
        holder.tvMtimehotActor.setText(listEntity.getActor1() + " " + listEntity.getActor2());
        holder.tvMtimehotShowtime.setText(listEntity.getReleaseDate() + " " + listEntity.getReleaseArea());
        holder.tvMtimehotWantsee.setText(listEntity.getWantCount()+"人想看");

        if (listEntity.isIsPresell()) {//预售
            holder.btnMtimehotBuy.setVisibility(View.VISIBLE);
            holder.btnMtimehotBuy.setBackgroundResource(R.drawable.bt_solid_green_66);
            holder.btnMtimehotBuy.setText("预售");
        } else if (listEntity.isIsTicket()) {//有票
            holder.btnMtimehotBuy.setVisibility(View.VISIBLE);
            holder.btnMtimehotBuy.setBackgroundResource(R.drawable.bt_solid_orange_66);
            holder.btnMtimehotBuy.setText("购票");
        } else {
            holder.btnMtimehotBuy.setVisibility(View.GONE);
        }


        holder.btnMtimehotBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "购票/预售", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    static class ViewHolder {
        private ImageView ivMtimehotIcon;
        private ImageView ivMtimehotRanking;
        private LinearLayout llMtimehotInfo;
        private TextView tvMtimehotCname;
        private TextView tvMtimehotScore;
        private TextView tvMtimehotEname;
        private TextView tvMtimehotAuthor;
        private TextView tvMtimehotActor;
        private TextView tvMtimehotShowtime;
        private TextView tvMtimehotWantsee;
        private Button btnMtimehotBuy;

    }

}
