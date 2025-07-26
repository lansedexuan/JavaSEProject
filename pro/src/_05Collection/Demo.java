package _05Collection;

import java.util.*;

/*


**解决并发修改异常问题的方案**

① 如果集合支持索引，可以使用for循环遍历，每删除数据后做i--；或者可以倒着遍历

② 可以使用迭代器遍历，并用迭代器提供的删除方法删除数据。

注意：增强for循环/Lambda遍历均不能解决并发修改异常问题，因此增它们只适合做数据的遍历，不适合同时做增删操作。
 */

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//shift+F6
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");

        //并发修改异常
        // 需求1: 删除全部枸杞
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(name.contains("枸杞")){
                list.remove(name);
                i--; // 解决方案1：删除数据后做一步i--操作
            }
        }
        // [Java入门, 宁夏枸杞, 黑枸杞, 人字拖, 特级枸杞, 枸杞子, 西洋参]
        // [Java入门, 人字拖, 西洋参]
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();//shift+F6
        list1.add("Java入门");
        list1.add("宁夏枸杞");
        list1.add("黑枸杞");
        list1.add("人字拖");
        list1.add("特级枸杞");
        list1.add("枸杞子");
        list1.add("西洋参");
        System.out.println(list1);
        for (int i = list1.size()-1; i >=0; i--) {// 解决方案2：倒着遍历
            String name = list1.get(i);
            if(name.contains("枸杞")){
                list1.remove(name);
            }
        }
        System.out.println(list1);

        //三种集合的区别
        //遍历并删除：
        //迭代器删除可以解决并发修改异常（集合无索引）
        //增强for和Lambda不能解决删除问题，只适合做遍历
    }
}
