package com.company;

public enum Mode {
    FAST(30000), SLOW(60000);

    private int value;

    Mode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return this.name();
    }
}
