package com.rzit.files;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/9/2017.
 */
public class LargeResponsesDemo {
    static BigDecimal LIMIT = new BigDecimal(5000);

    public static void main(String[] args) throws IOException {
        InputStream in = null;
        Scanner sc = null;
        List<String> list = new ArrayList<>();
        BigDecimal bytes = BigDecimal.ZERO;
        BigDecimal noOfResponse = BigDecimal.ZERO;
        try {
            in = LargeFileRead.class.getClassLoader()
                    .getResourceAsStream("accesslog.txt");
            sc = new Scanner(in, "UTF-8");
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(" ");
                BigDecimal bytesSent = new BigDecimal(data[data.length - 1]);
                if (LIMIT.compareTo(bytesSent) <= 0) {
                    bytes = bytes.add(bytesSent);
                    noOfResponse = noOfResponse.add(BigDecimal.ONE);
                }
            }
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

        System.out.println("No of res: " + noOfResponse + "\t bytes :" + bytes);
    }
}
