package com.lin.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lhy
 * @date 2018/11/14 11:59
 */
@Controller
@PropertySource("classpath:resource.properties")
public class AnnotationController {
    @Value("${filename}")
    private String name;

    @RequestMapping("/getProperties")
    @ResponseBody
    public Object getProperties(){
        return name;
    }
}
