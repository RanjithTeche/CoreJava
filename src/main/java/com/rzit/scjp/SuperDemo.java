package com.rzit.scjp;

/**
 * Created by Ranjith on 7/28/2017.
 */
public class SuperDemo {
    String s;
    public SuperDemo() {
        System.out.println("In cons");
        System.out.println("Super:"+super.hashCode());
        System.out.println("This : "+this.hashCode());

        System.out.println("toString **********");
        System.out.println("Super:"+super.toString());
        System.out.println("This : "+this.toString());

    }

    @Override
    public String toString() {
        return "SuperDemo{" +
                "s='" + s + '\'' +
                '}';
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        SuperDemo s = new SuperDemo();
        System.out.println(s);
    }
}
