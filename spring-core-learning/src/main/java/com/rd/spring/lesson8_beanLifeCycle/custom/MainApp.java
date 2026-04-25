package com.rd.spring.lesson8_beanLifeCycle.custom;

import com.rd.spring.lesson8_beanLifeCycle.Annotations.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        context.getBean(Car.class);

        context.close(); // triggers destroy
    }
}
