package com.rzit.java8features;

/**
 * Created by Ranjith on 7/7/2017.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    public void firstWork();

    /*Function intserface must have only one abstract method , (optional any number of default methods ) */
    //public void secondWork();
    public default void myDefaultMethod() {
        System.out.println("My Default");
    }

    /*override methods of Object not considerable */
    @Override
    public String toString();                //Overridden from Object class

    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}
