package _07Stream;

import java.util.*;
import java.util.stream.*;

public class _1GetStreamDemo {
    public static void main(String[] args) {
        //获取stream流的方式
        //1 获取集合的stream流 .stream(
        Collection<String> list1=new ArrayList<>();
        Stream<String> s1=list1.stream();

        //2 Map获取stream流
        // .keySet().stream()
        // .values().stream()
        // .entrySet().stream()
        Map<String,Integer> map=new HashMap<>();
        Stream<String> s2=map.keySet().stream();//获取键流
        Stream<Integer> s3=map.values().stream();//获取值流
        Stream<Map.Entry<String,Integer>> s4=map.entrySet().stream();//获取键值对流

        //3 获取数组流
        // Arrays.stream(arr)
        // Stream.of(arr)
        String[] arr={"张三","李四","王五"};
        Stream<String> s5=Arrays.stream(arr);
        Stream<String> s6=Stream.of(arr);
        Stream<String> s7=Stream.of("张三","李四","王五");
    }
}
