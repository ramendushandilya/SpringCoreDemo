package com.ramendu.c_postProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("helloProcessor");
        hello.getMessage();
        context.registerShutdownHook();
    }
}
