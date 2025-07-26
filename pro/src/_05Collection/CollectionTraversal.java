package _05Collection;

import java.util.*;

/*
default void forEach(Consumer<? super E> action) 结合Lambda遍历集合
 */

public class CollectionTraversal {
    public static void main(String[] args) {
        Collection<String> names=new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");

        Iterator<String> it=names.iterator();
        System.out.println(it.next());//默认指向集合0索引
        System.out.println(it.next());
        System.out.println(it.next());

        while(it.hasNext()){//hasNext():当前是否有数据
            System.out.println(it.next());
        }

        for(String name:names){
            System.out.println(name);
        }

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        });

//        names.forEach(s -> System.out.println(s));

        names.forEach(System.out::println);
    }
}
