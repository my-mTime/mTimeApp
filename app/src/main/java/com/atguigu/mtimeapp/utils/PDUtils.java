package com.atguigu.mtimeapp.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by FlagWu on 2016/4/10.
 * 判断工具类
 */
public class PDUtils {

    /**
     * 验证手机号
     * @param mobiles
     * @return
     */
    public static boolean isMobileNum(String mobiles){
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);
        return m.matches();

    }

    /**
     * 验证邮箱
     * @param strEmail
     * @return
     */
    public static boolean isEmail(String strEmail) {
        String strPattern = "^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";
        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(strEmail);
        return m.matches();
    }

    /**
     * 验证密码是否合法
     * @param password
     * @return
     */
    public static boolean isPassword(String password){
        String strPwd = "^([a-zA-Z][0-9])\\d{6,20} $";
        Pattern p = Pattern.compile(strPwd);
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
