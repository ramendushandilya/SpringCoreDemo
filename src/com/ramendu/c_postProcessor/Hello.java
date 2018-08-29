package com.ramendu.c_postProcessor;

public class Hello {

    private String message;

    public void getMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Bean going through init");
    }

    public void destroy() {
        System.out.println("Bean going through destroy");
    }
}
