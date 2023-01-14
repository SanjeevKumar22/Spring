package com.springcore.constructor;

import org.slf4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main1 {

    private  static final Logger log= LoggerFactory.getLogger(main1.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/construct.xml");
        Person person= (Person) context.getBean("person1");
        log.info("application  started");
        System.out.println(person);

        Addition addition=(Addition) context.getBean("add");
        log.info("Add class called");
        addition.doSum();

    }
}
