package producter_consumer;


import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {
    //    public Cook(String name) {
//        super(name);
//    }
//    /**
//     * 多线程四步法：
//     * 1.循环
//     * 2.同步代码块
//     * 3.判断共享数据是否到了末尾（到了末尾，退出）
//     * 4.判断共享数据是否到了末尾（没到末尾，执行核心逻辑）
//     **/
//    @Override
//    public void run() {
//        synchronized (Desk.lock) {
//            while (true) {
//                if (Desk.count == 0) {
//                    break;
//                } else {
//                    if (Desk.foodFlag == 0) {
//                        System.out.println("厨师做了一碗面条...");
//                        Desk.foodFlag = 1;
//                        Desk.lock.notifyAll();
//                    } else {
//                        try {
//                            Desk.lock.wait();
//                        } catch (InterruptedException e) {
//                            throw new RuntimeException(e);
//                        }
//                    }
//                }
//            }
//        }
//    }
    ArrayBlockingQueue<String> queue;

    public Cook(String name, ArrayBlockingQueue<String> queue) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
