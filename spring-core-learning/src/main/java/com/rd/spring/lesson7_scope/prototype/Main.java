package com.rd.spring.lesson7_scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Engine engineBean1 = context.getBean(Engine.class);
        Engine engineBean2 = context.getBean(Engine.class);

        System.out.println(engineBean1 == engineBean2); // false

        // ⚠️ VERY IMPORTANT (Common Trap)
            // 1. Prototype inside Singleton
            // 2. Even if Engine = prototype
            // 3. Car (singleton) gets:
                // i. Only ONE Engine at startup
                // ii. Not new each time
        Car carBean1 = context.getBean(Car.class);
        Car carBean2 = context.getBean(Car.class);

        System.out.println(carBean1 == carBean2); // true

    }
}
