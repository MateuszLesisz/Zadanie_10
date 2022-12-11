package com.infoshareacademy.model;

public enum ForKids {

    TAK("YES"),
    NIE("NO");

    private final String values;

    ForKids(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}
