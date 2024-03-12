package producter_consumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/8 16:08
 * @Description: TODO:
 **/
public class Foodie extends Thread {
//    public Foodie(String name) {
//        super(name);
//    }
//    /*
//     * 1. 循环
//     * 2. 同步代码块
//     * 3. 判断共享数据是否到了末尾（到了末尾，直接退出）
//     * 4. 判断共享数据是否到了末尾（到了末尾，直接退出）
//     *      没到末尾，执行核心代码
//     *          判断桌子上是否有食物
//     *              有！等待，唤醒吃货
//     *              无，制作食物，放在桌子上，唤醒吃货
//     *
//     * */
//
//    @Override
//    public void run() {
//        try {
//            while (true) {
//                synchronized (Desk.lock) {
//                    //1.判断吃的面条总数是否完毕
//                    if (Desk.count == 0) {
//                        break;
//                    } else {
//                        //2.如果还能吃面条，进入判断
//                        if (Desk.foodFlag == 0) {
//                            //3.如果桌子上没有面条，就等待
//                            Desk.lock.wait();  //让当前线程跟锁进行绑定
//                        } else {
//                            //4.如果桌子上有面条，执行吃货吃面条操作
//                            Desk.count--;
//                            System.out.println("吃货正在吃面条...，还能吃" + Desk.count + "碗面条");
//                            Desk.lock.notifyAll();  //唤醒这把锁绑定的所有线程
//                            Desk.foodFlag = 0;
//                        }
//                    }
//                }
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    ArrayBlockingQueue<String> queue;

    public Foodie(String name, ArrayBlockingQueue<String> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String food = queue.take();
                System.out.println("吃货吃了一碗面条...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
