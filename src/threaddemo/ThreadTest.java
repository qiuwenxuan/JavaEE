package threaddemo;

import collection.TreeSetTest;

import java.util.concurrent.FutureTask;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/7 12:48
 * @Description: TODO:多线程
 **/
public class ThreadTest {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//
//        t1.setName("线程1");
//        t2.setName("线程2");
//
//        t1.start();
//        t2.start();

        PrimeRun pr1 = new PrimeRun();  //创建任务类
        PrimeRun pr2 = new PrimeRun();

        Thread t3 = new Thread(pr1);   //创建线程对象，将任务类对象作为参数传递
        Thread t4 = new Thread(pr2);

        t3.setName("线程3");  //设置线程名称
        t4.setName("线程4");

        t3.start();  //启动线程
        t4.start();

        Mycallable mc = new Mycallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(mc);

        Thread t5 = new Thread(ft);
        Thread t6 = new Thread(ft);

        t5.start();
        t6.start();
    }

}
