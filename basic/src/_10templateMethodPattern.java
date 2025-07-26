//模板方法设计模式
abstract class People{
    public final void write(){//不能被子类重写
        System.out.println("begin");
        writeMain();//模板方法，具体实现交给子类
        System.out.println("end");
    }
    public abstract void writeMain();
}

class _10Student extends People{
    public void writeMain(){
        System.out.println("hello world");
    }
}

class _10Teacher extends People{
    public void writeMain(){
        System.out.println("123");
    }
}

public class _10templateMethodPattern {
    public static void main(String[] args) {
        People _10p1=new _10Student();
        _10p1.write();
        People _10p2=new _10Teacher();
        _10p2.write();
    }
}
