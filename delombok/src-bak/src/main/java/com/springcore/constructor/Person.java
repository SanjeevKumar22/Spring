package com.springcore.constructor;

public class Person {
    private String name;
    private int pid;
    private Cert cert;

    //<editor-fold defaultstate="collapsed" desc="delombok">
    @SuppressWarnings("all")
    public Person(final String name, final int pid, final Cert cert) {
        this.name = name;
        this.pid = pid;
        this.cert = cert;
    }

    @SuppressWarnings("all")
    public Person() {
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "Person(name=" + this.name + ", pid=" + this.pid + ", cert=" + this.cert + ")";
    }
    //</editor-fold>
}
