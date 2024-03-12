package producter_consumer;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/8 16:07
 * @Description: TODO:控制生产者和消费者的执行
 **/
public class Desk {

    public static int foodFlag = 0;  //0表示没有面条，1表示有面条

    public static int count = 10;  //总共吃多少碗面条

    public static Object lock = new Object();  //创建锁对象
}
