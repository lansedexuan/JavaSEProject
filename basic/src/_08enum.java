/*
    修饰符 enum 枚举类名{
        名称1,名称2,...;
        其他成员...
    }
 */
enum enumA{
    X,Y,Z;
}
/*
public enum A{
    X,Y,Z;
}

- 枚举都是最终类，不可以被继承，枚举类都是继承java.lang.Enum类的。
- 枚举类的第一行只能罗列一些名称，这些名称都是常量，并且每个常量会记住枚举类的一个对象。
- 枚举类的构造器都是私有的（写不写都只能是私有的），因此，枚举类对外不能创建对象。
- 编译器为枚举类新增了几个方法。

public final class A extends java.lang.Enum<A> {
    public static final A X = new A();
    public static final A Y = new A();
    public static final A Z = new A();

    public static A[] values();//所以对象放入数组中
    public static A valueOf(java.lang.String);
}
 */
public class _08enum {
    public static void main(String[] args) {
        enumA a1=enumA.X;
        System.out.println(a1);
    }
}
