package com.rd.spring.lesson8_beanLifeCycle.Annotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("2. Engine injected into Car");
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
