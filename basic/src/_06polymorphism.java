/*
 * 解决多态下父类无法调用子类都有功能呢个问题：强制类型转换
 * 父类 父类变量名 = new 子类
 * 强制类型转换： 子类 变量名 = (子类) 父类变量名
 *
 * 运行时 发现对象真实类型与强转后类型不同 会CLassCastException
 *
 * instanceof 判断当前对象真实对象，再进行强转
 * if(a instanceof child1){}
 * else{}
 *
 * final
 * 修饰类
 * 修饰方法
 * 修饰变量 只能赋值一次 大写+下划线
 */

public class _06polymorphism {

}
