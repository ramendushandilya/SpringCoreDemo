package com.ramendu.b_beanLifecyleDemo;

public class BeanWithLifecycle {

    public void init() {
        System.out.println("Bean is going through init phase");
    }

    public void destroy() {
        System.out.println("Bean is going through destroy phase");
    }
}
