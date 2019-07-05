package com.limeng.demo.bootmybatis.service;

import com.limeng.demo.bootmybatis.entity.User;
import com.limeng.demo.bootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User select(int id) {
        return userMapper.select(id);
    }
}
