package _12Thread.ThreadSafe;

public class ThreadSafe {
    public static void main(String[] args) {
        Account acc=new Account("ICBC-110",100000);
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }
}
