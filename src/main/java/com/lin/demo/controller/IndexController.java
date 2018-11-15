package com.lin.demo.controller;

import com.lin.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lhy
 * @date 2018/11/13 15:36
 */
@RestController
public class IndexController {
    private static Map<String,Object> result = new HashMap();
    @GetMapping("/index")
    public Object index(){
        int y = 1/0;
        result.put("name","lhy");
        return result;
    }

    @GetMapping("/v1/show_user")
    public Object showUser(User user){
        return user;
    }
}
