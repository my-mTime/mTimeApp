package com.atguigu.mtimeapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;
import com.atguigu.mtimeapp.adapter.CityListAdapter;
import com.atguigu.mtimeapp.domain.CityInfo;
import com.atguigu.mtimeapp.utils.CacheUtils;
import com.atguigu.mtimeapp.utils.CityListSort;
import com.atguigu.mtimeapp.utils.NetUtils;
import com.atguigu.mtimeapp.view.MyGrideView;
import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class LocatorActivity extends Activity {
    //主布局中
    private EditText et_tatil_search;
    private TextView tv_cancle;
    private ListView lv_city_content;
    private ImageView iv_top_left;
    private MyListAdapter adapter;
    private TextView tv_choice_city;
    private String json;
    private LinearLayout ll_input_cityname;
    private int cityId;

    private List<String> sections;//保存显示的大写字母

    public LocationClient mLocationClient;
    public MyLocationListener myLocationListener = new MyLocationListener();

    /**
     * 城市定位的实体类
     */
    private CityInfo cityInfo;

    private List<CityInfo.PEntity> pEntities;

    private Map<String, List<CityInfo.PEntity>> listData;

    //头部布局中
    private View viewHeader;
    private TextView city_name;

    //热门城市布局
    private View viewHotCity;
    private MyGrideView gv_hotcity_countent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        setContentView(R.layout.activity_locator);
        et_tatil_search = (EditText) findViewById(R.id.et_tatil_search);
        tv_cancle = (TextView) findViewById(R.id.tv_cancle);
        ll_input_cityname = (LinearLayout) findViewById(R.id.ll_input_cityname);

        lv_city_content = (ListView) findViewById(R.id.lv_city_content);
        iv_top_left = (ImageView) findViewById(R.id.iv_top_left);
        tv_choice_city = (TextView) findViewById(R.id.tv_choice_city);
        tv_choice_city.setVisibility(View.VISIBLE);

        //设置EditText可以获取焦点
        et_tatil_search.setFocusableInTouchMode(true);
        //EditText 获取和失去焦点监听
        et_tatil_search.setOnFocusChangeListener(new MyOnFocusChangeListener());
        tv_cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_input_cityname.requestFocus();
                tv_cancle.setVisibility(View.GONE);
                et_tatil_search.setText("");
            }
        });

        iv_top_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocatorActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //头部布局
        viewHeader = View.inflate(this, R.layout.locator_header, null);
        mLocationClient = new LocationClient(this);
        mLocationClient.registerLocationListener(myLocationListener);
        city_name = (TextView) viewHeader.findViewById(R.id.city_name);
        //定位
        setLocationOption();
        mLocationClient.start();

        //热门城市布局
        viewHotCity = View.inflate(this, R.layout.hot_city, null);
        gv_hotcity_countent = (MyGrideView) viewHotCity.findViewById(R.id.gv_hotcity_countent);
        gv_hotcity_countent.setAdapter(new HotGridViewAdapter());

        //添加头部
        lv_city_content.addHeaderView(viewHeader);
        lv_city_content.addHeaderView(viewHotCity);
    }

    /**
     * 加载数据
     */
    private void initData() {
        json = CacheUtils.getString(this, NetUtils.CITY_URL);
        if (!"".equals(json)) {
            parsersData(json);
        }
        getDatafromNet();
    }

    /**
     * 从网络上获取数据
     */
    private void getDatafromNet() {
        RequestParams params = new RequestParams(NetUtils.CITY_URL);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String json) {
                parsersData(json);//解析网络数据
                Log.e("TAG", "json:" + json);
                CacheUtils.putString(LocatorActivity.this, NetUtils.CITY_URL, json);//存入缓存
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Toast.makeText(LocatorActivity.this, "请检查网络设置", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    /**
     * 解析网络数据
     *
     * @param json
     */
    private void parsersData(String json) {
        parsersJson(json);
    }

    /**
     * 解析Json数据
     *
     * @param json
     */
    private void parsersJson(String json) {
        cityInfo = getCityinfo(json);
        pEntities = cityInfo.getP();
        //排序
        Collections.sort(pEntities, new Comparator<CityInfo.PEntity>() {
            @Override
            public int compare(CityInfo.PEntity lhs, CityInfo.PEntity rhs) {
                return lhs.getPinyinFull().substring(0, 1).toUpperCase().
                        compareTo(rhs.getPinyinFull().substring(0, 1).toUpperCase());
            }
        });

        //储存显示的首字母
        sections = new ArrayList<>();
        for (int i = 0; i < pEntities.size(); i++) {
            String currentName = pEntities.get(i).getPinyinFull().substring(0, 1).toUpperCase();
            if (i == 0) {
                sections.add(currentName);
            } else {
                String preName = pEntities.get(i - 1).getPinyinFull().substring(0, 1).toUpperCase();
                if (!currentName.equals(preName)) {
                    sections.add(currentName);
                }
            }
        }
        listData = CityListSort.putListData(pEntities);
        adapter = new MyListAdapter();
        lv_city_content.setAdapter(adapter);
    }

    private CityInfo getCityinfo(String json) {
        return new Gson().fromJson(json, CityInfo.class);
    }

    //定位设置相关参数
    private void setLocationOption() {

        LocationClientOption option = new LocationClientOption();
        option.setCoorType("bd09ll");
        option.setScanSpan(10000);// 10分钟扫描1次
        option.setOpenGps(true); //打开gps
        option.setServiceName("com.baidu.location.service_v2.9");
        // 设置是否返回POI的电话和地址等详细信息。默认值为false，即不返回POI的电话和地址信息。
        option.setPoiExtraInfo(true);
        // 需要地址信息，设置为其他任何值（string类型，且不能为null）时，都表示无地址信息。
        option.setAddrType("all");
        option.setPriority(LocationClientOption.NetWorkFirst);//网络
        option.setPriority(LocationClientOption.GpsFirst); //gps
        option.setPoiNumber(3);
        //禁用启用缓存定位数据
        option.disableCache(true);
        mLocationClient.setLocOption(option);
    }

    //实现定位
    class MyLocationListener implements BDLocationListener {
        @Override
        public void onReceiveLocation(BDLocation bdLocation) {
            if (bdLocation.getCity() == null) {
                city_name.setText("定位失败，请选择城市");
            } else {
                city_name.setText(bdLocation.getCity());
                Log.e("TAG", "bdLocation.getCity():" + bdLocation.getCity());
            }
        }

        @Override
        public void onReceivePoi(BDLocation bdLocation) {

        }
    }

    /**
     * listview适配器
     */
    class MyListAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return sections.size();
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
            if (convertView == null) {
                viewHolder = new ViewHolder();
                convertView = View.inflate(LocatorActivity.this, R.layout.city_item, null);
                viewHolder.tv_city_index = (TextView) convertView.findViewById(R.id.tv_city_index);
                viewHolder.gv_city_countent = (MyGrideView) convertView.findViewById(R.id.gv_city_countent);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }


            String Word = sections.get(position);

            viewHolder.tv_city_index.setText(Word);


            Log.e("TAG", "Word=" + Word);
            viewHolder.gv_city_countent.setAdapter(new GridViewAdapter(Word));

            return convertView;
        }
    }

    class ViewHolder {
        TextView tv_city_index;
        MyGrideView gv_city_countent;
    }

    /**
     * 热门城市适配器
     */
    class HotGridViewAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 12;
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
            final GridViewHolder hold;
            if (convertView == null) {
                hold = new GridViewHolder();
                convertView = View.inflate(LocatorActivity.this, R.layout.gride_item, null);
                hold.textView = (TextView) convertView.findViewById(R.id.gride_city_name);
                convertView.setTag(hold);
            } else {
                hold = (GridViewHolder) convertView.getTag();
            }
            if (position < 12) {
                hold.textView.setText(pEntities.get(position).getN());
            }
            cityId = pEntities.get(position).getId();
            //item点击监听事件
            hold.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    city_name.setText(hold.textView.getText());
                    Intent intent = new Intent(LocatorActivity.this, MainActivity.class);
                    intent.putExtra("CITY_NAME", hold.textView.getText());
                    intent.putExtra("CITY_ID", cityId);
                    startActivity(intent);
                    finish();
                }
            });
            return convertView;
        }
    }

    /**
     * 城市列表适配器
     */
    class GridViewAdapter extends BaseAdapter {

        private String word;

        public GridViewAdapter(String word) {
            this.word = word;
        }

        @Override
        public int getCount() {
            Log.e("TAG", "listData.get(word).size()=" + listData.get(word).size());
            return listData.get(word).size();
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
            final GridViewHolder hold;
            if (convertView == null) {
                hold = new GridViewHolder();
                convertView = View.inflate(LocatorActivity.this, R.layout.gride_item, null);
                hold.textView = (TextView) convertView.findViewById(R.id.gride_city_name);
                convertView.setTag(hold);
            } else {
                hold = (GridViewHolder) convertView.getTag();
            }
            cityId = listData.get(word).get(position).getId();
            hold.textView.setText(listData.get(word).get(position).getN());
            hold.textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    city_name.setText(hold.textView.getText());
                    Intent intent = new Intent(LocatorActivity.this, MainActivity.class);
                    intent.putExtra("CITY_NAME", hold.textView.getText());
                    intent.putExtra("CITY_ID", cityId);
                    startActivity(intent);
                    finish();
                }
            });
            return convertView;
        }
    }

    class GridViewHolder {
        TextView textView;
    }

    @Override
    protected void onDestroy() {
        mLocationClient.stop();
        super.onDestroy();
    }

    class MyOnFocusChangeListener implements View.OnFocusChangeListener {

        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            if (hasFocus) {
                if (pEntities != null) {
                    tv_cancle.setVisibility(View.VISIBLE);
                    lv_city_content.removeHeaderView(viewHeader);
                    lv_city_content.removeHeaderView(viewHotCity);
                    lv_city_content.setAdapter(new CityListAdapter(LocatorActivity.this, pEntities, et_tatil_search, lv_city_content));
                } else {
                    return;
                }
            } else {
                adapter = new MyListAdapter();
                lv_city_content.setAdapter(adapter);
                //添加头部
                lv_city_content.addHeaderView(viewHeader);
                lv_city_content.addHeaderView(viewHotCity);

            }
        }
    }

}
