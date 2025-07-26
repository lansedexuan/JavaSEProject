package _10IOStream;

import java.io.*;

public class _4CopyDemo {
    public static void main(String[] args) {
        //使用字节流完成文件的复制操作
        //源文件：Demo.txt
        //目标文件（一定要文件名 无法自动生成）：CopyDemo.txt

        //字节流非常适合文件复制
        try{
            copyFile("pro\\src\\_10IOStream\\Demo.txt","pro\\src\\_10IOStream\\CopyDemo.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void copyFile(String srcPath,String destPath) throws  Exception{
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream(srcPath);
            fos=new FileOutputStream(destPath);
            byte[] bytes=new byte[1024];
            int len;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {//释放资源 最后一定会执行一次

            try {
                if(fis!=null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fos!=null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
