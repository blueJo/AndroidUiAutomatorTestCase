package com.example.chris.fissiontest;

import android.support.test.uiautomator.UiObjectNotFoundException;

/**
 * Created by Chris on 2016/7/21.
 */
public class GoogleLogin extends  MethodInfo {


    /**
     * 前置条件：无用户登录。翻墙工具未打开
     */
    OtherAppInfo appInfo=new OtherAppInfo();

    public void testTWLogin() throws UiObjectNotFoundException {

        getUiDevice().pressHome();
//        打开翻墙应用
        openApp("Shadowsocks");
        appInfo.sdLogin();
        sleep(5000);
//      home
        getUiDevice().pressHome();
        openApp("7Nujoom");
//        菜单
        intoMenu();
//        登录按钮
        loginButton();
//        G登录
        googleLogin();
//        选择登陆的账号
        selectAccount();

//        个人中心
        intoMenu();

//        截图
        screenShot("GoogleLoginIn");

        setting();
        loginOut();
        getUiDevice().pressBack();

    }


}
