package com.rd.spring.lesson8_beanLifeCycle.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages ="com.rd.spring.lesson8_beanLifeCycle.custom" )
@Configuration
public class AppconfigConfiguration {

    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
    public Car car() {
        return new Car();
    }
}
