package com.example.chris.fissiontest;


import android.os.RemoteException;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import java.io.File;
import java.io.InputStreamReader;
import java.io.LineNumberReader;


/**
 * Created by Chris on 2016/7/15.
 */
public class LoginTest extends MethodInfo {

    /**
     * 请确保应用上没有用户登录
     */


    public void testLogin() throws UiObjectNotFoundException {

        getUiDevice().pressHome();
//         打开应用
       openApp("7Nujoom");


//        菜单
        intoMenu();
//        截图
        screenShot("signIn");

//        登录按钮
        loginButton();

//        邮箱登录
        emailLogin();

//        输入邮箱
        emailInput();

//        输入密码
        pwdInput();

//        取消键盘
        getUiDevice().pressBack();

//        点击登录按钮
        loginIn();

//        个人中心
        intoMenu();

//        获取用户ID
        getUid();

//        截图
        screenShot("loginIn");
        setting();
        loginOut();

        getUiDevice().pressBack();

//        System.out.println(getUiDevice().takeScreenshot(new File("/sdcard/hemeng1.png"), 0, 50));
    }

}
