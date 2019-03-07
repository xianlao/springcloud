package com.demo.service.impl;

import com.demo.bean.User;
import com.demo.dao.UserMapper;
import com.demo.service.AppMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created ${xian}
 */
@Service
public class UserServiceImpl implements AppMessageService {

    @Resource
    private UserMapper userMapper;
    public List<User> findAllUser() {
        List<User> list = userMapper.findAll();
        return list;
    }

}
