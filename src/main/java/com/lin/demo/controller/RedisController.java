package com.lin.demo.controller;

import com.lin.demo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhy
 * @date 2018/11/14 22:19
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("add")
    public Object add(){
        redisUtils.set("name","lhy");
        return "add redis";
    }

    @GetMapping("find")
    public Object find(){

        return "find  "+redisUtils.get("name");
    }
}
