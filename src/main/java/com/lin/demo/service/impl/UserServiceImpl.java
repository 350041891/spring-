package com.lin.demo.service.impl;

import com.lin.demo.dao.UserDao;
import com.lin.demo.domain.User;
import com.lin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lhy
 * @date 2018/11/14 18:27
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }
}
