package com.lin.demo.controller;

import com.lin.demo.domain.User;
import com.lin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lhy
 * @date 2018/11/14 18:27
 */
@RestController
public class MybatisTestController {
    private static Map<String,Object> result = new HashMap<>();
    @Autowired
    private UserService userService;
    @RequestMapping("/saveUser")
    public Object saveUser(){
        User user = new User();
        user.setPhone("13860796620");
        user.setName("lhy");
        user.setAge(11);
        userService.insertUser(user);
        return "111";
    }
}
