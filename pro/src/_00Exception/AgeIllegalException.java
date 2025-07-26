package _00Exception;
/*
自定义编译时异常
- 定义一个异常类继承Exception.
- 重写构造器。
- 通过throw new 异常类(xxx) 创建异常对象并抛出。
 */
public class AgeIllegalException extends  Exception{
    public AgeIllegalException() {
    }
    public AgeIllegalException(String message) {
        super(message);
    }
}
