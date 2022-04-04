package test;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class Winner {
    static String winner(int[] andrea, int[] maria, String s) {
        int andreaPoints = 0;
        int mariaPoints = 0;
        int startIndex = "Even".equalsIgnoreCase(s) ? 0 : 1;
        for (int i = startIndex; i < andrea.length; i = i + 2) {
            andreaPoints += andrea[i] - maria[i];
            mariaPoints += maria[i] - andrea[i];
        }
        return andreaPoints == mariaPoints ? "Tie" : andreaPoints > mariaPoints ? "Andrea" : "Maria";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstGamer = sc.nextInt();
        int[] firstGamerPoints = new int[firstGamer];
        for (int i = 0; i < firstGamer; i++) {
            firstGamerPoints[i] = sc.nextInt();
        }
        int secondGamer = sc.nextInt();
        int[] secondGamerPoints = new int[secondGamer];
        for (int i = 0; i < firstGamer; i++) {
            secondGamerPoints[i] = sc.nextInt();
        }
        String gameType = sc.next();
        String winer = winner(firstGamerPoints, secondGamerPoints, gameType);
        System.out.println(winer);
    }
}
