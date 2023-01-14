package com.springcore.constructor;

//<editor-fold defaultstate="collapsed" desc="delombok">
//</editor-fold>
import lombok.*;

public class Cert {
    public String name;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Cert(final String name) {
        this.name = name;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "Cert(name=" + this.name + ")";
    }

    @SuppressWarnings("all")
    public Cert() {
    }
    //</editor-fold>
}
