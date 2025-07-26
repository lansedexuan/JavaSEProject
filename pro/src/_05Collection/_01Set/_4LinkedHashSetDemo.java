package _05Collection._01Set;

import java.util.LinkedHashSet;

/*
    底层基于HashMap，使用双链表添加顺序
 */

public class _4LinkedHashSetDemo {
    public static void main(String[] args) {
        // 创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        // 添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("world");
        linkedHashSet.add("hello");
        // 遍历集合
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
