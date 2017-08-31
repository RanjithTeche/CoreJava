package com.rzit.files;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/3/2017.
 */
public class MaxSatification {
    public static void main(String[] args) throws IOException {
        InputStream in = null;
        Scanner sc = null;
        int totalItem = 0;
        int totalTime = 0;
        List<Item> items = new ArrayList<>();
        try {
            in = LargeFileRead.class.getClassLoader()
                    .getResourceAsStream("data.txt");
            sc = new Scanner(in, "UTF-8");
            totalTime = sc.nextInt();
            totalItem  = sc.nextInt();
            for (Integer i = 0; i < totalItem; i++) {
                int satiesfy = sc.nextInt();
                int timeConsume = sc.nextInt();
                if (totalTime > timeConsume) {
                    Item item = new Item(satiesfy, timeConsume);
                    items.add(item);
                }
            }
            Item finalItem = new Item(0,totalTime);
            while (finalItem.getTime() > 0) {
                finalItem =  maxSatification(items,finalItem);
                System.out.println("finalItem :"+finalItem);
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
    }

    public static Item maxSatification(List<Item> itemList, Item item) {
        itemList.sort(new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                int s1 = (item.getTime() / o1.getTime()) * o1.getSatification();
                int s2 = (item.getTime() / o2.getTime()) * o2.getSatification();
                System.out.println(item.getTime() +"\t "+ o1.getTime() +"\t "+(item.getTime() / o1.getTime())+"\t"+(o1.getSatification())+"\t"+s1);
                System.out.println(item.getTime() +"\t "+ o2.getTime() +"\t "+(item.getTime() / o2.getTime())+"\t"+(o2.getSatification())+"\t"+s2);
                System.out.println(s2+"\t"+s1);
                return s2 - s1;
            }
        });
        Item goodItem = itemList.get(0);
        System.out.println("goodItem:"+goodItem);
        item.setSatification(item.getSatification() + (item.getTime() / goodItem.getTime()) * goodItem.getSatification());
        if(item.getTime() < goodItem.getTime()){
            item.setTime(0);
        }else {
            item.setTime(item.getTime() % goodItem.getTime());
        }


        return item;
    }
}

class Item {
    int satification;
    int time;

    public Item(int satification, int time) {
        this.satification = satification;
        this.time = time;
    }

    public int getSatification() {
        return satification;
    }

    public void setSatification(int satification) {
        this.satification = satification;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Item{" +
                "satification=" + satification +
                ", time=" + time +
                '}';
    }
}