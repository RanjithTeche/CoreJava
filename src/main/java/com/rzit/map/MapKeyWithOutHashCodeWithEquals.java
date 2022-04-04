package com.rzit.map;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class MapKeyWithOutHashCodeWithEquals extends Object {
    String name;

    public MapKeyWithOutHashCodeWithEquals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof MapKeyWithOutHashCodeWithEquals))
            return false;
        MapKeyWithOutHashCodeWithEquals key = (MapKeyWithOutHashCodeWithEquals) obj;
        return key.getName() == this.getName()
                && key.getName() == this.getName();
    }
}
