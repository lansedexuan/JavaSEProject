package _12Thread.synchronized_code;

public class ThreadSafe {
    public static void main(String[] args) {
        Account acc1=new Account("ICBC-110",100000);
        new DrawThread("小明",acc1).start();
        new DrawThread("小红",acc1).start();

        Account acc2=new Account("ICBC-111",10000000);
        new DrawThread("小王",acc2).start();
        new DrawThread("小李",acc2).start();
    }
}
