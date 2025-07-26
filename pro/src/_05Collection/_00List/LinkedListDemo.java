package _05Collection._00List;

import java.util.LinkedList;

/*
    特点：查询慢，增删相对较快，但对首尾元素进行增删改查的速度是极快的。
    LinkedList 新增了：很多首尾操作的特有方法。
    方法名称 & 说明：

    public void addFirst (E e)： 在该列表开头插入指定的元素
    public void addLast (E e)：  将指定的元素追加到此列表的末尾
    public E getFirst ()：       返回此列表中的第一个元素
    public E getLast ()：        返回此列表中的最后一个元素
    public E removeFirst ()：    从此列表中删除并返回第一个元素
    public E removeLast ()：     从此列表中删除并返回最后一个元素

    可以用来设计队列和栈
*/

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> queue=new LinkedList<>();//特有方法 不用多态
        queue.addLast("hello");
        queue.addLast("world");

        //入栈
        LinkedList<String> stack=new LinkedList<>();
        stack.addFirst("hello");
        stack.addFirst("world");
        stack.push("java");//push=addFirst
        stack.push("123");
        //出栈
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());//pop=removeFirst3
    }
}
