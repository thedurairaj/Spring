package com.rd.spring.lesson8_beanLifeCycle.custom;

// Bean (No Spring-specific annotations)
public class Car {

    public Car() {
        System.out.println("Constructor called");
    }

    public void myInit() {
        System.out.println("Custom Init method");
    }

    public void myDestroy() {
        System.out.println("Custom Destroy method");
    }
}
