package _05Collection._01Set;

import java.util.*;

public class _3HaseSetDemo2 {
    public static void main(String[] args) {
        //利用Set去重
        //如果希望Se认为两个内容一样的对象是重复的，必须重写hashCode()和equals()方法
        Student s1=new Student("张三",18,"上海","123456");
        Student s2=new Student("李四",19,"上海","655623");
        Student s3=new Student("张三",18,"上海","123456");
        Student s4=new Student("李四",19,"上海","655623");

        Set<Student> set=new HashSet<Student>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);

    }
}
