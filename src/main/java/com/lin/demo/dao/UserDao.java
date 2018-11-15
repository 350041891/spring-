package com.lin.demo.dao;

import com.lin.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * @author lhy
 * @date 2018/11/14 18:16
 */
@Mapper
public interface UserDao {
    int insertUser(User user);
    User findByName(String name);
}
