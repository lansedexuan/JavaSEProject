package _14junit_reflect_annotation_proxy._3annotation;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo3 {
    @Test
    public void parseClass() throws Exception {
        //1 获取类对象
        Class c=Demo.class;
        //2 判断类上是否存在MyTest2注解
        if(c.isAnnotationPresent(MyTest2.class)){
            //3 获取注解对象
            MyTest2 mt= (MyTest2) c.getDeclaredAnnotation(MyTest2.class);
            //4 获取注解属性
            String[] address= mt.address();
            double height= mt.height();
            String value= mt.value();

            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }

    @Test
    public void paresMethod () throws Exception{
        //1 获取类对象
        Class c=Demo.class;
        //2 获取方法对象
        Method m=c.getDeclaredMethod("go");
        //3 判断类上是否存在MyTest2注解
        if(m.isAnnotationPresent(MyTest2.class)){
            MyTest2 mt= m.getDeclaredAnnotation(MyTest2.class);
            String[] address= mt.address();
            double height= mt.height();
            String value= mt.value();

            System.out.println(Arrays.toString(address));
            System.out.println(height);
            System.out.println(value);
        }
    }
}
