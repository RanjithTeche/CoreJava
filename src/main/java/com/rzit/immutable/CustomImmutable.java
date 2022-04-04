package com.rzit.immutable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Ranjith on 7/17/2017.
 */
public final class CustomImmutable {
    private final int id;
    private final String name;
    private final HashMap<String, String> authorities;

    public CustomImmutable(int id, String name, Map<String, String> authorities) {
        this.id = id;
        this.name = name;
        HashMap<String,String> tempMap=new HashMap<String,String>();
        String key;
        Iterator<String> it = authorities.keySet().iterator();
        while(it.hasNext()){
            key=it.next();
            tempMap.put(key, authorities.get(key));
        }
        this.authorities=tempMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAuthorities() {
        return (HashMap<String, String>) authorities.clone();


    }
}
