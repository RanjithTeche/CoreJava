package com.rzit.tricky;

/**
 * Created by Ranjith on 8/9/2017.
 */
public class LargestSubset {
    public static void main(String[] args) {

        int[] input01 = {2,4,5};
        int[] input02 = {10};

        long[] output = maxSubsetSum(input01);
        for(long k: output){
            System.out.println(k);
        }
    }

    static long[] maxSubsetSum(int[] k){
        long[] output = new long[k.length];
        for(int counter=0; counter< k.length; counter++){
            int sum = 0;
            for(int j=2; j<=k[counter]/2; j++){
                if(k[counter] % j == 0){
                    sum += j;
                }
            }
            output[counter] = sum + k[counter] + 1;
        }

        return output;
    }

}
