package _00Exception;
/*
自定义运行时异常
- 定义一个异常类继承RuntimeException.
- 重写构造器。
- 通过throw new 异常类(xxx)来创建异常对象并抛出。
 */
public class AgeIllegalRuntimeException extends  RuntimeException{
    public AgeIllegalRuntimeException() {
    }
    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
