package com.lin.demo.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lhy
 * @date 2018/11/14 13:34
 */
@ControllerAdvice
public class GlobelExceptionHandleController {
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    public Object handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("code","100");
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }
}
