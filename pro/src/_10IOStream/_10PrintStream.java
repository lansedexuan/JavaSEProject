package _10IOStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class _10PrintStream {
    public static void main(String[] args) {
    /*
    作用：打印流可以实现更方便、更高效的打印数据出去，能实现打印啥出去就是啥出去。
    PrintStream 提供的打印数据的方案

    public PrintStream(OutputStream/File/String)	                            打印流直接通向字节输出流 / 文件 / 文件路径
    public PrintStream(String fileName, Charset charset)	                    可以指定写出去的字符编码
    public PrintStream(OutputStream out, boolean autoFlush)	                    可以指定实现自动刷新
    public PrintStream(OutputStream out, boolean autoFlush, String encoding)	可以指定实现自动刷新，并可指定字符的编码

    public void println(Xxx xx)	                    打印任意类型的数据出去
    public void write (int/byte []/byte [] 一部分)	可以支持写字节数据出去
     */
        try(
                //PrintStream ps = new PrintStream(new FileOutputStream("pro\\src\\_10IOStream\\PrintStream.txt"));
                //低级管道才支持追加true
                PrintStream ps=new PrintStream(new FileOutputStream("pro\\src\\_10IOStream\\PrintStream.txt",true));
                ){
            ps.println("hello world");
            ps.println(true);
            ps.println(100);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
