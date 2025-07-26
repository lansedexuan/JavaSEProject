package _05Collection._01Set;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String address;
    private String phone;

    public Student() {
    }

    public Student(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\''  +
                '}' + '\n';
    }

    //如果希望Se认为两个内容一样的对象是重复的，必须重写hashCode()和equals()方法
    @Override
    public int hashCode() {//内容一样的对象，hashCode()返回值也一样
        return Objects.hash(name, age, address, phone);
    }

    @Override
    public boolean equals(Object o) {//内容一样的对象，equals()返回值也一样
        if(this == o) return true;//自己和自己比较，返回true s1.equals(s1)==true
        if (o == null || getClass() != o.getClass()) return false;//o是空对象，或者o的类型和Student不一致，返回false
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone);
    }
}
