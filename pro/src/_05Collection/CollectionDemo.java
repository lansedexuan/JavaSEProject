package _05Collection;

import java.util.*;

/*
1. 单列集合 Collection 数据
    集合接口：
    1. List :有序、可重复、有索引
        集合接口的实现类：
        1. ArrayList *
        2. LinkedList
    2. Set ：无序、不重复、无索引
        集合接口的实现类：
        1. HashSet：无序、不重复、无索引 *
        2. LinkedHashSet：有序、不重复、无索引
        3. TreeSet：默认升序、不重复、无索引

    需记住添加顺序、存重复元素、频繁按索引查：
        用 ArrayList，有序、可重复、有索引，底层基于数组（常用）
    需记住添加顺序、增删首尾数据多：
        用 LinkedList，有序、可重复、有索引，底层基于双链表
    不在意顺序、无重复元素、增删改查快：
        用 HashSet，无序、不重复、无索引，底层基于哈希表（常用）
    需记住添加顺序、无重复元素、增删改查快：
        用 LinkedHashSet，有序、不重复、无索引，底层基于哈希表和双链表
    要对元素排序、无重复元素、增删改查快：
        用 TreeSet，基于红黑树实现

2. 双列集合 Map 键值对
    1. HashMap<K,V> :无序、可重复、无索引 *
    2. LinkedHashMap<K,V>：有序、可重复、无索引
    3. TreeMap<K,V>：默认升序、可重复、无索引
 */

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

public class CollectionDemo {
    public static void main(String[] args) {
        //List
        List<String> list=new ArrayList<>();//多态写法
        list.add("Java");
        list.add("C");
        list.add("C");
        System.out.println(list);
        String s=list.get(0);
        System.out.println(s);

        //Set
        Set<String> set=new HashSet<>();
        set.add("Java");
        set.add("C");
        set.add("C");
        System.out.println(set);

        //把集合转换成数组
        Object[] arr=list.toArray();
        System.out.println(Arrays.toString(arr));

        //把集合转换成字符串数组
        String[] arr1=list.toArray(new String[0]);
        String[] arr2=list.toArray(String[]::new);//方法引用
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
