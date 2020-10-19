package com.tactfactory.demo;

public class Addition {

    private int value;
    private int addValue;

    public Addition(int a) {
        this.value = a;
    }

    public int apply(int b) {
        this.addValue = b;

        this.value += this.addValue;
        return this.value;
    }

    public int undo() {
        this.value -= this.addValue;
        return this.value;
    }

}
