package _16API;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {

        //1 推荐方式 直接""创建对象
        String s1="hello";
        System.out.println(s1);//重写了toString()方法 打印内容
        System.out.println(s1.length());

        //2 构造器
        String s2=new String();
        System.out.println(s2);

        //3 不推荐
        String s3=new String("hello");
        System.out.println(s3);

        //4
        char[] ch={'h','e','l','l','o'};
        String s4=new String(ch);
        System.out.println(s4);

        //5
        byte[] b={97,98,99,100};//字节
        String s5=new String(b);
        System.out.println(s5);

        /*
        String创建对象的区别
            - 只要是以“...”方式写出的字符串对象，会存储到字符串常量池，且相同内容的字符串只存储一份；
            - 通过new方式创建字符串对象，每new一次都会产生一个新的对象放在堆内存中。
        */
        String s6="hello";
        String s7="hello";
        System.out.println(s6==s7);//字符串常量池 节约内存

        String s8=new String("hello");
        String s9=new String("hello");
        System.out.println(s8==s9);//堆内存 创建了两个对象

        /*
                        方法名                                         | 说明
public int length()                                                  | 获取字符串的长度返回（就是字符个数）
public char charAt(int index)                                        | 获取某个索引位置处的字符返回
public char[] toCharArray()                                          | 将当前字符串转换成字符数组返回
public boolean equals(Object anObject)                               | 判断当前字符串与另一个字符串的内容一样，一样返回true
public boolean equalsIgnoreCase(String anotherString)                | 判断当前字符串与另一个字符串的内容是否一样(忽略大小写)
public String substring(int beginIndex, int endIndex)                | 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
public String substring(int beginIndex)                              | 从传入的索引处截取，截取到末尾，得到新的字符串返回
public String replace(CharSequence target, CharSequence replacement) | 使用新值，将字符串中的旧值替换，得到新的字符串
public boolean contains(CharSequence s)                              | 判断字符串中是否包含了某个字符串
public boolean startsWith(String prefix)                             | 判断字符串是否以某个字符串内容开头，开头返回true，反之
public String[] split(String regex)                                  | 把字符串按照某个字符串内容分割，并返回字符串数组回来
         */

        //eqials
        String okLoginName="admin";
        Scanner sc=new Scanner(System.in);//扫描器，输入
        String loginName=sc.next();

        if(okLoginName.equals(loginName)){//equals 只关心内容 不关心地址
            System.out.println("登录成功");
        }
        else {
            System.out.println("登录失败");
        }

        //substring
        String phone=sc.next();
        String newphone=phone.substring(0,3)+"****"+phone.substring(7);
        System.out.println(newphone);
    }
}
