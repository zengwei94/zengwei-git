package com.example.mybatis.mybatis;

import com.example.mybatis.mybatis.bean.User;
import com.example.mybatis.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> all = userMapper.findAll();
        System.out.println(all);
    }

}
