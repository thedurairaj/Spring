package com.rd.spring.lesson7_scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Car created.");
    }
}
