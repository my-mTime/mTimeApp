package com.atguigu.mtimeapp.utils;

/**
 * Created by 杨勇康 on 2016/4/9 0009.
 * 网络url工具类
 */
public class NetUtils {

    public static final String CITY_URL = "http://api.m.mtime.cn/Showtime/HotCitiesByCinema.api";

    public static final String HOME_TOP_FIRST = "http://m.mtime.cn/#!/news/movie/1554113/";
    public static final String HOME_TOP_SECOND = "http://m.mtime.cn/#!/news/movie/1554202/";
    public static final String HOME_TOP_THREAD = "http://feature.mtime.cn/mobile/item/2016/0401_bs/";

    /**
     * 正在热映的list数据
     * 后面加上当地的id,例如北京
     * ?locationId=290
     */
    public static final String MOVIE_LIST = "http://api.m.mtime.cn/Showtime/LocationMovies.api";
    /**
     * 演职人员
     * ?movieId=211903
     */
    public static final String PERSON_IN_MOVIE = "http://api.m.mtime.cn/Movie/MovieCreditsWithTypes.api";
    /**
     * 相关新闻
     * ?movieId=211903&pageIndex=1
     */
    public static final String MOVIE_NEWS = "http://api.m.mtime.cn/Movie/News.api";
    /**
     * 电影评论，修改id，获得对应的请求数据
     * ?movieId=211903&pageIndex=1 ,追加请求信息
     */
    public static  final String MOVIE_DISCUSS = "http://api.m.mtime.cn/Showtime/MovieComments.api";
}
