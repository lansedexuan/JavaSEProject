package _05Collection._01Set;

/*
HashSet 集合的底层原理

哈希值
    就是一个 int 类型的随机值，Java 中每个对象都有一个哈希值。
    Java 中的所有对象，都可以调用 Object 类提供的 hashCode 方法，返回该对象自己的哈希值。
    public int hashCode (): 返回对象的哈希码值

对象哈希值的特点
    同一个对象多次调用 hashCode () 方法返回的哈希值是相同的。
    不同的对象，它们的哈希值大概率不相等，但也有可能会相等 (哈希碰撞)。

    int (-21 亿多～21 亿多) 45 亿个对象

    JDK8之前，哈希表=数组+链表
    JDK8开始，哈希表=数组+链表+红黑树

    JDK8开始，当链表长度超过8，且数组长度>=64时，自动将链表转成红黑树
 */

public class _2HashSetDemo1 {
    public static void main(String[] args) {

    }
}
