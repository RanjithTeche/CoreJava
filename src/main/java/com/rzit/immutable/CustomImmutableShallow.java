package com.rzit.immutable;

import java.util.Map;

/**
 * Created by Ranjith on 7/17/2017.
 */
public final class CustomImmutableShallow {

    private final int id;
    private final String name;
    private final Map<String, String> authorities;

    public CustomImmutableShallow(int id, String name, Map<String, String> authorities) {
        this.id = id;
        this.name = name;
        this.authorities = authorities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAuthorities() {
        return authorities;
    }
}
