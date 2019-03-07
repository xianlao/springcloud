package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * Created ${xian}
 */
@Component
public class HelloWorldServiceFailure implements  HelloWorldService{
    @Override
    public String sayHello() {
        System.out.println("hello world service is not available !");
        return "hello world service is not available !";
    }
}
