package com.springcore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App
{
	private static final Logger log=LoggerFactory.getLogger(App.class);
        public static void main( String[] args )
    {
       
       ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       Student student= (Student) context.getBean("student1");
       System.out.println(student.getStudentId());
       System.out.println(student);
       log.info("Application Started");
       log.error("error");
       log.debug("debug");
       
    }
}
