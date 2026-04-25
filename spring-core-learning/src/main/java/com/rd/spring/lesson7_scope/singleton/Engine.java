package com.rd.spring.lesson7_scope.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class Engine {

    public Engine() {
        System.out.println("Engine Created");
    }
}
