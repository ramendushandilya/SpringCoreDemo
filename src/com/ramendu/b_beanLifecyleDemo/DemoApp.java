package com.ramendu.b_beanLifecyleDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {

    public static void main(String[] args) {

        // Use of AbstractApplicationContext to make use of registerShutdownHook()
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanWithLifecycle beanWithLifecycle = (BeanWithLifecycle) context.getBean("beanLifeCycle");

        // registerShutdownHook() for graceful shutdown and call relevant destroy methods
        context.registerShutdownHook();
    }
}