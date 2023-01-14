package com.springcore.ref;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static Logger logger= LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A a=(A)context.getBean("aref");
        logger.info("Application started");
        System.out.println(a.toString());
    }
}
