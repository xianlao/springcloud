package com.example.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created ${xian}
 */
@FeignClient(value = "service-helloworld" ,fallback = HelloWorldServiceFailure.class)
public interface HelloWorldService {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    //
    String sayHello();
}
