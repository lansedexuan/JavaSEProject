package _01Generics;

public class Demo2 {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
    }
}
