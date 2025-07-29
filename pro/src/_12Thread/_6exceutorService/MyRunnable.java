package _12Thread._6exceutorService;

/*
    方法名称	                            说明
    void execute(Runnable command)	    执行 Runnable 任务
    Future<T> submit(Callable<T> task)	执行 Callable 任务，返回未来任务对象，用于获取线程返回的结果
    void shutdown()	                    等全部任务执行完毕后，再关闭线程池！
    List<Runnable> shutdownNow()	    立刻关闭线程池，停止正在执行的任务，并返回队列中未执行的任务
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + "输出：" + i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
