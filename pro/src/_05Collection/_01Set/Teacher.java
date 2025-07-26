package _05Collection._01Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

//1. 对象类实现Comparable接口, 并重写compare方法
public class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private String address;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\''  +
                '}' + '\n';
    }

    /*
        t2.compareTo(t1)
        t2 = this
        t1 = o
        左边大于右边 返回正数
        左边小于右边 返回负数
        左边等于右边 0
     */
    @Override
    public int compareTo(Teacher o) {
        return this.age - o.age;
    }
}
