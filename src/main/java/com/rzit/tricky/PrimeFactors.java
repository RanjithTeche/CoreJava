package com.rzit.tricky;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ranjith on 8/9/2017.
 */
public class PrimeFactors {
    public static Map<Long, Long> primeFactors(long number) {
        long n = number;
        Map<Long, Long> factors = new LinkedHashMap<>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!factors.containsKey(i)) {
                    factors.put(i, 0l);
                }
                factors.put(i, factors.get(i) + 1);
                n /= i;
            }
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(600));
    }
}
