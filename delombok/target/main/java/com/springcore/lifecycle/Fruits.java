package com.springcore.lifecycle;

import lombok.*;

public class Fruits {
    private double price;

    @SuppressWarnings("all")
    public Fruits() {
    }

    @SuppressWarnings("all")
    public Fruits(final double price) {
        this.price = price;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "Fruits(price=" + this.price + ")";
    }
}
