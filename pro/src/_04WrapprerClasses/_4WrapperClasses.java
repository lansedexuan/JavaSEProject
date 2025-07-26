package _04WrapprerClasses;

import java.util.ArrayList;

public class _4WrapperClasses {
    public static void main(String[] args) {
        //泛型和集合不支持基本数据类型，只能支持对象类型（引用数据类型）
        //ArrayList<int> list=new ArrayList<int>();
        //泛型擦除：泛型在编译期间会被擦除，编译后变成Object类型
        //list.add(12);
        //Object o=12;不支持基本数据类型

        /*
        包装类就是把基本类型的数据包装成对象的类型。
        基本数据类型	对应的包装类（引用数据类型）
        byte	Byte
        short	Short
        int	    Integer *
        long	Long
        char	Character *
        float	Float
        double	Double
        boolean	Boolean
         */

        //手动包装，淘汰
        //Integer i=new Integer(1);

        //推荐 -127 ~ 128 对象已经封装好 不会再new
        Integer i1=Integer.valueOf(1);
        Integer i2=Integer.valueOf(1);
        System.out.println(i1==i2);

        //自动包装：基本类型 自动转换为 对象
        Integer i3=130;
        Integer i4=130;
        System.out.println(i3==i4);

        //自动拆箱：包装类型 自动转换为 基本类型
        int i=i3;
        System.out.println(i);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(123);//把123自动包装成Integer对象
        list.add(456);//自动装箱

        int recv=list.get(1);//自动拆箱

        /*
        包装类具备的其他功能
            可以把基本类型的数据转换成字符串类型。

            1 把基本类型的数据转换为字符串
            public static String toString(double d)
            public String toString()

            2 把字符串数值转换为基本数据类型
            public static int parseInt(String s)
            public static Integer valueOf(String s) 推荐
         */

        //1 把基本类型的数据转换为字符串
        int j=23;
        String s=Integer.toString(j);

        Integer j1=j;
        String s1=j1.toString();

        String s2=j+"";//直接转换为字符串

        //2 把字符串数值转换为基本数据类型
        String str="98";
        int j2=Integer.parseInt(str);
        int j3=Integer.valueOf(str);//推荐
        System.out.println(j2);
        System.out.println(j3);
    }
}

