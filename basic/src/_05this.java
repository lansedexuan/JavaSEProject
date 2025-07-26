class Student{
    private String name;
    private char sex;
    private int age;
    private String schoolName;

    public Student(){}

    public Student(String name,char sex,int age,String schoolName){//被调用构造器
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Student(String name,char sex,int age){
        //this调用兄弟构造器
        //super(...) this(...)必须写在构造器第一行 两者不能同时出现 有了一个就不能写另一个
        this(name,sex,age,"黑马程序员");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public char getSex(){
        return sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    @Override
    public String toString(){
        return "Student{name:"+name+",sex:"+sex+",age:"+age+",schoolName:"+schoolName+"}";
    }
}

public class _05this {
    public static void main(String[] args) {
        Student s1=new Student("张三",'男',18);
        System.out.println(s1);

        Student s2=new Student("张三",'男',18,"上海大学");
        System.out.println(s2);
    }
}
