package com.example.chris.fissiontest;

import android.graphics.Rect;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import junit.framework.Assert;

import java.io.File;

/**
 * Created by Chris on 2016/7/18.
 */
public class MethodInfo  extends UiAutomatorTestCase  {
    UserInfo user=new UserInfo();

    //     打开应用
    public void openApp(String app) throws UiObjectNotFoundException {
        UiObject SnApp = new UiObject(new UiSelector().description(app));
        SnApp.clickAndWaitForNewWindow();
    }

    //     菜单
    public void intoMenu() throws UiObjectNotFoundException {
        UiObject myMenu = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/iv_action_open_drawer"));
       // return myMenu.clickAndWaitForNewWindow();
        myMenu.clickAndWaitForNewWindow();
       // Assert.assertEquals(myMenu.getText(),"Sign In" );
    }

    //    个人中心出的登陆按钮
    public void loginButton() throws UiObjectNotFoundException {
        UiObject loginButton = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/rl_main_slide_no_login").className("android.widget.RelativeLayout"));
        loginButton.clickAndWaitForNewWindow();
//        loginButton.click();
    }

    //    选择登陆方式为邮箱登陆
    public void emailLogin() throws UiObjectNotFoundException {
        UiObject emailLogin = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/tv_login_redirect"));
        emailLogin.clickAndWaitForNewWindow();
    }

    //    登录
    public void loginIn() throws UiObjectNotFoundException {
        UiObject loginIn   = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/btn_login_sign_in"));
        loginIn.clickAndWaitForNewWindow();
    }

    //    输入邮箱
    public void emailInput() throws UiObjectNotFoundException {
        UiObject emailInput = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/et_login_email"));
        emailInput.clickAndWaitForNewWindow();
        emailInput.setText(user.loginEmail);
    }

    //    输入密码
    public void pwdInput() throws UiObjectNotFoundException {
        UiObject pwdInput = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/et_login_password"));
        pwdInput.clickAndWaitForNewWindow();
        pwdInput.setText(user.loginPwd);
    }

    //找的用户ID
    public void getUid() throws UiObjectNotFoundException {
//        UiObject getUid = new UiObject(new UiSelector().text(user.uId));
        UiObject getUid=new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/tv_silde_userid"));
        //assertEquals(getUid.getText(),"ID: "+user.uId);
        assertEquals(getUid.getText().substring(4),user.uId);

    }
    //

    

    //    facebook 登录入口
    public void facebookLogin() throws UiObjectNotFoundException {
        UiObject facebookLogin=new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/rl_login_facebook"));
        facebookLogin.clickAndWaitForNewWindow();
      }

   //    twitter 登录入口
    public void twitterLogin() throws UiObjectNotFoundException {
        UiObject twitterLogin = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/rl_login_twitter"));
        twitterLogin.clickAndWaitForNewWindow();

    }
    //   Google 登录入口
    public void googleLogin() throws UiObjectNotFoundException {
        UiObject googleLogin = new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/rl_login_google"));
        googleLogin.clickAndWaitForNewWindow();

    }

    //    设置
    public void setting() throws UiObjectNotFoundException {
        UiObject setting =new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/ll_main_setting"));
        setting.clickAndWaitForNewWindow();
    }


    //    退出登录
    public void  loginOut() throws UiObjectNotFoundException {
        UiObject loginOut =new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/ll_set_logout"));
        loginOut.clickAndWaitForNewWindow();
//        return loginOut.clickAndWaitForNewWindow();
    }

    /**
     * @param name  文件名字  需要 写文件 权限
     * */
    public void screenShot(String name){
        if(name==null || "".equals(name)){
            name= System.currentTimeMillis()+"";
        }
        String path = "/sdcard/screenshot/"+name+".png";
        //   /sdcard/hemeng1.png
        getUiDevice().takeScreenshot(new File(path), 0, 50);


    }



    //twitter  授权
    public void  twAllow() throws UiObjectNotFoundException {
        UiObject twAllow =new UiObject(new UiSelector().resourceId("com.twitter.android:id/ok_button"));
        twAllow.clickAndWaitForNewWindow();
        twAllow=new UiObject(new UiSelector().resourceId("com.fission.sevennujoom:id/tw__allow_btn"));
        twAllow.clickAndWaitForNewWindow();

    }
    //google 选择第一个用户
    public void  selectAccount() throws UiObjectNotFoundException {
        UiObject loginOut =new UiObject(new UiSelector().resourceId("com.google.android.gms:id/account_profile_picture"));
        loginOut.clickAndWaitForNewWindow();

    }




}