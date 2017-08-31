package com.rzit.objectRef;

/**
 * User: Ranjith Venganti
 * Date: 6/14/2017
 * Time: 1:40 AM
 */
public class MyObjectKey {

    String name;
    Integer age;

    public MyObjectKey(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
