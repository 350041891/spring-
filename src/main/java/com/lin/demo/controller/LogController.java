package com.lin.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhy
 * @date 2018/11/15 21:54
 */
@RestController
@RequestMapping("/log")
public class LogController {
    private Logger logger = LoggerFactory.getLogger(LogController.class);
    @GetMapping("/test")
    public Object testLog(){
        this.logger.debug("this is debug level");
        this.logger.info("this is debug level");
        this.logger.warn("this is debug level");
        this.logger.error("this is debug level");
        return "lhy";
    }
}
