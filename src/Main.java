import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /* filter      过滤
         * limit       获取前几个元素
         * skip        跳过前几个元素
         * */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "谢广坤", "张无忌");


        list.stream()
                .limit(3)
                .forEach(s -> System.out.print(s + " "));  //获取前三个

        System.out.println();
        list.stream()
                .skip(3)
                .forEach(s -> System.out.print(s + " "));  //跳过前三个
        System.out.println();

        list.stream()  //方法1，先获取前六个，再跳过前三个元素，获取到【张强 张三丰 张翠山】
                .limit(6)
                .skip(3)
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        list.stream()
                .skip(3)
                .limit(3)
                .forEach(s -> System.out.print(s + " "));

        list.stream()
                .distinct()  //元素去重
                .forEach(s -> System.out.println(s));

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌", "周芷若", "赵敏");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张强", "张三丰", "张翠山", "张良", "谢广坤", "张无忌");

        Stream.concat(list1.stream(), list2.stream()).forEach(s -> System.out.println(s));

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "张无忌-15", "周芷若-18", "赵敏-26", "张强-25", "张三丰-13", "张翠山-11", "张良-86", "谢广坤-27");

        list3.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));

        list3.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}