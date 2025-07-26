package _16API;

import java.util.ArrayList;

public class ArrayListDemo {
    /*
    构造器          | 说明
public ArrayList() | 创建一个空的集合对象

    常用方法名                            | 说明
public boolean add(E e)                 | 将指定的元素添加到此集合的末尾
public void add(int index, E element)   | 在此集合中的指定位置插入指定的元素
public E get(int index)                 | 返回指定索引处的元素
public int size()                       | 返回集合中的元素的个数
public E remove(int index)              | 删除指定索引处的元素，返回被删除的元素
public boolean remove(Object o)         | 删除指定的元素，返回删除是否成功
public E set(int index, E element)      | 修改指定索引处的元素，返回被修改的元素
     */
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//泛型定义集合

        //添加
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
        System.out.println("-----------------------");
        //查看
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("-----------------------");
        //遍历
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------");
        //删除数据
        System.out.println(list.remove(2));//根据索引删除
        System.out.println(list);
        System.out.println(list.remove("java"));//根据内容删除
        System.out.println("-----------------------");
        //修改
        list.set(1,"123");
        System.out.println(list);
    }
}
