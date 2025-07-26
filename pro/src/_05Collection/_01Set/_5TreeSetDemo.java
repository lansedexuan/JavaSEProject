package _05Collection._01Set;

import java.util.*;
/*
TreeSet 特点：
    不重复、无索引、可排序（默认升序，按元素大小从小到大排 ），底层基于红黑树实现排序
排序规则：
    数值类型（Integer、Double 等）：按数值本身大小升序排
    字符串类型：按首字符编号升序排
    自定义类型（如 Student 对象）：默认无法直接排序
 */

//TreeSet默认不能给自定义对象排序 因为不知道大小规则

//1. 对象类实现Comparable接口, 并重写compare方法
//2. public TreeSet自带比较器Comparator对象
public class _5TreeSetDemo {
    public static void main(String[] args) {
        //自定义排序
//        Set<Teacher> teachers=new TreeSet<>(new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {//2. public TreeSet自带比较器Comparator对象
//                return o2.getAge()-o1.getAge();
//            }
//        });
        Set<Teacher> teachers=new TreeSet<>((o1,o2)->o2.getAge()-o1.getAge());
        //Set<Teacher> teachers=new TreeSet<>((o1,o2)->Double.compare(o1.getSalary(),o2.getSalary()));

        teachers.add(new Teacher("张三", 20, "上海", 23.43));
        teachers.add(new Teacher("李四", 19, "上海", 4345.43));
        teachers.add(new Teacher("王五", 21, "上海", 434));
        teachers.add(new Teacher("赵六", 20, "上海", 656.4));
        System.out.println(teachers);
    }
}
