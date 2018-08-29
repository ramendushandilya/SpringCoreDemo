package com.ramendu.g_javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        /**
         * Other ways to register configuration class are below
         * context.register(AnotherConfig.class, AppConfig.class);
         * context.refresh();
         */

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello there! ");
        System.out.println(helloWorld.getMessage());
    }
}
