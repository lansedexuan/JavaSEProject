package _12Thread;

public class Demo1 {
    public static void main(String[] args) {
        /*
        创建多线程的方式一：继承Thread类
        1.创建一个继承Thread类的子类
        2.创建Thread类的子类对象MyThread
        3.调用start()方法启动线程

        直接调用run()方法会当成普通线程执行，只有调用start()方法才会启动多线程

        缺点：
        无法继承其他类
         */
        Thread t1=new MyThread();
        t1.start();

        for(int i=0;i<100;i++){
            System.out.println("主线程：" + i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程：" + i);
        }
    }
}