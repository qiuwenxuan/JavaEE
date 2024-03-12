package threaddemo;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/7 12:53
 * @Description: TODO:
 **/
class MyThread1 extends Thread {
    static int ticket = 0;

    static Lock lock = new ReentrantLock();
//    static ReentrantLock lock = new ReentrantLock();

    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (true) {
                lock.lock();
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票！");
                    lock.unlock();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    class MyThread2 extends Thread {
        public MyThread2() {
        }

        public MyThread2(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 1; i < 100; i++) {
                System.out.println(getName() + "=" + i);
            }
        }
    }

    class RunnableThread implements Runnable {
        int ticket = 1;

        @Override
        public void run() {
            while (true) {

            }
        }

        private synchronized boolean synchronizedMethod() {
            if (ticket == 100) {
                return true;
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                ticket++;
                System.out.println(Thread.currentThread().getName() + "卖了第" + ticket + "张票！");
            }
            return false;
        }
    }
}