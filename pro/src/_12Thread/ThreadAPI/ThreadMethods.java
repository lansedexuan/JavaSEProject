package _12Thread.ThreadAPI;

/*
    方法	                                说明
    public void run()	                线程的任务方法
    public void start()	                启动线程
    public String getName()	            获取当前线程的名称，线程名称默认是Thread-索引
    public void setName(String name)	为线程设置名称
    public static Thread currentThread()获取当前执行的线程对象
    public static void sleep(long time)	让当前执行的线程休眠多少毫秒后，再继续执行
    public final void join()...	        让调用当前这个方法的线程先执行完！

    构造器	                                    说明
    public Thread(String name)	                可以为当前线程指定名称
    public Thread(Runnable target)	            封装Runnable对象成为线程对象
    public Thread(Runnable target, String name)	封装Runnable对象成为线程对象，并指定线程名称
 */
public class ThreadMethods {
    public static void main(String[] args) {
        Thread t1=new MyThread("一号线程");
        t1.start();
        System.out.println("线程名称：" + t1.getName());//Thread-索引

        Thread t2=new MyThread("二号线程");
        t2.start();
        System.out.println("线程名称：" + t2.getName());

        Thread.currentThread();//主线程 哪个线程调用这个代码，就返回哪个线程
        System.out.println("线程名称：" + Thread.currentThread().getName());//main
    }
}

class MyThread extends Thread {
    public MyThread(String name){
        super(name);//public Thread(String name)
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程：" + i);
        }
    }
}