package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created ${xian}
 */
@RestController
public class WebController {

    @Autowired
    HelloWorldService helloworldservice;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String sayHello(){
        return helloworldservice.sayHello();
    }

}
