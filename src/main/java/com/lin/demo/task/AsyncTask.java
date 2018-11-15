package com.lin.demo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author lhy  开启异步任务
 * @date 2018/11/15 21:11
 */
@Component
@Async
public class AsyncTask {
    public void task1() throws Exception{
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务1耗时:"+(end-begin));
    }

    public void task2() throws Exception{
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务2耗时:"+(end-begin));
    }

    public void task3() throws Exception{
        long begin = System.currentTimeMillis();
        Thread.sleep(1000L);
        long end = System.currentTimeMillis();
        System.out.println("任务3耗时:"+(end-begin));
    }

    //获取异步结果 阻塞


    public Future<String> task4()throws Exception{
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务4耗时:"+(end-begin));
        return new AsyncResult<String>("任务4");
    }

    public Future<String> task5()throws Exception{
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务5耗时:"+(end-begin));
        return new AsyncResult<String>("任务5");
    }

    public Future<String> task6()throws Exception{
        long begin = System.currentTimeMillis();
        Thread.sleep(2000L);
        long end = System.currentTimeMillis();
        System.out.println("任务6耗时:"+(end-begin));
        return new AsyncResult<String>("任务6");
    }

}
