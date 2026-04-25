package com.rd.spring.lesson8_beanLifeCycle.Annotations;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public Engine() {
        System.out.println("1. Engine created");
    }
}
