package com.ramendu.e_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameDemo {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TextEditor editor = (TextEditor) context.getBean("textEditor");
        editor.spellCheck();
    }
}
