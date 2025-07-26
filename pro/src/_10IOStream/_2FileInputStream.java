package _10IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class _2FileInputStream {
    public static void main(String[] args) throws Exception{
        /*
        FileInputStream（文件字节输入流）
        作用：以内存为基准，可以把磁盘文件中的数据以字节的形式读入到内存中去。

        构造器	                                说明
        public FileInputStream(File file)	    创建字节输入流管道与源文件接通
        public FileInputStream(String pathname)	创建字节输入流管道与源文件接通

        方法名称	                        说明
        public int read()	            每次读取一个字节返回，如果发现没有数据可读会返回 - 1.
        public int read(byte[] buffer)	每次用一个字节数组去读取数据，返回字节数组读取了多少个字节，如果发现没有数据可读会返回 - 1.
        public int readAllBytes()	    把文件全部读取到字节数组中并返回字节数组
         */
        //1 创建文件字节输入流管道与源文件接通
        InputStream is=new FileInputStream(new File("pro\\src\\_10IOStream\\FileInputStream.txt"));

        //2 读取文件中的字节并输出 每次读取一个字节
//        int b;
//        while((b=is.read())!=-1){//每次读取一个字节，性能较差，读取汉字输出会乱码
//            System.out.print((char)b);
//        }

        //3 读取文件中的字节并输出 每次读取多个字节
        byte[] buffer=new byte[32];//创建一个字节数组
        int len;//记住每次读取的字节数
        while((len=is.read(buffer))!=-1){
            String str=new String(buffer,0,len);//0,len表示从0索引开始，len个字节
            System.out.println(str);
        }
        //每次读取多个字节，性能高

        //一次读完全部字节
        byte[] bytes=is.readAllBytes();
        System.out.println(new String(bytes));

        is.close();
    }
}
