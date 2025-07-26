package _07Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
中间方法指的是调用完成后会返回新的Stream流，可以继续使用(支持链式编程)。

 Stream提供的常用中间方法                                           说明
 Stream<T> filter(Predicate<? super T> predicate)`            | 用于对流中的数据进行过滤。
 Stream<T> sorted()`                                          | 对元素进行升序排序
 Stream<T> sorted(Comparator<? super T> comparator)`          | 按照指定规则排序
 Stream<T> limit(long maxSize)`                               | 获取前几个元素
 Stream<T> skip(long n)`                                      | 跳过前几个元素
 Stream<T> distinct()`                                        | 去除流中重复的元素。
 <R> Stream<R> map(Function<? super T,? extends R> mapper)`   | 对元素进行加工，并返回对应的新流
 static <T> Stream<T> concat(Stream a, Stream b)`             | 合并a和b两个流为一个流
 */
public class _2Intermediate_Operations {
    public static void main(String[] args) {
        List< String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        list.stream()
                .filter(s->s.startsWith("张"))
                .forEach(s-> System.out.println(s));
        System.out.println("--------------------------------");

        List<Double> scores=new ArrayList<>();
        scores.add(90.0);
        scores.add(80.0);
        scores.add(70.0);
        scores.add(60.0);
        scores.add(50.0);
        scores.add(70.0);

        scores.stream()
                .sorted()
                .forEach(System.out::println);//默认升序

        System.out.println("--------------------------------");

        scores.stream()
                .sorted((s1,s2)->Double.compare(s2,s1))
                .limit(2)//获取前2个
                .forEach(System.out::println);//降序
        System.out.println("--------------------------------");

        scores.stream()
                .sorted((s1,s2)->Double.compare(s2,s1))
                .distinct()//去重
                .forEach(System.out::println);//降序
        System.out.println("--------------------------------");

        scores.stream()
                .map(s->"加十分后："+(s+10))
                .forEach(System.out::println);
        System.out.println("--------------------------------");

        //合并流
        Stream<Object> s= Stream.concat(list.stream(),scores.stream());
        s.forEach(System.out::println);
    }
}
