package _14junit_reflect_annotation_proxy._5proxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    // public static UserService createProxy(UserServiceImpl obj)
    public static <T> T createProxy(T obj) {//泛型
        //UserService proxy = (UserService) Proxy.newProxyInstance
        @SuppressWarnings("unchecked")
        T proxy = (T) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(obj, args);
                        long end = System.currentTimeMillis();
                        System.out.println(method.getName()+"方法耗时: " + (end - start) / 1000.0 + "秒");
                        return result;
                    }
                }
        );
        return proxy;
    }
}
