package _14junit_reflect_annotation_proxy._2reflect;

public class reflectDemo1 {
    public static void main(String[] args) throws Exception{
        //1 获取类本身 类.class
        Class c1=Student.class;
        System.out.println(c1);

        //2 获取类本身 Class.forName("全类名")
        Class c2=Class.forName("_14junit_reflect_annotation_proxy._2reflect.Student");
        System.out.println(c2);

        //3 获取对象本身 对象.getClass()
        Student s=new Student();
        Class c3=s.getClass();
        System.out.println(c3);

        System.out.println(c1==c2);
        System.out.println(c1==c3);
    }
}
