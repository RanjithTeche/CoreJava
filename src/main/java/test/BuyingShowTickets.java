package test;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class BuyingShowTickets {
    public static long waitingTime(int[] tickets, int p) {
        long waitingTime = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i < p) {
                if (tickets[i] > tickets[p]) {
                    tickets[i] = tickets[p];
                }
            } else if (i > p) {
                if (tickets[i] >= tickets[p]) {
                    tickets[i] = tickets[p] - 1;
                }
            }
            waitingTime += tickets[i];
        }
        return waitingTime;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int queueLength = sc.nextInt();
        int[] tickets = new int[queueLength];
        for (int i = 0; i < queueLength; i++) {
            tickets[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        long waitingTime = waitingTime(tickets, p);
        System.out.println(waitingTime);
    }
}
