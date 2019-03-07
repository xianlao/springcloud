package com.demo.controller;

import com.demo.bean.User;
import com.demo.service.AppMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created ${xian}
 */

@RestController
public class APPMessageController {


    @Autowired
    private AppMessageService service;

    @RequestMapping("/getThree")
    public List<User> getThreeForMessage(){

        List<User> list = service.findAllUser();
        return list;
    }

    @RequestMapping("/aaa")
    public int getThreeForMessages(){

        return 1;
    }

}
