package com.example.etablistview_library;

import android.app.Activity;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by 笨货 on 2016/4/1.
 */
public class ETabMainPager extends BasePager {

    private PullToRefreshListView pull_refresh_list;//刷新的控件

    private ListView refreshableView;//列表的ListView

    private int pos;

    public ETabMainPager(Activity mActivity, int pos) {
        super(mActivity);
        this.pos = pos;
    }

    @Override
    public View initView() {
        View view = View.inflate(mActivity, R.layout.etab_pager_layout, null);

        pull_refresh_list = (PullToRefreshListView) view.findViewById(R.id.pull_refresh_list);

        return view;
    }

    @Override
    public void initData() {
        super.initData();
        initListener();
    }

    private void initListener() {

        if (hasMore) {
            hasMoreData();
        } else {
            hasNoMore();
        }

        refreshableView = pull_refresh_list.getRefreshableView();
        refreshableView.setSelector(android.R.color.transparent);

    }

    /**
     * 设置不带上拉加载更多的监听
     */
    private void hasNoMore() {
        pull_refresh_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener<ListView>() {
            @Override
            public void onRefresh(PullToRefreshBase<ListView> refreshView) {
                String label = DateUtils.formatDateTime(mActivity, System.currentTimeMillis(),
                        DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                // Update the LastUpdatedLabel
                refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                getDataFromNet(refreshUrl);
            }
        });
    }

    /**
     * 带上拉加载更多的监听
     */
    private void hasMoreData() {

        if (isAutoLoadMore) {//如果是自动的上拉刷新
            refreshableView.setOnScrollListener(new AbsListView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(AbsListView view, int scrollState) {

                }

                @Override
                public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                    if (totalItemCount - firstVisibleItem <= 4) {//当item滑到倒数第四个的时候开始加载更多
                        getMoreDataFromNet(loadMoreUrl);
                    }
                }
            });
        } else {
            pull_refresh_list.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ListView>() {

                //下拉刷新
                @Override
                public void onPullDownToRefresh(PullToRefreshBase<ListView> refreshView) {
                    String label = DateUtils.formatDateTime(mActivity, System.currentTimeMillis(),
                            DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

                    // Update the LastUpdatedLabel
                    refreshView.getLoadingLayoutProxy().setLastUpdatedLabel(label);

                    getDataFromNet(refreshUrl);
                }

                //上拉加载更多
                @Override
                public void onPullUpToRefresh(PullToRefreshBase<ListView> refreshView) {
                    getMoreDataFromNet(loadMoreUrl);
                }
            });
        }

    }

    /**
     * 上拉加载更多
     *
     * @param loadMoreUrl
     */
    private void getMoreDataFromNet(String loadMoreUrl) {
        RequestParams params = new RequestParams(loadMoreUrl);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (callBackListener != null) {
                    callBackListener.LoadMoreSuccess(result, pos);
                }
                // Call onRefreshComplete when the list has been refreshed.
                pull_refresh_list.onRefreshComplete();//刷新完成
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                if (callBackListener != null) {
                    callBackListener.LoadMoreError(ex, isOnCallback);
                }
                // Call onRefreshComplete when the list has been refreshed.
                pull_refresh_list.onRefreshComplete();//刷新完成
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });

        if (adapter.isCompleteLoadMore()) {
            pull_refresh_list.onRefreshComplete();//刷新完成
        }
    }

    /**
     * 下拉刷新
     *
     * @param refreshUrl
     */
    private void getDataFromNet(String refreshUrl) {
        RequestParams params = new RequestParams(refreshUrl);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                if (callBackListener != null) {
                    callBackListener.RefreshSuccess(result, pos);
                }
                // Call onRefreshComplete when the list has been refreshed.
                pull_refresh_list.onRefreshComplete();//刷新完成
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                if (callBackListener != null) {
                    callBackListener.RefreshError(ex, isOnCallback);
                }
                // Call onRefreshComplete when the list has been refreshed.
                pull_refresh_list.onRefreshComplete();//刷新完成
            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    private boolean hasMore = true;

    /**
     * 是否有更多数据（是否允许上拉加载更多），默认为true
     *
     * @param hasMore
     */
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    private int adapterPos = -1;
    private ETabAdapter adapter;

    private boolean hasHeadView = false;

    /**
     * 设置列表的Adapter
     *
     * @param adapterPos Adapter的下标
     * @param adapter
     */
    public void setPagerAdapter(int adapterPos, ETabAdapter adapter) {
        this.adapterPos = adapterPos;
        this.adapter = adapter;
        //添加头布局
        if (adapter != null) {
            View headView = adapter.getHeadView();
            if (headView != null && !hasHeadView) {
                refreshableView.addHeaderView(headView);
                hasHeadView = true;

                //设置头布局的监听

            }
        }
        refreshableView.setAdapter(adapter);
    }

    private boolean isAutoLoadMore = true;

    /**
     * 是否自动加载更多（即是否隐藏FooterView），默认为true
     *
     * @param isAutoLoadMore
     */
    public void setLoadMoreAuto(boolean isAutoLoadMore) {
        this.isAutoLoadMore = isAutoLoadMore;
    }

//    private boolean IsEnableRefresh = true;
//
//    /**
//     * 是否允许下拉刷新，默认为true
//     *
//     * @param IsEnableRefresh
//     */
//    public void setRefreshEnable(boolean IsEnableRefresh) {
//        this.IsEnableRefresh = IsEnableRefresh;
//    }


    private OnRefreshAndLoadCallBackListener callBackListener;

    public void setOnRefreshAndLoadCallBackListener(OnRefreshAndLoadCallBackListener callBackListener) {
        this.callBackListener = callBackListener;
    }

    private String refreshUrl;

    /**
     * 设置下拉刷新的Url
     *
     * @param refreshUrl
     */
    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    private String loadMoreUrl;

    /**
     * 设置上拉加载更多的Url
     *
     * @param loadMoreUrl
     */
    public void setLoadMoreUrl(String loadMoreUrl) {
        this.loadMoreUrl = loadMoreUrl;
    }

    private View headView = null;

    /**
     * 设置头布局
     *
     * @param headView
     */
    public void setHeadView(View headView) {
        this.headView = headView;
    }

    /**
     * 下拉刷新和上拉加载更多的回调
     */
    public interface OnRefreshAndLoadCallBackListener {
        void RefreshSuccess(String result, int pos); // 刷新成功的回调

        void RefreshError(Throwable ex, boolean isOnCallback); // 刷新失败的回调

        void LoadMoreSuccess(String result, int pos); //加载更多成功的回调

        void LoadMoreError(Throwable ex, boolean isOnCallback); //加载更多失败的回调
    }
}
