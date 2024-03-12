package multithreadtest.test01;

import java.util.Random;
import java.util.stream.DoubleStream;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/8 17:28
 * @Description: TODO:
 * - 1.循环
 * - 2.同步代码块
 * - 3.判断共享数据是否到了末尾（到了末尾，退出）
 * - 4.判断共享数据是否到了末尾（没到末尾，执行核心逻辑）
 * <p>
 * * - 1.循环
 * * - 2.同步代码块
 * * - 3.判断共享数据是否到了末尾（到了末尾，退出）
 * 红包抢完了3个包
 * 打印一句话没抢到
 * * - 4.判断共享数据是否到了末尾（没到末尾，执行核心逻辑）
 * 红包没抢完
 * 随机放钱在红包里，抢到红包打印一句话
 **/
public class MyThread extends Thread {
    static int count = 3;
    static int money = 100;  //红包初始总金额为100元
    static final int MIN = 1;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (MyThread.class) {
            try {
                if (count == 0) {  //如果红包数为count=0,没有抢到红包
                    Thread.sleep(20);
                    System.out.println(getName() + "没有抢到红包！");
                } else {
                    int prize = 0;  //红包金额
                    if (count == 1) {  //如果红包数为1，则将剩下的红包钱都装进红包
                        count--;  //红包数-1
                        prize = money;
                        Thread.sleep(20);
                        System.out.println(getName() + "抢到了" + prize + "元红包！");
                    } else {
                        Random random = new Random();
                        int bounds = money - (count - 1) * MIN;
                        prize = random.nextInt(bounds);  //随机获取红包的钱，范围在（100-MIN*红包剩余数量~0）之间
                        if (prize < MIN) {  //如果红包价值要小于最小红包的量，将其变为最小红包
                            prize = MIN;
                        }
                        Thread.sleep(20);
                        System.out.println(getName() + "抢到了" + prize + "元红包！");
                        count--;  //红包数-1
                        money = money - prize;  //money表示剩下的钱
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
