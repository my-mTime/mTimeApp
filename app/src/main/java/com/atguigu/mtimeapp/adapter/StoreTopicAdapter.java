package com.atguigu.mtimeapp.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.domain.StoreBean;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;

import java.util.List;

/**
 * Created by 笨货 on 2016/4/11.
 */
public class StoreTopicAdapter extends BaseAdapter {

    private List<StoreBean.TopicEntity.SubListEntity> subList;
    private Activity mActivity;

    public StoreTopicAdapter(Activity mActivity, List<StoreBean.TopicEntity.SubListEntity> subList) {
        this.mActivity = mActivity;
        this.subList = subList;
    }

    @Override
    public int getCount() {
        return subList.size();
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
            convertView = View.inflate(mActivity,R.layout.store_starwar_grid_view_item,null);
            holder.ivStarwarsItemIcon = (ImageView) convertView.findViewById(R.id.iv_starwars_item_icon);
            holder.tvStartwarsItemTitle = (TextView) convertView.findViewById(R.id.tv_startwars_item_title);
            holder.tvStartwarsItemPrice = (TextView) convertView.findViewById(R.id.tv_startwars_item_price);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }

        StoreBean.TopicEntity.SubListEntity subListEntity = subList.get(position);
        ImageUtils.loadImage(mActivity,subListEntity.getImage(),holder.ivStarwarsItemIcon);
        holder.tvStartwarsItemTitle.setText(subListEntity.getTitle());

        return convertView;
    }

    static class ViewHolder {
        private ImageView ivStarwarsItemIcon;
        private TextView tvStartwarsItemTitle;
        private TextView tvStartwarsItemPrice;
    }
}
