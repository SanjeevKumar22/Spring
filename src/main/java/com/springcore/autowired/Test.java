package com.springcore.autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static final Logger log= LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowired/autowired.xml");
        auto auto=(auto)context.getBean("auto");
        log.info("autowired");
        System.out.println(auto);
    }
}
