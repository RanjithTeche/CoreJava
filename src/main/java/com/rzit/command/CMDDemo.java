package com.rzit.command;

import java.io.IOException;
import java.util.concurrent.locks.Lock;

/**
 * Created by Ranjith on 8/2/2017.
 */
public class CMDDemo {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("notepad");//will open a new notepad
            Runtime.getRuntime().exec("calc");//will open a new calculator
            Runtime.getRuntime().exec("shutdown -s -t 0");//will shutdown the windows system  after 0 sec
            Runtime.getRuntime().exec("shutdown -r -t 0");//will restart the windows system  after 0 sec
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
