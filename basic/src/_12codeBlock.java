/*
静态代码块
    格式： static{}
    特点： 类加载时自动执行，由于类只会加载一次。所以静态代码块只执行一次 main方法之前
    作用： 完成类的初始化
 */

/*
实例代码块
    格式： {}
    特点：每次创建对象时，执行实例代码块，在构造器前执行 创建类时执行
    作用：完成对象的初始化
 */
import java.util.Arrays;

public class _12codeBlock {
    public static String schoolName;
    public static String[] cards=new String[3];

    static{//静态代码块
        System.out.println("静态代码块执行");
        schoolName="黑马";
        cards[0]="大王";
        cards[1]="小王";
    }

    {//实例代码块
        System.out.println("实例代码块执行");
    }

    public static void main(String[] args){
        System.out.println("Main方法执行");

        System.out.println(schoolName);
        System.out.println(Arrays.toString(cards));//返回数组的内容

        new _12codeBlock();
        new _12codeBlock();
        new _12codeBlock();
    }
}
