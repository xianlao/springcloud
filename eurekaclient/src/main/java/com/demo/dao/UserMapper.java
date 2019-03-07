package com.demo.dao;

import com.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created ${xian}
 */
@Mapper
@Repository
public interface UserMapper {

     List<User> findAll();
}
