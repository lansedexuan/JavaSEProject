package _14junit_reflect_annotation_proxy._5proxyDemo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1、创建代理对象。
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());

        // 2、调用用户业务的功能。
        userService.login("admin", "123456");

        userService.deleteUsers();

        String[] names = userService.selectUsers();
        System.out.println("查询到的用户是: " + Arrays.toString(names));
    }
}
