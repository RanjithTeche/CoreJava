package com.rzit.tricky;

/**
 * Created by Ranjith on 7/28/2017.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[]  array ={10,12,45,45,45,52,56,88};
        System.out.println(removeDuplicates(array));
    }
    static int[] removeDuplicates(int[] array){
        int nonDuplicate = 0;
        int index=1;
        while (index < array.length ){
            if(array[index] == array[nonDuplicate]){
                index ++;
            }else {
                array[++nonDuplicate] = array[index++];
            }
        }
        int[]  output = new int[nonDuplicate];
        for (int k =0; k< output.length;k++){
            output[k] =  array[k];
            System.out.println(output[k]);
        }

        return output;
    }

}
