package _06Map;

import java.util.*;

/*
双列集合 Map 键值对
    1. HashMap<K,V> :无序、可重复、无索引 *
        实际上：原来学的 Set 系列集合的底层就是基于 Map 实现的，只是 Set 集合中的元素只要键数据，不要值数据而已。
        public HashSet() {
            map = new HashMap<>();
        }

    2. LinkedHashMap<K,V>：有序、可重复、无索引
        实际上：原来学习的 LinkedHashSet 集合的底层原理就是 LinkedHashMap。
        底层数据结构依然是基于哈希表实现的，只是每个键值对元素又额外的多了一个双链表的机制记录元素顺序 (保证有序)

    3. TreeMap<K,V>：默认升序、可重复、无索引
        原理：TreeMap跟TreeSet集合的底层原理是一样的，都是基于红黑树实现的排序。
        TreeMap集合同样也支持两种方式来指定排序规则
        - 让类实现Comparable接口，重写比较规则。
        - TreeMap集合有一个有参数构造器，支持创建Comparator比较器对象，以便用来指定比较规则。

    方法名称	                                说明
public V put(K key,V value)             	添加元素
public int size()	                        获取集合的大小
public void clear()	                        清空集合
public boolean isEmpty()	                判断集合是否为空，为空返回 true ，反之
public V get(Object key)	                根据键获取对应值
public V remove(Object key)	                根据键删除整个元素
public boolean containsKey(Object key)	    判断是否包含某个键
public boolean containsValue(Object value)	判断是否包含某个值
public Set<K> keySet()	                    获取全部键的集合
public Collection<V> values()	            获取 Map 集合的全部值
 */

public class MapDemo {
    public static void main(String[] args) {
        //HashMap特点：无序，Key不重复,Value可以重复
        //LinkedHashMap特点：有序，Key不重复,Value可以重复
        //TreeMap特点：有序，Key不重复,Value可以重复
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",18);
        map.put("李四",19);
        map.put("王五",20);
        System.out.println(map);

        //Map常见用法
        System.out.println(map.get("张三"));
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue(18));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.remove("张三"));
        System.out.println(map);
        System.out.println("------------------");

        //将键放入Set
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("------------------");

        //获取所有值放入Collection 可以重复
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}

