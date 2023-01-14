package com.springcore.constructor;

import lombok.*;
@AllArgsConstructor
public class Addition {
    private int a;
    private int b;

    public Addition(double a,double b){
        this.a=(int)a;
        this.b=(int)b;
    }
    public void doSum(){
        System.out.println("sum is :"+(this.a+this.b));
    }
}
