package com.lin.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lhy
 * @date 2018/11/14 22:17
 */
@Component
public class RedisUtils {
    @Autowired
    private StringRedisTemplate redisTpl;

    public boolean set(String key,String value){
        try{
            redisTpl.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public String get(String key){
        return redisTpl.opsForValue().get(key);
    }
}
