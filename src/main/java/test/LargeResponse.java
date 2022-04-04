package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class LargeResponse {
    static void largeResponse(String fileName) {
        int count = 0;
        long sum = 0;
        try {
            Stream<String> stream = Files.lines(Paths.get(fileName+".txt"));
            Iterator<String> iterator = stream.iterator();
            while (iterator.hasNext()) {
                String[] record = iterator.next().split(" ");
                long responseSize = Long.parseLong(record[record.length - 1]);
                if (responseSize > 5000) {
                    count++;
                    sum += responseSize;
                }
            }
            writeFile(fileName,count, sum);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static void writeFile(String fileName,int count, long sum) {
        try {
            PrintWriter writer = new PrintWriter("bytes_"+fileName+".txt");
            writer.println(count);
            writer.println(sum);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        largeResponse(fileName);
    }
}
