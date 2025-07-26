package _06Map;

import java.util.*;

/*
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

public class MapTraversal {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",18);
        map.put("李四",19);
        map.put("王五",20);

        //1 键找值
        Set<String> keys=map.keySet();
        for (String key:keys) {//键找值
            Integer value=map.get(key);
            System.out.println(key+"--"+value);
        }
        System.out.println("------------------");

        //2 键值对
        Set<Map.Entry<String,Integer>> entries=map.entrySet();//Entry对象
        for (Map.Entry<String,Integer> entry:entries) {
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"--"+value);
        }
        System.out.println("------------------");

        //3 Lambda表达式
        map.forEach((key,value)-> System.out.println(key+"--"+value));
    }
}
