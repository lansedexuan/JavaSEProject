package _08Varargs_CollectionsTool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Collections
    是一个用来操作集合的工具类
    Collections 提供的常用静态方法

方法名称	                                                                    说明
public static <T> boolean addAll(Collection<? super T> c, T... elements)	给集合批量添加元素
public static void shuffle(List<?> list)	                                打乱 List 集合中的元素顺序
public static <T> void sort(List<T> list)	                                对 List 集合中的元素进行升序排序
public static <T> void sort(List<T> list, Comparator<? super T> c)	        对 List 集合中元素，按照比较器对象指定的规则进行排序
 */
public class _2CollectionToolDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        //添加元素
        Collections.addAll(list, "1 hello", "2 world", "3 java", "4 world", "5 hello");
        System.out.println(list);

        //打乱顺序
        Collections.shuffle(list);
        System.out.println(list);
    }
}
