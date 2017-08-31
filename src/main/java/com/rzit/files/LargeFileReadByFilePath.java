package com.rzit.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Ranjith on 6/28/2017.
 * <p>
 * http://www.baeldung.com/java-read-lines-large-file
 */
public class LargeFileReadByFilePath {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("E:\\My_Own_WP\\corejava\\src\\main\\resources/largefile.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                //System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
