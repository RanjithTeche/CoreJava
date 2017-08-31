package com.rzit.files;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ranjith on 6/28/2017.
 * <p>
 * http://www.baeldung.com/java-read-lines-large-file
 */
public class LargeFileRead {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        Scanner sc = null;
        List<String>  list = new ArrayList<>();
        try {
            in = LargeFileRead.class.getClassLoader()
                    .getResourceAsStream("largefile.txt");
            sc = new Scanner(in, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                list.add(line);
            }
            System.out.println(list.size());
            // note that Scanner suppresses exceptions
            if (sc.ioException() != null) {
                throw sc.ioException();
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
    }
}
