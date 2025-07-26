package _12Thread.synchronized_code;

public class DrawThread extends Thread {
    private Account acc;
    public DrawThread(String name, Account acc) {
        super(name);
        this.acc=acc;
    }

    @Override
    public void run() {
        //取钱
        acc.drawMoney(100000);
    }
}
