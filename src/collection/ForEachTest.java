package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: qiuwenxuan
 * @DateTime: 2024/3/6 22:47
 * @Description: TODO:
 **/
public class ForEachTest {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("apple");

        System.out.println(list);

        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
