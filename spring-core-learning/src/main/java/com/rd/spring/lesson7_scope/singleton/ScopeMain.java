package com.rd.spring.lesson7_scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car bean = context.getBean(Car.class);
        Car bean1 = context.getBean(Car.class);

        System.out.println(bean1 == bean); // true

    }
}
