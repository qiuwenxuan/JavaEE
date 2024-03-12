package streamdemo;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/12 17:34
 * @Description: TODO:
 **/
public class StreamDemo {
    /*
     * void foreach(Consumer action)     遍历
     * long count()      统计
     * toArray()         收集流中的数据，放到数组当中
     *
     * */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-20", "赵敏-女-14", "张强-男-33", "张三丰-男-49", "张翠山-女-10", "张良-男-29", "谢广坤-男-30");

        list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .forEach(s -> System.out.println(s));

        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());

        System.out.println(newList);

        Set<String> newSet = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());

        System.out.println(newSet);

        /*
         *   toMap:  参数一表示键的生成规则
         *           参数二表示值的生成规则
         *
         *   参数一：
         *       Function泛型一：表示流中的每一个数据类型
         *               泛型二：表示Map集合中键的数据类型
         *
         *   参数二：
         *       Function泛型一：表示流中的每一个数据类型
         *               泛型二：表示Map集合中值的数据类型
         *
         * */
        Map<String, Integer> newMap = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));

        System.out.println(newMap);

        Map<String, Integer> newMap2 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));

        System.out.println(newMap2);

    }
}
