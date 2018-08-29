package com.ramendu.a_scopesDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopesDemo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello helloOne = (Hello) context.getBean("hello");
        Hello helloTwo = (Hello) context.getBean("hello");

        // In case of singleton scope only one global bean will be created thus below will say true
        // In case of prototype scope multiple beans will be created thus below will say false
        System.out.println(helloOne.equals(helloTwo));
    }

}
