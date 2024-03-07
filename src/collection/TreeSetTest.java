package collection;

import java.util.*;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/6 16:57
 * @Description: TODO:
 **/


class Student { // 实现Comparable接口
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Student other) { // 重写comparaTo方法定义排序规则
//        // 首先按照年龄进行升序排序
//        int ageCompare = Integer.compare(this.age, other.age);
//        if (ageCompare != 0) {
//            return ageCompare;
//        }
//        // 如果年龄相同，则按照姓名的首字母进行排序
//        return this.name.compareTo(other.name);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TreeSetTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>();

        map.put("name", "张三");
        map.put("age", 18);
        map.put("gender", "man");
        System.out.println("=======================迭代器========================");

        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("=======================增强for循环+entrySet()方法========================");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println("=======================增强for循环+map.get()方法========================");

        for (String key : map.keySet()) {
            Object value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=======================foreach方法========================");

        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
