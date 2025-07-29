package _12Thread._5lock;

import _12Thread._3synchronized_code.Account;

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
