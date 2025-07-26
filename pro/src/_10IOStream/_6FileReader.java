package _10IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class _6FileReader {
    public static void main(String[] args) {
    /*
    作用:以内存为基准，可以把文件中的数据以字符的形式读入到内存中去。

        构造器	                            说明
        public FileReader(File file)	    创建字符输入流管道与源文件接通
        public FileReader(String pathname)	创建字符输入流管道与源文件接通

        方法名称	                        说明
        public int read()	            每次读取一个字符返回，如果发现没有数据可读会返回 - 1。
        public int read(char[] buffer)	每次用一个字符数组去读取数据，返回字符数组读取了多少个字符，如果发现没有数据可读会返回 - 1。
     */

        //1 创建文件字符流输入与源文件接通
        try ( Reader fr=new FileReader("pro\\src\\_10IOStream\\FileReader.txt");){
            //定义字符数组，每次读多个字符
            char[] buffer=new char[1024];
            int len;
            while((len=fr.read(buffer))!=-1){
                //把字符数组转换成字符串并输出
                System.out.print(new String(buffer,0,len));//不加ln
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
