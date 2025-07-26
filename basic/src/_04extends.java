/*
    public class A extends B{
    }

    权限修饰符 修饰成员变量、成员方法、构造器
    1 private 只能当前类
    2 default（缺省、没有修饰符） 当前类、同一个包
    3 protected 当前类、子孙类、同一个包
    4 public 任何位置

    java继承特点：
        单继承：一个类只能继承一个父类（证明：反证法，a.method() b.method c extends a b 矛盾）
        多层继承：多层继承指一个类继承自另一个类，而被继承的类本身也继承自其他类
        所有类都是Object子类
        就近原则：优先检查当前类 → 直接父类 → 更高层父类（自下而上）
                子父类出现重名成员：super.父类成员变量/方法


 */
class Animal{
    public void eat(){}

    public String toString(){//重写toString()
        return "I am an animal";
    }
}

class Cat extends Animal{
    /*
       @Override:方法重写校验注解，要求方法名称和形参列表一致，否则报错
           私有方法、静态方法不能被重写
     */
    @Override
    public void eat(){
        System.out.println("吃吃吃");
    }
}

public class _04extends {
    public static void main(String[] args) {
        Cat cat=new Cat();
        System.out.println(cat.toString());//toString被忽略 输出对象地址 无意义
        System.out.println(cat);//效果一样
    }
}
