package _00Exception;

/*
自定义运行时异常
- 定义一个异常类继承RuntimeException.
- 重写构造器。
- 通过throw new 异常类(xxx)来创建异常对象并抛出。

特点：编译阶段不报错，运行时才可能出现！提醒不属于激进型。

自定义编译时异常
- 定义一个异常类继承Exception.
- 重写构造器。
- 通过throw new 异常类(xxx) 创建异常对象并抛出。

特点：编译阶段就报错，提醒比较激进
 */

public class Demo2 {
    public static void main(String[] args) {
        try{
            saveAge(0);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void saveAge(int age) throws AgeIllegalException{//throws
        if(age<1||age>200){
            throw new AgeIllegalException("年龄需要在1-200之间！");//自定义编译时异常
        }
        else{
            System.out.println("保存年龄成功！");
        }
    }
}
