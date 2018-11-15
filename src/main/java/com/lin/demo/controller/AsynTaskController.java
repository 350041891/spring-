package com.lin.demo.controller;

import com.lin.demo.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author lhy
 * @date 2018/11/15 21:18
 */
@RestController
@RequestMapping("/asyn")
public class AsynTaskController {

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("/test")
    public Object exeTask() throws Exception{
        long begin = System.currentTimeMillis();
// 有时间的话可以测试一下异步任务中的 事物
//        asyncTask.task1();
//        asyncTask.task2();
//        asyncTask.task3();
        Future<String> task4  = asyncTask.task4();
        Future<String> task5  = asyncTask.task5();
        Future<String> task6  = asyncTask.task6();
        while(true){
            if(task4.isDone() && task5.isDone() && task6.isDone()){
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时:"+(end-begin));

        return "总耗时:"+(end-begin);
    }
}
