package com.rzit.tricky;

/**
 * This calls used to find the EquilibriumIndex of given array
 * Created by Ranjith on 7/3/2017.
 */
public class FindMiddleIndex {
    /**
     * @param numbers array of number whose Equilibrium Index to find
     * @return
     * @throws Exception
     */
    public static int findMiddleIndex(int[] numbers) throws Exception {

        int endIndex = numbers.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += numbers[endIndex--];
            } else {
                sumLeft += numbers[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }

    public static void main(String a[]) {
        //int[] num = { 2, 4, 4, 5, 4, 1 };
        //int[] num = { 2, 4, 4,0, 5, 4, 1 };
        int[] num = {2, 4, 2, 1, 1, 5, 4, 1};
        try {
            System.out.println("Starting from index 0, adding numbers till index "
                    + findMiddleIndex(num) + " and");
            System.out.println("adding rest of the numbers can be equal");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
