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
        HashMap<Object, Object> map = new HashMap<Object, Object>();

        map.put("name", "张三");
        map.put("age", 18);
        map.put("gender", "man");

        Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Object, Object> entry = it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + "=" + value);
        }

    }
}
