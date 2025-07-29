package _13Net;

import java.net.InetAddress;

public class InetAddressDemo {
    public static void main(String[] args) {
        try{
            //获取本机ip
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println(localhost);
            System.out.println(localhost.getHostName());
            System.out.println(localhost.getHostAddress());

            //获取对方ip
            InetAddress inet1 = InetAddress.getByName("www.baidu.com");
            System.out.println(inet1);
            System.out.println(inet1.getHostName());
            System.out.println(inet1.getHostAddress());

            //判断本机与对方主机是否连接
            System.out.println(inet1.isReachable(5000));//5s
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
