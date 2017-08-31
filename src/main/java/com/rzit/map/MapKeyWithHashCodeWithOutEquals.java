package com.rzit.map;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class MapKeyWithHashCodeWithOutEquals extends Object {
    String name;

    public MapKeyWithHashCodeWithOutEquals(String name) {
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
        int result = 17;
        return 31 * result + (name != null ? name.hashCode() : 0);
    }
}
