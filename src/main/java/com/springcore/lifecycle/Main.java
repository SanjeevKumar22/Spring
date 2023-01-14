package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
        context.registerShutdownHook();

//        Fruits fruits = (Fruits) context.getBean("fruit");
//        System.out.println(fruits);
//
//        Veg veg =(Veg) context.getBean("veg");
//        System.out.println(veg);
        Example example=(Example)context.getBean("exam");
        System.out.println(example);
    }
}
