package _14junit_reflect_annotation_proxy._3annotation;

import java.lang.reflect.Method;

public class AnnotationDemo4 {

    //模拟junit框架，有MyTest1注解的成员方法，执行，没有就不执行
    public static void main(String[] args) throws Exception{
        AnnotationDemo4 ad=new AnnotationDemo4();
        //1 获取类对象
        Class c= AnnotationDemo4.class;
        //2 获取所有方法
        Method[] methods=c.getDeclaredMethods();
        //3 遍历所有方法
        for (Method method:methods){
            //4 判断有无注解
            if (method.isAnnotationPresent(MyTest.class)){
                //获取到这个方法的注解
                MyTest myTest=method.getAnnotation(MyTest.class);
                int count=myTest.count();
                //5 有就执行method方法
                for (int i=0;i<count;i++) {
                    method.invoke(ad);
                }
            }
        }
    }

    //测试方法：无参 无返回值
    @MyTest
    public void test1(){
        System.out.println("test1方法执行了");
    }

    public void test2(){
        System.out.println("test2方法执行了");
    }

    @MyTest(count = 5)
    public void test3(){
        System.out.println("test3方法执行了");
    }

    @MyTest
    public void test4(){
        System.out.println("test4方法执行了");
    }
}
