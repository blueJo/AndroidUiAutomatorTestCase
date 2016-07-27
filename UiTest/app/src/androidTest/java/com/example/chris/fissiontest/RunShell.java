package com.example.chris.fissiontest;

import java.io.IOException;

/**
 * Created by Chris on 2016/7/19.
 */
public class RunShell {
    String myshell = "adb shell /system/bin/screencap -p /sdcard/12345.png";

    public void execShell() {
        try {
            Runtime.getRuntime().exec(myshell);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execShell(String shell) {
        try {
            if (shell == null){
                shell = myshell;
            }
            Runtime.getRuntime().exec(shell);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        RunShell rs = new RunShell();
        rs.execShell();
    }
}
