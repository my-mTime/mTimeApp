package com.atguigu.mtimeapp.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.domain.StoreBean;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/11.
 * 商城列表的Adapter
 */
public class StoreAdapter extends MyBaseAdapter {

    private List<StoreBean.CategoryEntity> category;
    private Activity mActivity;

    public StoreAdapter(Activity mActivity, List<StoreBean.CategoryEntity> category) {
        this.mActivity=mActivity;
        this.category=category;
    }

    @Override
    public int getCount() {
        return category.size();
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder=null;
        if(convertView==null) {
            holder=new ViewHolder();
            convertView=View.inflate(mActivity, R.layout.store_list_item,null);
            holder.ivColor = (ImageView)convertView.findViewById(R.id.iv_color);
            holder.tvCatagoryName = (TextView)convertView.findViewById(R.id.tv_catagory_name);
            holder.tvCatagoryMore = (TextView)convertView.findViewById(R.id.tv_catagory_more);
            holder.ivCatagoryTop = (ImageView)convertView.findViewById(R.id.iv_catagory_top);
            holder.ivCatagorySublist0 = (ImageView)convertView.findViewById(R.id.iv_catagory_sublist0);
            holder.tvCatagorySublist0Title = (TextView)convertView.findViewById(R.id.tv_catagory_sublist0_title);
            holder.tvCatagorySublist0Price = (TextView)convertView.findViewById(R.id.tv_catagory_sublist0_price);
            holder.ivCatagorySublist1 = (ImageView)convertView.findViewById(R.id.iv_catagory_sublist1);
            holder.tvCatagorySublist1Title = (TextView)convertView.findViewById(R.id.tv_catagory_sublist1_title);
            holder.tvCatagorySublist1Price = (TextView)convertView.findViewById(R.id.tv_catagory_sublist1_price);
            holder.ivCatagorySublist2 = (ImageView)convertView.findViewById(R.id.iv_catagory_sublist2);
            holder.tvCatagorySublist2Title = (TextView)convertView.findViewById(R.id.tv_catagory_sublist2_title);
            holder.tvCatagorySublist2Price = (TextView)convertView.findViewById( R.id.tv_catagory_sublist2_price );
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }

        StoreBean.CategoryEntity categoryEntity = category.get(position);

        holder.ivColor.setBackgroundColor(Color.parseColor(categoryEntity.getColorValue()));
        holder.tvCatagoryName.setText(categoryEntity.getName());
        ImageUtils.loadImage(mActivity, categoryEntity.getImage(), holder.ivCatagoryTop, R.drawable.img_default_300x200);

        ImageUtils.loadImage(mActivity, categoryEntity.getSubList().get(0).getImage(), holder.ivCatagorySublist0);
        holder.tvCatagorySublist0Title.setText(categoryEntity.getSubList().get(0).getTitle());

        ImageUtils.loadImage(mActivity, categoryEntity.getSubList().get(1).getImage(), holder.ivCatagorySublist1);
        holder.tvCatagorySublist1Title.setText(categoryEntity.getSubList().get(1).getTitle());

        ImageUtils.loadImage(mActivity, categoryEntity.getSubList().get(2).getImage(), holder.ivCatagorySublist2);
        holder.tvCatagorySublist2Title.setText(categoryEntity.getSubList().get(2).getTitle());

        return convertView;
    }

    @Override
    public void setMoreData(Object obj) {

    }

    @Override
    public boolean isCompleteLoadMore() {
        return false;
    }

    @Override
    public View getHeadView() {
        return null;
    }

    static class ViewHolder{
        private ImageView ivColor;
        private TextView tvCatagoryName;
        private TextView tvCatagoryMore;
        private ImageView ivCatagoryTop;
        private ImageView ivCatagorySublist0;
        private TextView tvCatagorySublist0Title;
        private TextView tvCatagorySublist0Price;
        private ImageView ivCatagorySublist1;
        private TextView tvCatagorySublist1Title;
        private TextView tvCatagorySublist1Price;
        private ImageView ivCatagorySublist2;
        private TextView tvCatagorySublist2Title;
        private TextView tvCatagorySublist2Price;
    }
}
