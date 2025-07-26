package _10IOStream;

import java.io.*;

public class _5CopyDemo {
    public static void main(String[] args) {
        try{
            copyFile("pro\\src\\_10IOStream\\Demo.txt","pro\\src\\_10IOStream\\CopyDemo.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void copyFile(String srcPath,String destPath) throws  Exception{
        // try-with-resource
        try (
            /*
            放置资源对象，用完后会自动调用close()方法关闭
            不能定义变量

            资源一般指的是最终实现了 AutoCloseable 接口
                public abstract class InputStream implements Closeable{ }
                public abstract class OutputStream implements Closeable, Flushable { }
                public interface Closeable extends AutoCloseable { }
            */
                InputStream fis=new FileInputStream(srcPath);
                OutputStream fos=new FileOutputStream(destPath);
                Myclose myclose=new Myclose();
             ){
            byte[] bytes=new byte[1024];
            int len;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Myclose implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Myclose()关闭了");
    }
}
//155