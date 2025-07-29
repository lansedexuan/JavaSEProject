package _12Thread._4synchronized_method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;

    public synchronized void drawMoney(double money){ //同步方法
        String name=Thread.currentThread().getName();
        synchronized (this) {//唯一对象 锁住当前账户 acc1/acc2
            //实例方法：this
            //静态方法：字节码 类名.class
            if(this.money>=money){
                System.out.println(name+"取钱成功，取钱金额："+money);
                this.money-=money;
                System.out.println(name+"取钱成功，余额为："+this.money);
            }
            else{
                System.out.println(name+"取钱失败，余额不足");
            }
        }
    }
}
