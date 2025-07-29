package _14junit_reflect_annotation_proxy._2reflect;

public class reflectDemo4 {
    public static void main(String[] args) throws Exception{
        Dog dog=new Dog("小黄",2);
        Student stu=new Student("小王",18,"football");
        Teacher tea=new Teacher("小李",19,"basketball",5000,"1班",'男',"12345678901");

        SaveObjectFrameWork.saveObject(dog);
        SaveObjectFrameWork.saveObject(stu);
        SaveObjectFrameWork.saveObject(tea);
    }
}
