package com.rzit.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Ranjith on 7/7/2017.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //NoClassDefFoundError error comes when new
        //ClassNotFoundException exception comes when Class.forName("")
        File f = new File("");
        try {
            FileInputStream stream = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
