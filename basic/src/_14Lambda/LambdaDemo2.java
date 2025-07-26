package _14Lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
/*
@Data：自动生成 getter/setter、toString()、equals() 和 hashCode() 方法
@NoArgsConstructor：生成无参构造器
@AllArgsConstructor：生成全参构造器（包含所有字段的构造器）
*/


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

public class LambdaDemo2 {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        Student[] students=new Student[6];
        students[0]=new Student("张三",18,180,"男");
        students[1]=new Student("李四",20,160,"女");
        students[2]=new Student("王五",19,170,"男");
        students[3]=new Student("赵六",17,165,"女");
        students[4]=new Student("孙七",16,155,"男");
        students[5]=new Student("周八",18,180,"女");

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();//按照年龄升序
//            }
//        });

        //Lambda表达式只有一行代码，大括号可以不写，同时省略分号；去掉return
        Arrays.sort(students,( o1,o2)->o1.getAge()-o2.getAge());

        //遍历数组中的学生对象并输出
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);
        }
    }

    public static void test2(){
        JFrame win = new JFrame("登录窗口");
        win.setSize(300,200);
        win.setLocationRelativeTo(null);//居中
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel =new JPanel();//桌布
        win.add(panel);

        JButton btn = new JButton("登录");
        win.add(btn);

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("成功");
//            }
//        });

        btn.addActionListener(e->System.out.println("成功"));

        win.setVisible(true);
    }
}
