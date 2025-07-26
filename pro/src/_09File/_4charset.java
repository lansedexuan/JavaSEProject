package _09File;

import java.util.Arrays;

/*
对字符的编码
    String 提供了如下方法	                说明
    byte[] getBytes()	                使用平台的默认字符集将该 String 编码为一系列字节，将结果存储到新的字节数组中
    byte[] getBytes(String charsetName)	使用指定的字符集将该 String 编码为一系列字节，将结果存储到新的字节数组中

对字符的解码
    String 提供了如下方法	                        说明
    String(byte[] bytes)	                    通过使用平台的默认字符集解码指定的字节数组来构造新的 String
    String(byte[] bytes, String charsetName)	通过指定的字符集解码指定的字节数组来构造新的 String
 */
public class _4charset {
    public static void main(String[] args) throws Exception{
        //1 编码
        String name="hello world 你好 世界 !";
        byte[] bytes=name.getBytes();//默认使用UTF-8编码
        byte[] bytes1=name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes1));

        //2 解码
        String name1=new String(bytes);//默认使用UTF-8解码
        String name2=new String(bytes1,"GBK");
        System.out.println(name1);
        System.out.println(name2);
    }
}
