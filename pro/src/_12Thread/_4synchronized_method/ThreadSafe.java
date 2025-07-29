package _12Thread._4synchronized_method;

public class ThreadSafe {
    public static void main(String[] args) {
        _12Thread._3synchronized_code.Account acc1=new _12Thread._3synchronized_code.Account("ICBC-110",100000);
        new _12Thread._3synchronized_code.DrawThread("小红",acc1).start();
        new _12Thread._3synchronized_code.DrawThread("小明",acc1).start();

    }
}
