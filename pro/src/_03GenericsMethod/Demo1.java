package _03GenericsMethod;

import _02GenericsInterface.Student;
/*
泛型方法
    修饰符 <类型变量, 类型变量, ...> 返回值类型 方法名(形参列表) {
    }

    泛型方法 ，
    public static <T> void test(T t){
    }

    错误 不是泛型方法
    public E get(int index){
        return (E) arr[index];
    }

通配符
    ？ 表示任意类型
    在使用泛型时表示一切类型
    E T K V实在定义泛型时使用

泛型上下限
    泛型上限： ？extends Car  ?能接受的类型是Car或者Car的子类
    泛型下限： ？super Car  ?能接受的类型是Car或者Car的父类
 */
public class Demo1 {
    public static void main(String[] args) {
        // 目标：学会定义泛型方法，搞清楚作用。
        // 需求：打印任意数组的内容。
        String[] names = {"赵敏", "张无忌", "周芷若", "小昭"};
        printArray(names);

        Student[] stus = new Student[3];
        printArray(stus);

        Student max = getMax(stus);
        String max2 = getMax(names);
    }
    public static <T> void printArray(T[] names){
    }

    public static <T> T getMax(T[] names){
        return null;
    }
}
