package com.ramendu.f_required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredDemoApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beansTwo.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
