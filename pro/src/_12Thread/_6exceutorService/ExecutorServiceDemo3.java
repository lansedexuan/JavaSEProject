package _12Thread._6exceutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
方法名称	                                                                        说明
public static ExecutorService newFixedThreadPool(int nThreads)	                创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
public static ExecutorService newSingleThreadExecutor()	                        创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程。
public static ExecutorService newCachedThreadPool()	                            线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了60s则会被回收掉。
public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)	创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。
 */
public class ExecutorServiceDemo3 {
    public static void main(String[] args) {
    //通过线程池工具类：Executors调用其静态方法直接得到线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Future<String> f1= pool.submit(new MyCallable(100));
        Future<String> f2= pool.submit(new MyCallable(200));
        Future<String> f3= pool.submit(new MyCallable(300));
        Future<String> f4= pool.submit(new MyCallable(400));

        try{
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());//复用
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
            CPU 密集型任务：corePoolSize = CPU核心数 + 1
            I/O 密集型任务：corePoolSize = CPU核心数 * 2
         */
    }
}
