package oprators;

import java.util.function.BinaryOperator;

/**
 * Created by Ranjith on 8/18/2017.
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.parseInt(Integer.toBinaryString(1), 2));
        System.out.println(Integer.parseInt(Integer.toBinaryString(-1), 2));
    }
}
