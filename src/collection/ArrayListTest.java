package collection;

import java.util.*;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/6 11:01
 * @Description: TODO:
 **/
public class ArrayListTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();
        set.add("java01");
        set.add("java02");
        set.add("java04");
        set.add("java03");
        set.add("java02");

        set.remove("java01");
        System.out.println(set.contains("java01"));

        set.clear();
        System.out.println(set.isEmpty());
        System.out.println("===========================");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
