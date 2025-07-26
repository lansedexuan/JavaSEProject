package _10IOStream;

import java.io.FileWriter;
import java.io.Writer;

public class _7FileWriter {
    public static void main(String[] args) {
    /*
    作用:以内存为基准，把内存中的数据以字符的形式写出到文件中去。

        构造器	                                            说明
        public FileWriter(File file)	                    创建字节输出流管道与源文件对象接通
        public FileWriter(String filepath)	                创建字节输出流管道与源文件路径接通
        public FileWriter(File file, boolean append)	    创建字节输出流管道与源文件对象接通，可追加数据
        public FileWriter(String filepath, boolean append)	创建字节输出流管道与源文件路径接通，可追加数据

        方法名称	                                    说明
        void write(int c)	                        写一个字符
        void write(String str)	                    写一个字符串
        void write(String str, int off, int len)	写一个字符串的一部分
        void write(char[] cbuf)	                    写入一个字符数组
        void write(char[] cbuf, int off, int len)	写入字符数组的一部分


        字符输出流写出数据后，必须刷新流，或者关闭流，写出去的数据才能生效

        方法名称	                                说明
        public void flush() throws IOException	刷新流，就是将内存中缓存的数据立即写到文件中去生效！
        public void close() throws IOException	关闭流的操作，包含了刷新！
     */
        try(  Writer fw = new FileWriter("pro\\src\\_10IOStream\\FileWriter.txt",true);) {
            fw.write('a');
            fw.write('你');
            fw.write("好");
            fw.write("hello world");

            fw.write("java",0,2);

            char[] chars="java".toCharArray();
            fw.write(chars);
            fw.write(chars,0,2);//从0开始写2个字符
            fw.write("\r\n");

            fw.flush();//刷新缓冲区，将缓冲区中的数据全部写出去
            //刷新后流可以继续使用
            //fw.close();//关闭包含了刷新，关闭后流不能继续使用

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
