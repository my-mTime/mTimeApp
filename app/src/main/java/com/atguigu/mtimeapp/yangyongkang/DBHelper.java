package com.atguigu.mtimeapp.yangyongkang;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 数据库操作的工具类
 * Created by 杨勇康 on 2016/1/31 0031.
 */
public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context,"shop.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //创建购物车商品的表
        db.execSQL("create table shopping_info(_id integer primary key autoincrement,name varchar," +
                "number integer,price double)");

        ContentValues values = new ContentValues();
        values.put("name","第一个物品");
        values.put("number",1);
        values.put("price",49.00);
        db.insert("shopping_info",null,values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {//版本更新执行

    }
}
