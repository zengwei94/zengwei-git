package com.example.mybatis.mybatis.mapper;

import com.example.mybatis.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {

    List<User> findAll();
}
