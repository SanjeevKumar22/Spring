package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
        Fruits fruits = (Fruits) context.getBean("fruit");
        System.out.println(fruits);
    }
}
