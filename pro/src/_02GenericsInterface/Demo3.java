package _02GenericsInterface;

public class Demo3 {
    public static void main(String[] args) {
        StudentData sd=new StudentData();
        sd.add(new Student());
        sd.delete(new Student());
        Student s= sd.query(1);
    }
}
