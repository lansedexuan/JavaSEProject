package _12Thread._6exceutorService;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n){
        this.n = n;
    }
    public String call() throws Exception{
        int sum=0;
        for(int i=1;i<=n;++i){
            sum+=i;
        }
        return Thread.currentThread().getName()+"计算1-"+n+"的和："+sum;
    }
}
