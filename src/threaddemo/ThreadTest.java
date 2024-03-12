package threaddemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/7 12:48
 * @Description: TODO:多线程
 **/
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,                      //核心线程数量
                6,                                   //最大线程数，不能小于0，最大数量 >= 核心线程数量
                60,                                  //时间值
                TimeUnit.SECONDS,                    //时间单位
                new ArrayBlockingQueue<>(3),//任务队列
                Executors.defaultThreadFactory(),    //创建线程工厂
                new ThreadPoolExecutor.AbortPolicy() //任务拒绝策略
        );
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);  // 12线程

    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "被创建！");
    }
}