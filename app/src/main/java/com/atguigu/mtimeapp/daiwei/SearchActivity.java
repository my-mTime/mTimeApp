package com.atguigu.mtimeapp.daiwei;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.utils.ContantsUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Request;

/**
 * Created by daiwei on 2016/4/11.
 *
 * 搜索页面
 */
public class SearchActivity extends Activity implements View.OnClickListener {

    private TextView tvSearchAction;
    private ListView lvSearchHistory;
    private EditText et_search_input;
    private TextView tv_search_hot_text1;
    private TextView tv_search_hot_text2;
    private TextView tv_search_hot_text3;
    private TextView tv_search_hot_text4;
    private ListView lv_search_result;
    private ScrollView sv_search_prompt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();

        initHotData();
    }

    /**
     * 初始化热门搜索数据
     */
    private void initHotData() {
        OkHttpUtils.get().url(ContantsUtils.search_hot).build().execute(new StringCallback() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.optJSONArray("keywords");
                    String str = jsonArray.optString(0);
                    tv_search_hot_text1.setText(str);
                    String str1 = jsonArray.optString(1);
                    tv_search_hot_text1.setText(str1);
                    String str2 = jsonArray.optString(2);
                    tv_search_hot_text1.setText(str2);
                    String str3 = jsonArray.optString(3);
                    tv_search_hot_text1.setText(str3);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    /**
     * 初始化视图
     */
    private void initView() {
        setContentView(R.layout.activity_search);
        findViewById(R.id.iv_search_back).setOnClickListener(this);
        findViewById(R.id.ib_search_scan).setOnClickListener(this);
        tvSearchAction = (TextView) findViewById(R.id.tv_search_action);
        lvSearchHistory = (ListView) findViewById(R.id.lv_search_history);
        et_search_input = (EditText) findViewById(R.id.et_search_input);
        tv_search_hot_text1 = (TextView) findViewById(R.id.tv_search_hot_text1);
        tv_search_hot_text2 = (TextView) findViewById(R.id.tv_search_hot_text2);
        tv_search_hot_text3 = (TextView) findViewById(R.id.tv_search_hot_text3);
        tv_search_hot_text4 = (TextView) findViewById(R.id.tv_search_hot_text4);
        lv_search_result = (ListView) findViewById(R.id.lv_search_result);
        sv_search_prompt = (ScrollView) findViewById(R.id.sv_search_prompt);

        et_search_input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String inputText = et_search_input.getText().toString().trim();
                if (!inputText.isEmpty()) {
                    lv_search_result.setVisibility(View.VISIBLE);
                } else {
                    lv_search_result.setVisibility(View.GONE);
                    sv_search_prompt.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_search_back:
                //TODO implement
                finish();
                break;
            case R.id.ib_search_scan:
                //TODO implement
                startScanner();
                break;

        }
    }

    private void startScanner() {

    }
}
