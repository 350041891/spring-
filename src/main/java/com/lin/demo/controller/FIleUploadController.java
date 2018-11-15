package com.lin.demo.controller;

import com.lin.demo.domain.JsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author lhy
 * @date 2018/11/13 16:22
 */
@Controller
public class FIleUploadController {

    private static final String filePath = "D:\\test\\";
    @RequestMapping(value="/gopage")
    public String uploadPage(){
        return "upload.html";
    }

    @PostMapping("/upload")
    @ResponseBody
    public JsonData upload(@RequestParam("head_img")MultipartFile file, HttpServletRequest request){
        String fileName = UUID.randomUUID()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        File dest = new File(filePath+fileName);
        try {
            file.transferTo(dest);
            return new JsonData(0,fileName,"");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JsonData(-1,null,"fail to save");
    }
}
