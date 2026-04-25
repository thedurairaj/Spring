package com.rd.spring.lesson7_scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Engine {

    public Engine() {
        System.out.println("Engine created.");
    }
}
