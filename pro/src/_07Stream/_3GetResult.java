package _07Stream;


import _05Collection._01Set.Teacher;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
终结方法指的是调用完成后，不会返回新 Stream 了，没法继续使用流了。

    void forEach(Consumer action)	                    对此流运算后的元素执行遍历
    long count()	                                    统计此流运算后的元素个数
    Optional<T> max(Comparator<? super T> comparator)	获取此流运算后的最大值元素
    Optional<T> min(Comparator<? super T> comparator)	获取此流运算后的最小值元素

    收集 Stream 流：就是把 Stream 流操作后的结果转回到集合或者数组中去返回。
    Stream 流：方便操作集合 / 数组的手段；
    集合 / 数组：才是开发中的目的。

    Stream 提供的常用终结方法	        说明
    R collect(Collector collector)	把流处理后的结果收集到一个指定的集合中去
    Object[] toArray()	            把流处理后的结果收集到一个数组中去

    Collectors 工具类提供了具体的收集方式	                                        说明
    public static <T> Collector toList()	                                    把元素收集到 List 集合中
    public static <T> Collector toSet()	                                        把元素收集到 Set 集合中
    public static Collector toMap(Function keyMapper , Function valueMapper)	把元素收集到 Map 集合中
 */
public class _3GetResult {
    public static void main(String[] args) {
        List<Teacher> teachers=new ArrayList<>();
        teachers.add(new Teacher("张三", 18, "北京", 5000));
        teachers.add(new Teacher("李四", 28, "上海", 6000));
        teachers.add(new Teacher("王五", 19, "广州", 7000));
        teachers.add(new Teacher("赵六", 20, "深圳", 8000));
        teachers.add(new Teacher("孙七", 21, "杭州", 9000));
        teachers.add(new Teacher("周八", 22, "武汉", 10000));
        teachers.add(new Teacher("吴九", 23, "西安", 11000));
        teachers.add(new Teacher("郑十", 24, "南京", 12000));
        teachers.add(new Teacher("王十一", 25, "成都", 13000));
        teachers.add(new Teacher("张十二", 26, "苏州", 14000));
        teachers.add(new Teacher("李十三", 27, "无锡", 15000));
        teachers.add(new Teacher("王十四", 28, "常州", 16000));

        teachers.stream().filter(t->t.getSalary()>15000).forEach(System.out::println);
        System.out.println("---------------------------------------");

        long count = teachers.stream().filter(t->t.getSalary()>15000).count();
        System.out.println(count);
        System.out.println("---------------------------------------");

        Optional<Teacher> max = teachers.stream().max((t1, t2) -> Double.compare(t1.getSalary(), t2.getSalary()));
        System.out.println(max.get());
        System.out.println("---------------------------------------");

        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("孙七");

        //流只能收集一次
        Stream<String> s1= list.stream().filter(s->s.startsWith("张"));
        List<String> list1=s1.collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("---------------------------------------");

        //不能再重复收集
        Set< String> s2=new HashSet<>();
        s2.addAll(list1);
        System.out.println(s2);
        System.out.println("---------------------------------------");

        //收集到数组
        Stream<String> s3= list.stream().filter(s->s.startsWith("张"));
        Object[] arr=s3.toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------");

        //收集到Map集合
        Stream<Teacher> s4=teachers.stream();
        Map<String, Double> map=s4.collect(Collectors.toMap(Teacher::getName, Teacher::getSalary));
        System.out.println(map);
    }
}
