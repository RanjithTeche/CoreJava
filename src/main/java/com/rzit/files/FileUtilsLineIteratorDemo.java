package com.rzit.files;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ranjith on 6/28/2017.
 */
public class FileUtilsLineIteratorDemo {
    public static void main(String[] args) {
        try {
            LineIterator iterator = FileUtils.lineIterator(new File("E:\\My_Own_WP\\corejava\\src\\main\\resources/largefile.txt"));
            while (iterator.hasNext()){
                String s =  iterator.nextLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
