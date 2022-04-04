package com.rzit.tricky;

import java.util.Map;

/**
 * Created by Ranjith on 8/9/2017.
 */
public class ConsecutiveSumSolution {
    static long consecutive(long num) {
        long solutions = 1;
        Map<Long, Long> primeFactors = PrimeFactors.primeFactors(num);
        if (primeFactors.containsKey(2L)) {
            primeFactors.remove(2L);
        }

        for (long fact : primeFactors.values()) {
            solutions = solutions*(fact + 1);
        }
        return solutions-1;
    }

    public static void main(String[] args) {
        System.out.println(consecutive(8));
        System.out.println(consecutive(15));
        System.out.println(consecutive(600));
        System.out.println(consecutive(10000));
    }
}
