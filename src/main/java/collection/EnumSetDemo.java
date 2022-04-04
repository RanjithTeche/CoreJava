package collection;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * Created by Ranjith on 7/13/2017.
 */
public class EnumSetDemo {

    public static void main(String[] args) {
        enumAsKey();

    }

    public static void enumAsKey() {
        //Here Enumset allows only one type of enum, here I try to add Colors and Gender enum int to enumSet it not allowed
        //EnumSet enumSet =  EnumSet.of(Colors.RED,Colors.GREEN,Gender.FEMALE);
        EnumSet enumSet = EnumSet.of(Colors.RED, Colors.GREEN);
        //if try to add Gender enum it gives the  Exception in thread "main" java.lang.ClassCastException: class collection.Gender != class collection.Colors
        //enumSet.add(Gender.FEMALE);
        System.out.println(enumSet);
    }

}





