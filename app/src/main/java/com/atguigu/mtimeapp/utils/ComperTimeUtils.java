package com.atguigu.mtimeapp.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 杨勇康 on 2016/4/11 0011.
 * 比较时间工具类
 */
public class ComperTimeUtils {
    public static boolean compareTime(String time){
        int i = Integer.parseInt(time);
        Date date=new Date();
        System.out.print(date);
        DateFormat format=new SimpleDateFormat("yyyyMMdd");
        String format1 = format.format(date);
        int j = Integer.parseInt(format1);
        return i>j;
    }
}
