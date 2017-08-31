package com.rzit.map;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class HashKey {
    String name;

    public HashKey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        HashKey hashKey = (HashKey) obj;
        return name.equals(hashKey.getName());
    }
}
