package _05Collection._01Set;

/*
Set ：无序、不重复、无索引
    无序：添加数据和获取数据顺序不一致
    1. HashSet：无序、不重复、无索引
    2. LinkedHashSet：有序、不重复、无索引
    3. TreeSet：默认升序、不重复、无索引
 */

import java.util.*;

public class _1SetDemo {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Java");
        set.add("C");
        //不能get

        Set<String> set1=new LinkedHashSet<>();

        Set<Double> set2=new TreeSet<>();
        set2.add(1.2);
        set2.add(3.4);
        set2.add(2.1);
        System.out.println(set2);
        System.out.println(set2.hashCode());
    }
}
/*
Collection是单列集合的祖宗，它规定的方法（功能）是全部单列集合都会继承的。
    方法名	                            说明
    public boolean add(E e)	            把给定的对象添加到当前集合中
    public void clear()	                清空集合中所有的元素
    public boolean remove(E e)	        把给定的对象在当前集合中删除
    public boolean contains(Object obj)	判断当前集合中是否包含给定的对象
    public boolean isEmpty()	        判断当前集合是否为空
    public int size()	                返回集合中元素的个数
    public Object[] toArray()	        把集合中的元素，存储到数组中
 */