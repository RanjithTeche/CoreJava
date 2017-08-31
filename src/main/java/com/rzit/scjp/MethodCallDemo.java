package com.rzit.scjp;

/**
 * Created by Ranjith on 7/31/2017.
 */
public class MethodCallDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Car c = (Car) v;


        v.printSound();
        c.printSound();

        Bike b = (Bike)v;
        b.printSound();
    }
}

class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

