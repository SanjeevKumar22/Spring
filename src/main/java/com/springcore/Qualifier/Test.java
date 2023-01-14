package com.springcore.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Qualifier/qaf.xml");
        Emp emp=(Emp) context.getBean("emp");
        System.out.println(emp);
    }
}
