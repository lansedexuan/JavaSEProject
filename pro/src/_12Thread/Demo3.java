package _12Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo3 {
    public static void main(String[] args) {
        /*
        创建线程的方式3：实现Callable接口
        1.创建Callable接口实现类的对象,重写call()方法，将此线程需要执行的任务，放在call()中
        2.把Callable类型的对象封装成FutureTask对象（线程任务对象）
        3.把FutureTask对象封装成Thread对象，调用start()方法启动线程
        4.通过FutureTask对象的get方法获取线程执行结果

        优点:可以继承类和实现接口，线程任务有返回值

          方式          	    优点	                                    缺点
        1 继承Thread类	    编程比较简单，可以直接使用Thread类中的方法	    扩展性较差，不能再继承其他的类，不能返回线程执行的结果
        2 实现Runnable接口	扩展性强，实现该接口的同时还可以继承其他的类 	编程相对复杂，不能返回线程执行的结果
        3 实现Callable接口	扩展性强，实现该接口的同时还可以继承其他的类     可以得到线程执行的结果	编程相对复杂
         */

        Callable<String> c1=new MyCallable(100);
        FutureTask<String> f1= new FutureTask<>(c1);//public FutureTask(Callable<V> callable) 本质是Runnable实现类
        //Runnable f1= new FutureTask<>(c1);//本质是Runnable对象
        Thread t1=new Thread(f1);
        t1.start();

        Callable<String> c2=new MyCallable(50);
        FutureTask<String> f2= new FutureTask<>(c2);
        Thread t2=new Thread(f2);
        t2.start();


        //获取线程执行结果
        try{//如果发现第一个线程没有执行完毕，会让出CPU，等第一个执行完毕，才会往下执行
            System.out.println(f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{//如果发现第二个线程没有执行完毕，会让出CPU，等第二个执行完毕，才会往下执行
            System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n){
        this.n = n;
    }
    public String call() throws Exception{
        int sum=0;
        for(int i=1;i<=n;++i){
            System.out.println(i);
            sum+=i;
        }
        return "子线程计算1-"+n+"的和："+sum;
    }
}
