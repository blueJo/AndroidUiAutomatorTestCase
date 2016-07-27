package com.example.chris.fissiontest;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObjectNotFoundException;

import java.io.File;
import java.io.IOException;

/**
 * Created by Chris on 2016/7/18.
 */
public class FacebookLoginTest extends MethodInfo {

    /**
     * 前置条件：无用户登录。翻墙工具未打开
     */
    OtherAppInfo appInfo=new OtherAppInfo();

    public void testFBLogin() throws UiObjectNotFoundException {

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
//        fb登录
        facebookLogin();

//        个人中心
        intoMenu();

//        截图
        screenShot("FBLoginIn");
        setting();
        loginOut();
        getUiDevice().pressBack();

        getUiDevice().pressHome();

    }


}
