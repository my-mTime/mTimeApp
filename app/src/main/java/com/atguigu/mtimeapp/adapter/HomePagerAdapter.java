package com.atguigu.mtimeapp.adapter;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.domain.HomeTimeBean;
import com.example.benhuo_library.lib.utils.image.image.ImageUtils;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by 笨货 on 2016/4/10.
 */
public class HomePagerAdapter extends MyBaseAdapter {

    private List<HomeTimeBean.DataEntity> data;
    private Activity mActivity;

    public HomePagerAdapter(Activity mActivity, List<HomeTimeBean.DataEntity> data) {
        this.mActivity = mActivity;
        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        String tag = data.get(position).getTag();
        int typeTag = -1;
        switch (tag) {
            case "图集":
                typeTag = 0;
                break;
            case "简讯":
                typeTag = 1;
                break;
            case "猜电影":
                typeTag = 2;
                break;
            case "影评":
                typeTag = 3;
                break;
            case "头条":
                typeTag = 4;
                break;
            default:
                Log.e("TAG", "typeTag=" + typeTag);
                break;
        }
        return typeTag;
    }

    @Override
    public int getViewTypeCount() {
        return 5;
    }

    @Override
    public int getCount() {
        return data.size();
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
        String tag = data.get(position).getTag();
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            switch (tag) {
                case "图集":
                    convertView = View.inflate(mActivity, R.layout.home_hotpoint_photo_item, null);
                    holder.tvHopointphTag = (TextView) convertView.findViewById(R.id.tv_hopointph_tag);
                    holder.tvHopointphName = (TextView) convertView.findViewById(R.id.tv_hopointph_name);
                    holder.tvHopointphTitle = (TextView) convertView.findViewById(R.id.tv_hopointph_title);
                    holder.ivHopointphPic0 = (ImageView) convertView.findViewById(R.id.iv_hopointph_pic0);
                    holder.ivHopointphPic1 = (ImageView) convertView.findViewById(R.id.iv_hopointph_pic1);
                    holder.ivHopointphPic2 = (ImageView) convertView.findViewById(R.id.iv_hopointph_pic2);
                    holder.tv_hopointph_time = (TextView) convertView.findViewById(R.id.tv_hopointph_time);
                    holder.tv_hopointph_comment = (TextView) convertView.findViewById(R.id.tv_hopointph_time);
                    convertView.setTag(holder);
                    break;
                case "简讯":
                    convertView = View.inflate(mActivity, R.layout.home_hotpoint_default_item, null);
                    holder.tvHopointdeTag = (TextView) convertView.findViewById(R.id.tv_hopointde_tag);
                    holder.llHopointdeTitle = (LinearLayout) convertView.findViewById(R.id.ll_hopointde_title);
                    holder.tvHopointdeName = (TextView) convertView.findViewById(R.id.tv_hopointde_name);
                    holder.tvHopointdeTitle = (TextView) convertView.findViewById(R.id.tv_hopointde_title);
                    holder.ivHopointdePic = (ImageView) convertView.findViewById(R.id.iv_hopointde_pic);
                    holder.tv_hopointde_time = (TextView) convertView.findViewById(R.id.tv_hopointde_time);
                    holder.tv_hopointde_comment = (TextView) convertView.findViewById(R.id.tv_hopointde_comment);
                    convertView.setTag(holder);
                    break;
                case "猜电影":
                    convertView = View.inflate(mActivity, R.layout.home_hotpoint_link_item, null);
                    holder.tvHopointliTag = (TextView) convertView.findViewById(R.id.tv_hopointli_tag);
                    holder.tvHopointliName = (TextView) convertView.findViewById(R.id.tv_hopointli_name);
                    holder.tvHopointliTitle = (TextView) convertView.findViewById(R.id.tv_hopointli_title);
                    holder.ivHopointliPic = (ImageView) convertView.findViewById(R.id.iv_hopointli_pic);
                    convertView.setTag(holder);
                    break;
                case "影评":
                    convertView = View.inflate(mActivity, R.layout.home_hotpoint_filmreview_item, null);
                    holder.tvHopointfilmreTag = (TextView) convertView.findViewById(R.id.tv_hopointfilmre_tag);
                    holder.tvHopointfilmreName = (TextView) convertView.findViewById(R.id.tv_hopointfilmre_name);
                    holder.tvHopointfilmreDesc = (TextView) convertView.findViewById(R.id.tv_hopointfilmre_desc);
                    holder.profileImage = (CircleImageView) convertView.findViewById(R.id.profile_image);
                    holder.tvHopointfilmreComment = (TextView) convertView.findViewById(R.id.tv_hopointfilmre_comment);
                    holder.ivHopointfilmrePic = (ImageView) convertView.findViewById(R.id.iv_hopointfilmre_pic);
                    holder.tvHopointfilmreScore = (TextView) convertView.findViewById(R.id.tv_hopointfilmre_score);
                    convertView.setTag(holder);
                    break;
                case "头条":
                    convertView = View.inflate(mActivity, R.layout.home_hotpoint_headline_item, null);
                    holder.tvHopointheadliTag = (TextView) convertView.findViewById(R.id.tv_hopointheadli_tag);
                    holder.llHopointdeTitle = (LinearLayout) convertView.findViewById(R.id.ll_hopointli_title);
                    holder.tvHopointheadliName = (TextView) convertView.findViewById(R.id.tv_hopointheadli_name);
                    holder.tvHopointheadliTitle = (TextView) convertView.findViewById(R.id.tv_hopointheadli_title);
                    holder.iv_hopointheadli_pic = (ImageView) convertView.findViewById(R.id.iv_hopointheadli_pic);
                    holder.tv_hopointheadli_time = (TextView) convertView.findViewById(R.id.tv_hopointheadli_time);
                    holder.tv_hopointheadli_comment = (TextView) convertView.findViewById(R.id.tv_hopointheadli_comment);
                    convertView.setTag(holder);
                    break;
            }

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        HomeTimeBean.DataEntity dataEntity = data.get(position);

        switch (tag) {
            case "图集":
                holder.tvHopointphTag.setText(dataEntity.getTag());
                holder.tvHopointphTitle.setText(dataEntity.getContent());
                holder.tvHopointphName.setText(dataEntity.getTitle());
                ImageUtils.loadImage(mActivity, dataEntity.getImg1(), holder.ivHopointphPic0, R.drawable.img_default_90x90);
                ImageUtils.loadImage(mActivity, dataEntity.getImg2(), holder.ivHopointphPic1, R.drawable.img_default_45x45);
                ImageUtils.loadImage(mActivity, dataEntity.getImg3(), holder.ivHopointphPic2, R.drawable.img_default_45x45);
                holder.tv_hopointph_time.setText(dataEntity.getPublishTime() + "");
                holder.tv_hopointph_comment.setText("评论 " + dataEntity.getCommentCount());
                break;
            case "简讯":
                holder.tvHopointdeTag.setText(dataEntity.getTag());
                holder.tvHopointdeName.setText(dataEntity.getTitle());
                holder.tvHopointdeTitle.setText(dataEntity.getContent());
                ImageUtils.loadImage(mActivity, dataEntity.getImg1(), holder.ivHopointdePic, R.drawable.img_default_300x200);
                holder.tv_hopointde_time.setText(dataEntity.getPublishTime() + "");
                holder.tv_hopointde_comment.setText("评论 " + dataEntity.getCommentCount());
                break;
            case "猜电影":
                holder.tvHopointliTag.setText(dataEntity.getTag());
                holder.tvHopointliName.setText(dataEntity.getTitle());
                holder.tvHopointliTitle.setText(dataEntity.getMemo());
                ImageUtils.loadImage(mActivity, dataEntity.getPic1Url(), holder.ivHopointliPic, R.drawable.img_default_45x45);
                break;
            case "影评":
                holder.tvHopointfilmreTag.setText(dataEntity.getTag());
                holder.tvHopointfilmreName.setText(dataEntity.getTitle());
                holder.tvHopointfilmreDesc.setText("    " + dataEntity.getSummaryInfo());
                ImageUtils.loadImage(mActivity, dataEntity.getUserImage(), holder.profileImage, R.drawable.profile_default_head_h90);
                holder.tvHopointfilmreComment.setText(dataEntity.getNickname() + "-评 " + "《" + dataEntity.getRelatedObj().getName() + "》");
                ImageUtils.loadImage(mActivity, dataEntity.getRelatedObj().getImage(), holder.ivHopointfilmrePic, R.drawable.img_default);
                holder.tvHopointfilmreScore.setText(dataEntity.getRelatedObj().getRating() + "");
                break;
            case "头条":
                holder.tvHopointheadliTag.setText(dataEntity.getTag());
                holder.tvHopointheadliName.setText(dataEntity.getTitle());
                holder.tvHopointheadliTitle.setText(dataEntity.getContent());
                ImageUtils.loadImage(mActivity, dataEntity.getImg1(), holder.iv_hopointheadli_pic, R.drawable.img_default_300x200);
                holder.tv_hopointheadli_time.setText(dataEntity.getPublishTime() + "");
                holder.tv_hopointheadli_comment.setText("评论 " + dataEntity.getCommentCount());
                break;
        }

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

    static class ViewHolder {
        //简讯
        private TextView tvHopointdeTag;
        private LinearLayout llHopointdeTitle;
        private TextView tvHopointdeName;
        private TextView tvHopointdeTitle;
        private ImageView ivHopointdePic;
        private TextView tv_hopointde_time;
        private TextView tv_hopointde_comment;

        //影评
        private TextView tvHopointfilmreTag;
        private TextView tvHopointfilmreName;
        private TextView tvHopointfilmreDesc;
        private CircleImageView profileImage;
        private TextView tvHopointfilmreComment;
        private ImageView ivHopointfilmrePic;
        private TextView tvHopointfilmreScore;

        //头条
        private TextView tvHopointheadliTag;
        private LinearLayout llHopointliTitle;
        private TextView tvHopointheadliName;
        private TextView tvHopointheadliTitle;
        private ImageView iv_hopointheadli_pic;
        private TextView tv_hopointheadli_time;
        private TextView tv_hopointheadli_comment;

        //猜电影
        private TextView tvHopointliTag;
        private TextView tvHopointliName;
        private TextView tvHopointliTitle;
        private ImageView ivHopointliPic;

        //图集
        private TextView tvHopointphTag;
        private TextView tvHopointphName;
        private TextView tvHopointphTitle;
        private ImageView ivHopointphPic0;
        private ImageView ivHopointphPic1;
        private ImageView ivHopointphPic2;
        private TextView tv_hopointph_time;
        private TextView tv_hopointph_comment;

    }
}
