package com.atguigu.mtimeapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by 杨勇康 on 2016/3/17 0017.
 * 缓存工具类
 */
public class CacheUtils {
    /**
     * 缓存文本数据
     * @param context
     * @param key
     * @param values
     */
    public static void putString(Context context,String key,String values){
        SharedPreferences sp = context.getSharedPreferences("atguigu",Context.MODE_PRIVATE);
        sp.edit().putString(key,values).commit();
    }
    /**
     * 得到缓存的文本数据
     * @param context
     * @param key
     * @return
     */
    public static String getString(Context context,String key){
        SharedPreferences sp = context.getSharedPreferences("atguigu",Context.MODE_PRIVATE);
        return sp.getString(key,"");//没得到数据返回空字符串，防止空指针
    }
    /**
     * 缓存boolean
     * @param context
     * @param key
     * @param values
     */
    public static void putboolen(Context context,String key,boolean values){
        SharedPreferences sp = context.getSharedPreferences("atguigu",Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, values).commit();
    }
    /**
     * 得到缓存的boolean数据
     * @param context
     * @param key
     * @return
     */
    public static boolean getboolean(Context context,String key){
        SharedPreferences sp = context.getSharedPreferences("atguigu",Context.MODE_PRIVATE);
        return sp.getBoolean(key, false);//没得到数据返回空字符串，防止空指针
    }

    /**
     * 保存较大的数据
     * @param context
     * @param key
     * @param values
     */

    public static void saveBigString(Context context,String key,String values){
        SharedPreferences sp = context.getSharedPreferences("atguigu",Context.MODE_PRIVATE);
        if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {//判断SD卡是否挂在
            try {
                File file = Environment.getExternalStorageDirectory();
                String fileName = MD5Encoder.encode(key);
                file = new File(file+"/timenet",fileName);
                File parentFile = file.getParentFile();
                if(!file.exists()) {
                    file.createNewFile();
                }
                if(!parentFile.exists()) {
                    parentFile.mkdir();
                }
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(values.getBytes());
                fos.flush();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            sp.edit().putString(key,values).commit();
        }
    }
    /**
     * 根据key值获取string类型的数据(默认为"")
     * @param key
     * @return
     */
    public static String getBigStringValue(Context context,String key){
        SharedPreferences sp = context.getSharedPreferences("atguigu",Context.MODE_PRIVATE);
        String result = "";
        if(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            try {
                File file = Environment.getExternalStorageDirectory();
                String fileName = MD5Encoder.encode(key);
                file = new File(file+"/timenet",fileName);
                if(file.exists()) {
                    FileInputStream fis = new FileInputStream(file);
                    byte[] buffur = new byte[1024];
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    int length = -1;
                    while ((length = fis.read(buffur))!= -1){
                        bos.write(buffur,0,length);
                    }
                    fis.close();
                    bos.close();
                    result = bos.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            result = sp.getString(key,result);
        }
        return result;
    }
}
