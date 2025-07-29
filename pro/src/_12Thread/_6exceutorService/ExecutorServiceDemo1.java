package _12Thread._6exceutorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        //1 使用线程池的实现类ThreadPoolExecutor声明7个参数来创建线程池对象
        /*
        - 参数一：corePoolSize :     指定线程池的核心线程的数量。 正式工：3
        - 参数二：maximumPoolSize：  指定线程池的最大线程数量。   最大员工数：5
        - 参数三：keepAliveTime ：   指定临时线程的存活时间。    临时工空闲多久被开除
        - 参数四：unit：             指定临时线程存活的时间单位（秒、分、时、天）
        - 参数五：workQueue：        指定线程池的任务队列。      客人排队的地方
        - 参数六：threadFactory：    指定线程池的线程工厂        负责招聘员工的（hr）
        - 参数七：handler：          指定线程池的任务拒绝策略    （线程都在忙，任务队列也满了的时候，新任务来了该怎么处理）忙不过来咋办？
         */
        ExecutorService pool=new ThreadPoolExecutor(3,5,10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        /*
        策略	                                        说明
        ThreadPoolExecutor.AbortPolicy()	        丢弃任务并抛出RejectedExecutionException异常。是默认的策略
        ThreadPoolExecutor.DiscardPolicy()	        丢弃任务，但是不抛出异常，这是不推荐的做法
        ThreadPoolExecutor.DiscardOldestPolicy()	抛弃队列中等待最久的任务然后把当前任务加入到队列中
        ThreadPoolExecutor.CallerRunsPolicy()	    由主线程负责调用任务的run()方法从而绕过线程池直接执行
         */

        //2 使用线程池处理Runnable任务，看会不会复用线程
        Runnable target=new MyRunnable();
        pool.execute(target);//1 提交第一个任务
        pool.execute(target);//2 提交第二个任务
        pool.execute(target);//3 提交第三个任务

        pool.execute(target);//1 复用
        pool.execute(target);//2
        pool.execute(target);//3 任务队列满

        pool.execute(target);//1 临时线程创建时机
        pool.execute(target);//2 临时线程创建时机

        pool.execute(target);//1 3+2+1 > 5 任务拒绝时机


        //3 关闭线程池，一般不关闭线程池
        pool.shutdown();//等所有任务执行完毕再关闭线程池
        //pool.shutdownNow();//立即关闭线程池，不等任务执行完毕

        //临时线程创建时机
        //新任务提交时发现核心线程都忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
        //临时线程拒绝时机
        //核心线程和临时线程都忙，任务队列也满了，新任务来了，此时临时线程就会拒绝任务
    }
}
