package com.rzit.files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ranjith on 6/28/2017.
 */
public class FileUtilsDemo {
    public static void main(String[] args) {
        try {
            List list = FileUtils.readLines(new File("E:\\My_Own_WP\\corejava\\src\\main\\resources/largefile.txt"));
            System.out.println(list.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
