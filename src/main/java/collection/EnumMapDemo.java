package collection;

import java.util.EnumMap;

/**
 * Created by Ranjith on 7/13/2017.
 */
public class EnumMapDemo {

    public static void main(String[] args) {
        enumAsKey();
        objectAsKey();

    }

    public static void enumAsKey() {
        EnumMap enumMap = new EnumMap(Colors.class);
        enumMap.put(Colors.RED, "Red Color");
        System.out.println(enumMap);
    }

    public static void objectAsKey() {
        EnumMap enumMap = new EnumMap(Object.class);
        enumMap.put(Colors.RED, "Red Color");
        enumMap.put(Gender.FEMALE, "Female");
        System.out.println(enumMap);
    }
}





