package producter_consumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/8 16:08
 * @Description: TODO:
 **/
public class ThreadTest {
    public static void main(String[] args) {

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1);

        Cook cook = new Cook("厨师", queue);
        Foodie foodie = new Foodie("吃货", queue);

        cook.start();
        foodie.start();
    }
}
