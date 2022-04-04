package com.rzit.hacker;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/13/2017.
 */
public class CatMouseCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  noOfTrails = scanner.nextInt();
        for(int i=0; i< noOfTrails;i++){
            int catA= scanner.nextInt();
            int catB= scanner.nextInt();
            int mouse= scanner.nextInt();
            int catAReach = Math.abs(mouse-catA);
            int catBReach = Math.abs(mouse-catB);
            if(catAReach ==  catBReach){
                System.out.println("Mouse C");
            }else if(catAReach < catBReach) {
                System.out.println("Cat A");
            }else {
                System.out.println("Cat B");
            }
        }
    }
}
