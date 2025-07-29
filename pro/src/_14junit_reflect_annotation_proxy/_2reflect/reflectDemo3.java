package _14junit_reflect_annotation_proxy._2reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class reflectDemo3 {
    public static void main(String[] args) throws Exception{
        //反射破坏封装性
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");

        Class c1=list.getClass();//c1=ArrayList.class
        Method add=c1.getDeclaredMethod("add",Object.class);//获取ArrayList的add方法
        add.invoke(list,100);//调用listd的add方法
        add.invoke(list,9.9);
        add.invoke(list,true);

        System.out.println(list);
    }
}
