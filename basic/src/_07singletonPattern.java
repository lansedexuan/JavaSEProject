/*
单例设计模式：确保某个类只能创建一个对象
    把类的构造器私有
    定义一个类变量记住类的一个对象
    定义一个类方法，返回对象
 */

//饿汉式单例：拿到对象时，对象早就创建好了
class A {
    //2 定义一个静态变量 构建本类的唯一对象
    public static final A a =new A();//方法1
    //private static A a =new A();//方法2

    //1 私有化构造器
    private A(){
    }

    //3 提供静态方法 返回唯一对象
    public static A getInstance(){//方法2
        return a;
    }
}

//懒汉式单例：用对象时，才创建对象
class B{
    //2 私有化静态变量
    private static B b;//null

    private B(){} //1 私有化构造器

    public static B getInstance(){//3 真正需要对象时候才开始创建对象
        if(b==null) b=new B();
        return b;
    }
}

public class _07singletonPattern {
    public static void main(String[] args) {
        A a1=A.a;
        A a2=A.a;
        A a3=A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a1==a2);

        //A.a=null;//把A的唯一对象干掉了
        System.out.println(a3);

        B b1=B.getInstance();
        B b2=B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);
    }
}
