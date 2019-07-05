package com.limeng.demo.bootmybatis.mapper;

import com.limeng.demo.bootmybatis.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User select(int id);
}
