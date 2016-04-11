package com.atguigu.mtimeapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.activity.MainActivity;
import com.atguigu.mtimeapp.domain.CityInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杨勇康 on 2016/4/10 0010.
 */
public class CityListAdapter extends BaseAdapter {

    private List<CityInfo.PEntity> pEntities;
    private List<CityInfo.PEntity> mpEntities;
    private Context context;
    private EditText editText;
    private ListView listView;
    public CityListAdapter(Context context, List<CityInfo.PEntity> pEntities, EditText editText, ListView listView) {
        this.pEntities = pEntities;
        this.context = context;
        this.editText = editText;
        mpEntities = pEntities;
        this.listView = listView;
    }

    @Override
    public int getCount() {
        return mpEntities.size();
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
        TextView textView = new TextView(context);
        textView.setText(mpEntities.get(position).getN());
        textView.setTextSize(18);
        textView.setPadding(15, 10, 0, 10);
        textView.setTextColor(Color.BLACK);
        editText.addTextChangedListener(new MyTextWatcher());
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("CITY_NAME",mpEntities.get(position).getN());
                intent.putExtra("CITY_ID",mpEntities.get(position).getId());
                context.startActivity(intent);

            }
        });
        return textView;
    }

    /**
     * EditText文字改变监听类
     */
    private class MyTextWatcher implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //根据文本框输入的内容进行筛选
            filterData(s.toString());
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    }

    /**
     * 当输入框有数据输入的时候，进行筛选
     * @param s
     */
    private void filterData(String s) {
        List<CityInfo.PEntity> filterDateList = new ArrayList<CityInfo.PEntity>();

        if(TextUtils.isEmpty(s)){
            filterDateList = pEntities;
        }else{
            filterDateList.clear();
            for(CityInfo.PEntity sortModel : pEntities){
                String name = sortModel.getPinyinShort();
                if(name.indexOf(s) != -1 ){
                    filterDateList.add(sortModel);
                }
            }
        }
        if(filterDateList!=null){
            // 根据a-z进行排序
            updateListView(filterDateList);
        }else{
            Toast.makeText(context, "没有更多数据...", Toast.LENGTH_SHORT).show();
        }
    }
    //当ListView数据发生改变的时候调用此方法更新ListView;
    public void updateListView(List<CityInfo.PEntity> filterDateList) {
        this.mpEntities = filterDateList;
        notifyDataSetChanged();
    }
}
