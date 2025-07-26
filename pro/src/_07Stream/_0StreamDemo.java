package _07Stream;

import java.util.*;
import java.util.stream.Collectors;

/*
    1、Stream是什么？有什么作用？ 结合了什么技术？
        - 简化集合、数组操作的API。结合了Lambda表达式。

    2、说说Stream流处理数据的步骤是什么？
        1. 先得到集合或者数组的Stream流。
        2. 然后调用Stream流的方法对数据进行处理。
        3. 获取处理的结果。
 */

public class _0StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张小四");
        //把集合中所有“张”开头并且是3个元素存储到一个新集合
        List<String> newlist = list.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .collect(Collectors.toList());
        System.out.println(newlist);
    }
}