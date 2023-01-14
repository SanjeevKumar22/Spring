package com.springcore.constructor;

import lombok.*;

public class Addition {
    private int a;
    private int b;

    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
    }

    public void doSum() {
        System.out.println("sum is :" + (this.a + this.b));
    }

    @SuppressWarnings("all")
    public Addition(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
}
