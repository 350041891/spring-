package com.lin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lhy
 * @date 2018/11/14 16:25
 */
@Controller
public class FreeMarkerController {

    @RequestMapping("/free/demo")
    public String toDemo(Model model){
        model.addAttribute("name","lhy");
        return "freemarker/freeDemo";
    }
}
