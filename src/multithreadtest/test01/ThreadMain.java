package multithreadtest.test01;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/8 17:28
 * @Description: TODO:
 **/
public class ThreadMain {
    public static void main(String[] args) {
        Thread t1 = new MyThread("同学1");
        Thread t2 = new MyThread("同学2");
        Thread t3 = new MyThread("同学3");
        Thread t4 = new MyThread("同学4");
        Thread t5 = new MyThread("同学5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
