package com.demo.test.main;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 自我测试类
 * @author chenwd
 * @date 2021-3-26 16:41
 */
public class MyStart {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture f = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程："+Thread.currentThread().isDaemon());
            System.out.println("线程执行任务完成");
            return "over0";
        });

        f.thenAccept((r) -> {
            System.out.println("result:" + r);
        });

        /*CompletableFuture f1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(12);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程："+Thread.currentThread().isDaemon());
            System.out.println("线程执行任务完成");
            return "over1";
        });
        CompletableFuture.anyOf(f,f1).join();*/



        System.out.println("main thread end");

        try {
            TimeUnit.SECONDS.sleep(12);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
