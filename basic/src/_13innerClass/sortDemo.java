package _13innerClass;

import java.util.Arrays;
import java.util.Comparator;
/*
@Data：自动生成 getter/setter、toString()、equals() 和 hashCode() 方法
@NoArgsConstructor：生成无参构造器
@AllArgsConstructor：生成全参构造器（包含所有字段的构造器）
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student {
    //姓名 年龄 身高 性别
    private String name;
    private int age;
    private double height;
    private String sex;
}

public class sortDemo {
    public static void main(String[] args) {
        Student[] students=new Student[6];
        students[0]=new Student("张三",18,180,"男");
        students[1]=new Student("李四",20,160,"女");
        students[2]=new Student("王五",19,170,"男");
        students[3]=new Student("赵六",17,165,"女");
        students[4]=new Student("孙七",16,155,"男");
        students[5]=new Student("周八",18,180,"女");

        //按照年龄升序排序，调用sun公司写好的api对数组排序
        //public static void sort(T[] a,Comparator<T> c)
        //需要排序的数组，给sort声明一个比较起对象，指定排序的规则
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                //o1>02 返回正数 o2在前
//                if(o1.getAge()>o2.getAge()) return 1;
//                else if (o1.getAge()<o2.getAge()) return -1;
//                else return 0;
                return o1.getAge()-o2.getAge();//按照年龄升序
            }
        });

        //遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }
}

