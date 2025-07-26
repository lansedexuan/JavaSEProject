package _10IOStream;

import java.io.*;

public class _9InputSreamReader {
    public static void main(String[] args) {
    /*
    解决不同编码时，字符流读取文本内容乱码的问题。
    解决思路：先获取文件的原始字节流，再将其按真实的字符集编码转成字符输入流，这样字符输入流中的字符就不乱码了。

    public InputStreamReader(InputStream is)	                把原始的字节输入流，按照代码默认编码转成字符输入流（与直接用 FileReader 的效果一样）
    public InputStreamReader(InputStream is, String charset)	把原始的字节输入流，按照指定字符集编码转成字符输入流（重点）
     */
        try(
                InputStream is = new FileInputStream("D:\\a.txt");//获取原始的字节输入流
                Reader isr = new InputStreamReader(is,"utf-8");//把原始的字节输入流转换成字符输入流
                BufferedReader br = new BufferedReader(isr);//把字符输入流包装成缓冲字符输入流
                ){

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
