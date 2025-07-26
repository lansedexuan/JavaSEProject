package _01Generics;

import java.util.ArrayList;

/*
    定义类、接口、方法时，同时声明了一个或者多个类型变量（如：<E>）
    称为泛型类、泛型接口，泛型方法、它们统称为泛型。

    public class ArrayList<E>{
        ...
    }
    作用：泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力！这样可以避免强制类型转换，及其可能出现的异常。
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList list =new ArrayList();
        ArrayList<String> list1=new ArrayList<>();

        list.add(100);
        list.add("hello");
        list.add(true);
        list.add(new Object());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
