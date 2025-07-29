package _14junit_reflect_annotation_proxy._4proxy;

public class Test {
    public static void main(String[] args) {
        //创建代理对象
        //1 设计明星类
        Star star = new Star("张三");
        //2 创建明星代理对象
        StarService proxy = ProxyUtil.createProxy(star);
        //3 调用代理对象方法
        proxy.sing("《红昭愿》");
        System.out.println(proxy.dance());
    }
}
