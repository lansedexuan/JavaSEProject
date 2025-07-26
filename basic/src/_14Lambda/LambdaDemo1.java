package _14Lambda;

/*
    java中的函数：Lambda表达式
    (被重写方法的形参列表) -> {
        被重写方法的方法提代码
    }
    用于替代某些匿名内部类对象
 */

public class LambdaDemo1 {
    //Lambda只能替代函数式接口（有且仅有一个抽象方法的接口）的匿名内部类
    public static void main(String[] args) {
//        Swim s1=new Swim(){
//            @Override
//            public void swimming() {
//                System.out.println("游泳");
//            }
//        };
        Swim s1=()->{
            System.out.println("游泳");
        };
        s1.swimming();
    }
}

abstract class Animal{
    public abstract void cry();
}

//函数式接口，只有一个抽象方法的接口
@FunctionalInterface//声明函数式接口的注解
interface Swim{
    void swimming();//一个抽象方法
}