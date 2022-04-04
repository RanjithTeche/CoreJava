package com.rzit.override;

 class Overload {
    public void p(int a){
        System.out.println("int:"+a);
    }
    public void p(Integer a){
        System.out.println("Integer:"+a);
    }
    public void p(Object a){
        System.out.println("Object:"+a);
    }
    /*public void p(String a){
        System.out.println("String:"+a);
    }*/
    public void p(long a){
        System.out.println("long:"+a);
    }
}


public class OverloadDemo {
    public static void main(String[] args) {
    
        Overload obj= new Overload();
        obj.p(10);
        obj.p(null);
        Object oo= null;
        obj.p(oo);
        obj.p(new Integer(10));
    }
    
}
