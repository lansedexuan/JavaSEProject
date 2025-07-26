package _12Thread;

public class Demo2_1 {
    public static void main(String[] args) {
        /*
        创建多线程的方式二：实现Runnable接口
        1.创建一个实现Runnable接口的类,重写run()方法
        2.创建Runnable接口的实现类对象MyRunnable
        3.创建Thread类对象，构造方法中传递Runnable接口的实现类对象

        优点：可以继承其他类
        缺点：需要多一个Runnable对象

         */

        Runnable r=new MyRunnable();
        Thread t1=new Thread(r);
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程：" + i);
        }
    }
}
