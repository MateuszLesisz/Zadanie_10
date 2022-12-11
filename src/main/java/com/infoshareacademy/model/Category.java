package com.infoshareacademy.model;

public enum Category {

    KRYMINAL_SENSACJA_THRILLER("Thiller"),
    LITERATURA_PIEKNA("Poem"),
    HISTORYCZNA("Historic"),
    FANTASTYKA_SCIENCE_FICTION("Fantasy"),
    PUBLICYSTYKA_BIOGRAFIA("Bibliography"),
    OBYCZAJOWA_ROMANS("Romance");

    private final String values;

    Category(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}
