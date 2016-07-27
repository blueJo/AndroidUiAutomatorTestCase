package com.example.chris.fissiontest;

import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

/**
 * Created by Chris on 2016/7/19.
 */
public class OtherAppInfo extends UiAutomatorTestCase{
    public void sdLogin() throws UiObjectNotFoundException {
        UiObject sdLongin = new UiObject(new UiSelector().resourceId("com.github.shadowsocks:id/fab"));
        sdLongin.clickAndWaitForNewWindow();
    }
}
