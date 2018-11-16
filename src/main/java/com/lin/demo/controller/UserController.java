package com.lin.demo.controller;

import com.lin.demo.dao.UserRespository;
import com.lin.demo.domain.User;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhy
 * @date 2018/11/16 12:39
 */
@RestController
@RequestMapping("/elastic")
public class UserController {
    @Autowired
    private UserRespository userRespository;

    @GetMapping("/save")
    public Object save(long id,String title){
        User user = new User();
        user.setAge(11);
        user.setName("lhy");
        user.setPhone("13860796620");
        userRespository.save(user);
        return "success";
    }

    @GetMapping("/search")
    public Object search(String title){
        org.elasticsearch.index.query.QueryBuilder builder = QueryBuilders.matchQuery("title", title);
        Iterable<User> search = userRespository.search(builder);
        return "success";
    }
}
