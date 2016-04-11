package com.atguigu.mtimeapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.atguigu.mtimeapp.R;

import java.util.HashMap;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

/**
 * Created by FlagWu on 2016/4/10.
 * 账户注册页面
 */
public class RegisterActivity extends Activity{

    private String number;

    private EditText phoneNum;//电话号码
    private EditText password;//密码
    private EditText captcha;//验证码
    private RadioGroup gender;//性别
    private CheckBox agree;//同意条款
    private TextView clause;//条款

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        phoneNum = (EditText) findViewById(R.id.reg_phonenum);
        password = (EditText) findViewById(R.id.reg_password);
        captcha = (EditText) findViewById(R.id.reg_captcha);
        gender = (RadioGroup) findViewById(R.id.reg_gender);
        agree = (CheckBox) findViewById(R.id.reg_agree);
        clause = (TextView) findViewById(R.id.tv_reg_clause);
        SMSSDK.registerEventHandler(eh);
    }

    /**
     * 短信验证的回调监听
     */
    private EventHandler eh = new EventHandler() {
        @Override
        public void afterEvent(int event, int result, Object data) {
            super.afterEvent(event, result, data);
            if (result == SMSSDK.RESULT_COMPLETE) {//回调完成
                //提交验证码成功，如果检验成功会在data里返回数据。data数据类型为HashMap<number, code>
                if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
                    Log.e("TAG", "提交验证码成功" + data.toString());
                    HashMap<String, Object> mData = (HashMap<String, Object>) data;
                    String country = (String) mData.get("country");//返回国家编号
                    String phone = (String) mData.get("phone");//返回手机号
                    Log.e("TAG", country + "----" + phone);

                    if (phone.equals(number)){
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(RegisterActivity.this, "通过验证", Toast.LENGTH_SHORT).show();
                            }
                        });
                    } else {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(RegisterActivity.this, "验证码错误", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                } else if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {//获取验证码成功
                    Log.e("TAG", "成功获取验证码");
                } else if (event == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES){//返回支持发送验证码的国家

                }
            } else {
                ((Throwable) data).printStackTrace();
            }
        }
    };

    /**
     * 获取短信验证码
     * @param v
     */
    public void obtainCaptcha(View v){
        number = phoneNum.getText().toString().trim();
        //发送短信，传入国家号和电话
        if (TextUtils.isEmpty(number)) {
            Toast.makeText(this, "手机号码不能为空！", Toast.LENGTH_SHORT).show();
        } else {
            SMSSDK.getVerificationCode("+86", number);
            Toast.makeText(this, "验证码已发送至:" + number, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 提交注册信息
     * @param v
     */
    public void commit(View v){
        String phone = phoneNum.getText().toString();
        String pwd = password.getText().toString();
        String cl = clause.getText().toString();

        String security = captcha.getText().toString();

                if (!TextUtils.isEmpty(phone) &&
                        !TextUtils.isEmpty(pwd) && !TextUtils.isEmpty(cl)){
//                    /**
//                     * 判断手机号是否正确
//                     */
//                    if (!PDUtils.isMobileNum(phone)){
//                        /**
//                         * 判断密码是否合法
//                         */
//                        if (PDUtils.isPassword(pwd)){
//
//                        } else {
//                            Toast.makeText(RegisterActivity.this, "密码格式不正确", 0).show();
//                        }
//
//                    } else {
//                        Toast.makeText(RegisterActivity.this, "请输入正确的手机号", 0).show();
//                    }
                    if (!TextUtils.isEmpty(security)) {
                        //提交短信验证码
                        SMSSDK.submitVerificationCode("+86", number, security);//国家号，手机号码，验证码
                        if (number != null){
//                            Toast.makeText(this, "提交了注册信息:" + number, Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(this, "请输入正确的验证码", Toast.LENGTH_SHORT).show();
                            return;
                        }
                    } else {
                        Toast.makeText(this, "验证码不能为空", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (agree.isChecked()){
                        Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        Toast.makeText(RegisterActivity.this, "请阅读并同意服务条款", Toast.LENGTH_SHORT).show();
                        return;
                    }

                } else {
                    Toast.makeText(RegisterActivity.this, "信息输入不完整", Toast.LENGTH_SHORT).show();
                }
    }
}
