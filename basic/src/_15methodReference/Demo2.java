package _15methodReference;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        test2();
    }
    public static void test2() {
        Student[] students=new Student[6];
        students[0]=new Student("张三",18,180,"男");
        students[1]=new Student("李四",20,160,"女");
        students[2]=new Student("王五",19,170,"男");
        students[3]=new Student("赵六",17,165,"女");
        students[4]=new Student("孙七",16,155,"男");
        students[5]=new Student("周八",18,180,"女");

        //2 实例方法引用：如果Lambda表达式通过对象调用一个实例方法，并且“->”前后参数一致，就可以使用静态方法引用
        //前提： ->前后参数的形式一致，才可以使用实例方法引用
        Student t = new Student();
        //Arrays.sort(students,(o1,o2)->t.compareByHeight(o1,o2));
        Arrays.sort(students,t::compareByHeight);

        //遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}
