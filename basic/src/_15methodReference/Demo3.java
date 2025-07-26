package _15methodReference;

import java.util.Arrays;
import java.util.Comparator;

public class Demo3 {    public static void main(String[] args) {
    test2();
}
    public static void test2() {
        String[] names={"Tom","Jerry","Mike","Mary","Lucy","Jack","tony"};

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);//忽略首字母大小进行比较
            }
        });

        //3 特定类型的方法引用 特定类型的名称::方法
        //参数列表中第一个参数作为方法的主调，第二个参数作为方法的入调
        //Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
