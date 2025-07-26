package _10IOStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class _3FileOutputStream {
    public static void main(String[] args) throws Exception{
        /*
        ### FileOutputStream文件字节输出流
- 作用：以内存为基准，把内存中的数据以字节的形式写出到文件中去。

    构造器
    构造器                                                     | 说明
    public FileOutputStream(File file)                        | 创建字节输出流管道与源文件对象接通
    public FileOutputStream(String filepath)                  | 创建字节输出流管道与源文件路径接通
    public FileOutputStream(File file, boolean append)        | 创建字节输出流管道与源文件对象接通，可追加数据
    public FileOutputStream(String filepath, boolean append)  | 创建字节输出流管道与源文件路径接通，可追加数据

    public byte[] getBytes()                              | 使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中 。

    方法名称                                                | 说明
    public void write(int a)                              | 写一个字节出去
    public void write(byte[] buffer)                      | 写一个字节数组出去
    public void write(byte[] buffer , int pos , int len)  | 写一个字节数组的一部分出去 从pos开始，len个字节
    public void close() throws IOException                | 关闭流
         */
        //OutputStream os=new FileOutputStream("pro\\src\\_10IOStream\\FileOutputStream.txt");//写数据不用创建文件
        OutputStream os=new FileOutputStream("pro\\src\\_10IOStream\\FileOutputStream.txt", true);//追加数据

        os.write(97);//97是a的ASCII码
        os.write('b');
        //os.write('你');//写入一个字符 会乱码
        os.write("\r\n".getBytes());//换行 \r\n兼容性好

        byte[] bytes="你好 世界".getBytes();
        os.write(bytes);

        os.write(bytes,0,3);//你 3个字节

        os.close();
    }
}
