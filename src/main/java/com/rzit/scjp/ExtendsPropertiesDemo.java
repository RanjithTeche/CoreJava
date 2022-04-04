package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
class One {
    public int i;
    public void print(){
        System.out.println("One:"+i);
    }
}
class Two extends One {
   public int j;
    public void print(){
        System.out.println("Two i:"+i +"\t j:"+j);
    }
}
public class ExtendsPropertiesDemo {
    public static void main(String[] args) {
        Two two = new Two();
        two.i =  1;
        two.j = 2;
        One one  = two;
        one.print();
    }

}
