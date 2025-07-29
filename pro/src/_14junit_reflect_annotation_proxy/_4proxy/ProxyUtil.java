package _14junit_reflect_annotation_proxy._4proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//中介公司
public class ProxyUtil {
    //创建明星对象的代理对象返回
    public static StarService createProxy(Star s){
        /*
        java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：
        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
            参数一：用于指定用哪个类加载器，去加载生成的代理类
            参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
            参数三：用来指定生成的代理对象要干什么事情
         */
        StarService proxy = (StarService) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一：用于指定用哪个类加载器，去加载生成的代理类
                s.getClass().getInterfaces(),//参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //参数一：代理对象本身  参数二：正在被代理的方法 参数三：正在被代理的方法的参数
                        //代理对象要干什么事情
                        String methodName = method.getName();
                        if("sing".equals(methodName)){
                            System.out.println("准备话筒");
                        }else if("dance".equals(methodName)){
                            System.out.println("准备场地");
                        }
                        //真正干活
                        Object result = method.invoke(s,args);//反射
                        return result;
                    }
                }//参数三：用来指定生成的代理对象要干什么事情
        );
        return proxy;
    }

}
