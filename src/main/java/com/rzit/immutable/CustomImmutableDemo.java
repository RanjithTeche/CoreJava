package com.rzit.immutable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ranjith on 7/17/2017.
 */
public class CustomImmutableDemo {
    public static void main(String[] args) {
        shallowImmutable();
        deepImmutable();
    }

    public static void shallowImmutable() {
        System.out.println("***************  shallowImmutable *****************");
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i = 10;

        CustomImmutableShallow ce = new CustomImmutableShallow(i, s, h1);

        //Lets see whether its copy by field or reference
        System.out.println(s == ce.getName());
        System.out.println(h1 == ce.getAuthorities());
        //print the ce values
        System.out.println("ce id:" + ce.getId());
        System.out.println("ce name:" + ce.getName());
        System.out.println("ce testMap:" + ce.getAuthorities());
        //change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:" + ce.getId());
        System.out.println("ce name after local variable change:" + ce.getName());
        System.out.println("ce testMap after local variable change:" + ce.getAuthorities());

        Map<String, String> hmTest = ce.getAuthorities();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from accessor methods:" + ce.getAuthorities());

    }

    public static void deepImmutable() {
        System.out.println("***************  deepImmutable *****************");
        HashMap<String, String> h1 = new HashMap<String, String>();
        h1.put("1", "first");
        h1.put("2", "second");

        String s = "original";

        int i = 10;

        CustomImmutable ce = new CustomImmutable(i, s, h1);

        //Lets see whether its copy by field or reference
        System.out.println(s == ce.getName());
        System.out.println(h1 == ce.getAuthorities());
        //print the ce values
        System.out.println("ce id:" + ce.getId());
        System.out.println("ce name:" + ce.getName());
        System.out.println("ce testMap:" + ce.getAuthorities());
        //change the local variable values
        i = 20;
        s = "modified";
        h1.put("3", "third");
        //print the values again
        System.out.println("ce id after local variable change:" + ce.getId());
        System.out.println("ce name after local variable change:" + ce.getName());
        System.out.println("ce testMap after local variable change:" + ce.getAuthorities());

        Map<String, String> hmTest = ce.getAuthorities();
        hmTest.put("4", "new");

        System.out.println("ce testMap after changing variable from accessor methods:" + ce.getAuthorities());

    }

}
