package com.atguigu.mtimeapp.utils;

/**
 * Created by 笨货 on 2016/4/10.
 */
public class ContantsUtils {

    /**
     * 首页推荐电影的数据
     */
    public static final String HOME_RECOM_FILM = "http://api.m.mtime.cn/PageSubArea/HotPlayMovies.api?locationId=290";
    /**
     * 首页其他数据
     */
    public static final String HOME_PAGER_URL = "http://api.m.mtime.cn/PageSubArea/GetFirstPageAdvAndNews.api";

    /**
     * 搜索页面热门搜索数据
     */
    public static final String search_hot = "http://api.m.mtime.cn/Search/HotKeyWords.api";

    /**
     * 默认搜索结果
     */
    public static final String search_default_result = "http://api.m.mtime.cn/Search/SearchSuggestionNew.api";

    /**
     * 发现 -- 新闻
     */
    public static final String discover_news = "http://api.m.mtime.cn/News/NewsList.api?pageIndex=1";
    /**
     * 发现 -- 预告片
     */
    public static final String discover_prevue = "http://api.m.mtime.cn/PageSubArea/TrailerList.api";
    /**
     * 发现 -- 排行榜
     */
    public static final String discover_leaderboard = "http://api.m.mtime.cn/TopList/TopListOfAll.api?pageIndex=1";
    /**
     * 发现 -- 影评
     */
    public static final String discover_filmComment = "http://api.m.mtime.cn/MobileMovie/Review.api?needTop=false";
    /**
     * 发现 -- 排行榜（每个排行榜的数据）
     */
    public static final String discover_leaderboard_topList = "http://api.m.mtime.cn/TopList/TopListDetailsByRecommend.api?pageIndex=1&pageSubAreaID=2066&locationId={2}";
    /**
     * 发现 -- 四个顶部的数据
     */
    public static final String discover_header = "http://api.m.mtime.cn/PageSubArea/GetRecommendationIndexInfo.api";

    /**
     * 首页时光精选列表
     * pageIndex=1
     * http://api.m.mtime.cn/PageSubArea/GetHomeFeed.api?pageIndex=2 更多数据
     */
    public static final String HOME_TIME_SELECTION = "http://api.m.mtime.cn/PageSubArea/GetHomeFeed.api?";

    /**
     * 商城数据
     */
    public static final String STORE_URL = "http://api.m.mtime.cn/PageSubArea/MarketFirstPageNew.api?lastTime={0}";

    /**
     * 首页-时光热榜
     */
    public static final String MTIME_HOT = "http://api.m.mtime.cn/Movie/hotest.api?pageIndex=1&locationId=727";
    /**
     * 全球票房榜Tag
     */
    public static final String GLOBAL_TOP_TAG= "http://api.m.mtime.cn/TopList/TopListFixedNew.api";
    /**
     * 全球票房榜detail
     * http://api.m.mtime.cn/TopList/TopListDetailsByRecommend.api?pageIndex=1&pageSubAreaID=
     * + 2018（pageSubAreaId） &locationId=+727（城市ID）
     */
    public static final String GLOBAL_TOP_DETAIL= "http://api.m.mtime.cn/TopList/TopListDetailsByRecommend.api?pageIndex=1&pageSubAreaID=";

    /**
     * 电影院选座
     *
     */
    public static final String SELECT_SEAT= "http://api.m.mtime.cn/Showtime/OnlineSeatsByShowTimeID.api?dId=171749994";


}
