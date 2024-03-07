package threaddemo;

import java.util.concurrent.Callable;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/7 12:53
 * @Description: TODO:
 **/
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "=" + i);
        }
    }
}

class PrimeRun implements Runnable {

    @Override
    public void run() {
        Thread t = Thread.currentThread(); //获取当前调用run方法的线程对象
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + "=" + i);
        }
    }
}

class Mycallable implements Callable<Integer> {  //Callable需要一个泛型表示返回值的类型

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}