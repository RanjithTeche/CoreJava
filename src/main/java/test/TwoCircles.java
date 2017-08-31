package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class TwoCircles {
    static String[] circles(String[] info) {

        String[] relationships = new String[info.length];
        int counter = 0;
        for (String circleDetails : info) {
            String[] coordinates = circleDetails.split(" ");
            int xCord1 = Integer.parseInt(coordinates[0]);
            int yCord1 = Integer.parseInt(coordinates[1]);
            int radius1 = Integer.parseInt(coordinates[2]);

            int xCord2 = Integer.parseInt(coordinates[3]);
            int yCord2 = Integer.parseInt(coordinates[4]);
            int radius2 = Integer.parseInt(coordinates[5]);

            int distance = (int) Math.sqrt(Math.pow(xCord2 - xCord1, 2) + Math.pow(yCord2 - yCord1, 2));

            if (distance == (radius1 + radius2) || distance == (radius2 - radius1)) {
                relationships[counter] = "Touching";
            } else if (distance == 0) {
                relationships[counter] = "Concentric";
            } else if (distance > (radius1 + radius2)) {
                relationships[counter] = "Disjoint-Outside";
            } else if (distance <= Math.abs(radius1 - radius2)) {
                relationships[counter] = "Disjoint-Inside";
            } else if (distance <= (radius1 + radius2)) {
                relationships[counter] = "Intersecting";
            }
            counter++;
        }

        return relationships;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] info = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 0; i < info.length; i++) {
            info[i] = sc.nextLine();
        }
        String[]  relationShip =  circles(info);
        System.out.println(Arrays.toString(relationShip));
    }

}
