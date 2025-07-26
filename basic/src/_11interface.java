/*
interface
jdk8之前 只能定义成员变量和成员方法
jdk8之后 默认方法 私有方法 类方法
        default private static

public interface A {
    //1、默认方法（实例方法）：使用用default修饰，默认会被加上public修饰。
    //注意：只能使用接口的实现类对象调用 A a = new A(); a.test1();
    default void test1() {
        ...
        test2();
    }

    //2、私有方法：必须用private修饰(JDK 9开始才支持)
    //使用接口中的其他实例方法来调用
    private void test2() {
            ...
    }

    //3、类方法（静态方法）：使用static修饰，默认会被加上public修饰。
    //注意：只能用当前接口名来调用。 A.test3();
    static void test3() {
            ...
    }
}

接口可以被类实现 implements，一个类可以同时实现多个接口(类似继承)
接口不能创建对象

类与类：单继承 extends 一个类只能继承一个直接父类
类与接口：多实现 implements一个类可以同时实现多个接口。
接口与接口：多继承 extends 一个接口可以同时继承多个接口。

一个类又继承父类 又实现接口 会优先用父类
 */

//接口好处：弥补了类单继承的不足: class Student extends People implements Driver{}

interface _11A {
    void show();
}

interface _11B {
    void show();
}

class _11C implements _11A,_11B{//实现类必须重写完全部接口的抽象方法
    @Override
    public void show() {
        System.out.println("show");
    }
}

public class _11interface {
    public static void main(String[] args) {
        _11C c=new _11C();
        c.show();
    }
}

/*
抽象类和接口

相同点:
    多是抽象形式，都可以有抽象方法，都不能创建对象。
    都是派生子类形式：抽象类是被子类继承使用，接口是被实现类实现。
    一个类继承抽象类，或者实现接口，都必须重写完他们的抽象方法，否则自己要成为抽象类或者报错！
    都能支持的多态，都能够实现解耦合。

不同点:
    抽象类中可以定义类的全部普通成员，接口只能定义常量，抽象方法（JDK8新增的三种方式）
    抽象类只能被类单继承，接口可以被类多实现。
    一个类继承抽象类就不能再继承其他类，一个类实现了接口（还可以继承其他类或者实现其他接口）。
    抽象类体现模板思想：更利于做父类，实现代码的复用性。 最佳实践
    接口更适合做功能的解耦合：解耦合性更强更灵活。 最佳实践
 */

//83