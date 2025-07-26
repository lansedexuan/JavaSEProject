public class _03static {
    //方法放入栈中
    //new 对象 类地址  放入堆区

    //this 哪个对象调用方法 this就拿到哪个对象
    //用来解决对象的成员对象和方法内部局部变量名称一样时导致的访问冲突

    //静态方法：有static修饰的成员方法，属于类
    //类名.静态方法
    public static class Student{
        static String name; //静态变量 某个数据只需要一份 且希望被共享
        int age;
    }

    public static void printHelloWorld(){//工具类没有创建对象的必要性，构造器私有
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    //实例方法：没有static修饰的成员方法，属于对象
    //对象名.实例方法
    public class User{
        public  static int number;

        public User(){
            User.number++;//可以记住创建了多少用户对象
        }
    }

    /*
    * 静态方法：只是为了做一个功能，不需要直接访问对象数据
    * 实例方法：需要访问对象数据，需要创建对象调用，会浪费内存
    * */
    public static void main(String[] args) {//静态方法调用方便 jvm会直接_03static.main()去执行
        /*static
          静态成员变量：属于类 在计算机中只有一份 会被类的全部对象共享
          实例变量：属于每个对象

           类名.静态变量 1
           对象.实例变量 3
         */


        // 1、类名.静态变量（推荐）
        Student.name = "袁华";
        System.out.println(Student.name);

        // 2、对象名.静态变量（不推荐）
        Student s1 = new Student();
        s1.name = "马冬梅";
        Student s2 = new Student();
        s2.name = "秋雅";

        System.out.println(s1.name); // 秋雅
        System.out.println(Student.name); // 秋雅

        // 3、对象名.实例变量
        s1.age=23;
        s2.age=18;
        System.out.println(s1.age);//23
        //System.out.println(Student.age);//报错

        printHelloWorld();//_03static.printHelloWorld() 这里_03static可以省略 类名在同一个类中可以不写

        /*
        静态方法 可以访问静态成员 不可以访问实例成员
        实例方法 可以访问静态成员 也可以访问实例成员
        实例方法可以出现this关键字，静态方法不可以出现this关键字
         */
    }
}
