package com.atguigu.mtimeapp.lixin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.List;

import okhttp3.Request;

/**
 * 时光热搜榜
 */
public class MTimeHotActivity extends AppCompatActivity {

    private ListView lv_mtimehot;
    private ImageView iv_title_back;
    private TextView tv_title_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtime_hot);

        initView();

        initData();

    }

    private void initData() {

        String url=ContantsUtils.MTIME_HOT;
        OkHttpUtils.get().url(url).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                MTimeHotBean mTimeHotBean = new Gson().fromJson(response, MTimeHotBean.class);
                List<MTimeHotBean.ListEntity> list = mTimeHotBean.getList();
                lv_mtimehot.setAdapter(new MTimeHotAdapter(MTimeHotActivity.this,list));
            }
        });
    }

    private void initView() {
        lv_mtimehot = (ListView)findViewById(R.id.lv_mtimehot);
        iv_title_back = (ImageView)findViewById(R.id.iv_title_back);
        tv_title_name = (TextView)findViewById(R.id.tv_title_name);
    }
}
