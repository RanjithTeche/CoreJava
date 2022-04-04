package com.rzit.override;

/**
 * Created by Ranjith on 8/1/2017.
 */
public class Parent {
    int parentVar = 100;
    int same = 1000;

    public void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int childVar = 200;
    int same = 2000;

    public void display() {
        System.out.println("Parent");
    }
}
class ChildChild extends Child{
    int childChildVar = 300;
    int childVar = 400;
    int same = 3000;

    public void display() {
        System.out.println("ChildChild");
    }
}

class Demo {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.parentVar);
        System.out.println(parent.same);
        parent.display();

        parent = (Parent) new Child();
        System.out.println(parent.parentVar);
        System.out.println(parent.same);
        parent.display();

        parent = new Parent();
        System.out.println(parent.parentVar);
        System.out.println(parent.same);
        parent.display();

        Child child = new Child();
        System.out.println(child.childVar);
        System.out.println(child.parentVar);
        System.out.println(child.same);
        child.display();


        parent = new ChildChild();
        System.out.println(parent.parentVar);
        System.out.println(parent.same);
        parent.display();

        child = new ChildChild();
        System.out.println(child.childVar);
        System.out.println(child.parentVar);
        System.out.println(child.same);
        child.display();

        ChildChild childChild = new ChildChild();
        System.out.println(childChild.childChildVar);
        System.out.println(childChild.childVar);
        System.out.println(childChild.parentVar);
        System.out.println(childChild.same);
        childChild.display();
    }
}

