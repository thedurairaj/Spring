package com.rd.spring.lesson8_beanLifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car {

    public Car() {
        System.out.println("1. Constructor (Instantiation)");
    }

    @PostConstruct
    public void init(){
        System.out.println("3. Initialization (@PostConstruct)");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("5. Destruction (@PreDestroy)");
    }


}
