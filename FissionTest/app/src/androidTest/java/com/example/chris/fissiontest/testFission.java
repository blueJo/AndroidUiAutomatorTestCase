package com.example.chris.fissiontest;



//import android.app.Instrumentation;
import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.Until;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Chris on 2016/7/13.
 */
//@RunWith(AndroidJUnit4.class)test

public class testFission {

    UiDevice uiDevice;
    Instrumentation instrumentation;
  //  UiDevice mdevice = getUiDevice();
    @Before
    public void setUp(){
        instrumentation = InstrumentationRegistry.getInstrumentation();
        uiDevice = UiDevice.getInstance(instrumentation);
    }

    @Test
    public  void test01() throws Exception {
        UiObject2 HaahiTest=uiDevice.findObject(By.desc("HaahiTest"));
       // HaahiTest.clickAndWait(Until.newWindow(),50);
    }
//    public void sleep(int sleep){
//        try {
//            Thread.sleep(sleep);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
