package _00Exception;

/*
异常:编译或者执行可能出现的错误

Java的异常体系
    Java.lang.Throwable
        1. Error: 代表的系统级别错误(属于严重问题)，也就是说系统一旦出现问题，sun公司会把这些问题封装成Error对象给出来
                （说白了，Error是给sun公司自己用的，不是给我们程序员用的，因此我们开发人员不用管它）
        2. Exception
            2.1 RuntimeException
                运行时异常：RuntimeException及其子类，编译阶段不会出现错误提醒，运行时出现的异常（如：数组索引越界异常）
            2.2 编译时异常：编译阶段就会出现错误提醒的
                没有继承RuntimeExeption的异常，编译阶段就会出现错误提醒
 */

/*
处理异常
    1 抛出异常
        throw Exception
    2 捕获异常
        try{
        } catch(Exception e){
            e.printStackTrace();
        }
 */
public class Demo1 {
    public static void main(String[] args) {
        try{
            System.out.println(div1(10,0));
            System.out.println(div2(10,0));
            System.out.println("底层方法执行成功");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("底层方法执行失败");
        }
    }

    public static int div1(int a,int b){
        if(b==0){
            throw new RuntimeException("除数不能为0");
        }
        return a/b;
    }

    public static int div2(int a,int b) throws Exception{
        if(b==0){
            throw new Exception("除数不能为0");
        }
        return a/b;
    }
}

