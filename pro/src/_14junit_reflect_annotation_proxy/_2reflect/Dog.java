package _14junit_reflect_annotation_proxy._2reflect;

public class Dog {
    private String name;
    private int age;
    private String hobby;

    private Dog (){
        System.out.println("无参构造");
    }//私有也可以拿

    private Dog(String name) {
        System.out.println("1个参数有参构造");
        this.name = name;
    }

    public Dog(String name, int age) {
        System.out.println("2个参数有参构造");
        this.name = name;
        this.age = age;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void eat() {
        System.out.println("狗吃吃吃");
    }

    public String eat(String food){
        return "吃吃吃" + food;
    }

    @Override
    public String toString() {
        return "Dog{name=" + name + ", age=" + age + ", hobby="+hobby+"}";
    }
}
