package _08Varargs_CollectionsTool;

/*
    方法中可变参数
    - 就是一种特殊形参，定义在方法、构造器的形参列表里，格式是：数据类型...参数名称；

    可变参数的特点和好处
    - 特点：可以不传数据给它；可以传一个或者同时传多个数据给它；也可以传一个数组给它。
    - 好处：常常用来灵活的接收数据。
 */
public class _1VarargsDemo {
    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20);
        sum(new int[]{10,20,30});


    }
    // 可变参数在形参列表中只能有一个，必须放在形参列表最后面
    public static void sum(int...nums){
        //可变参数对内部来说，就是一个数组
        System.out.println(nums.length);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("----------");
    }
}
