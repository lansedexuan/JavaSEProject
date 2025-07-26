package _10IOStream;

import java.io.*;

public class _8BufferedStream {
    public static void main(String[] args) {
    /*
        BufferedInputStream 缓冲字节输入流
        作用：可以提高字节输入流读取数据的性能
        原理：缓冲字节输入流自带了 8KB 缓冲池；缓冲字节输出流也自带了 8KB 缓冲池。

        构造器	说明
        public BufferedInputStream(InputStream is)	    把低级的字节输入流包装成一个高级的缓冲字节输入流，从而提高读数据的性能
        public BufferedOutputStream(OutputStream os)	把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能

        public BufferedReader(Reader r)	                把低级的字符输入流包装成字符缓冲输入流管道，从而提高字符输入流读字符数据的性能
        public String readLine()	                    读取一行数据返回，如果没有数据可读了，会返回 null

        public BufferedWriter(Writer r)	                把低级的字符输出流包装成一个高级的缓冲字符输出流管道，从而提高字符输出流写数据的性能
        public void newLine()	                        换行

     */
        try(
                Reader fr=new FileReader(new File("pro\\src\\_10IOStream\\FileInputStream.txt"));
                BufferedReader br=new BufferedReader(fr);
                ){
           System.out.println(br.readLine());
           System.out.println(br.readLine());
           System.out.println(br.readLine());

           String line;
           while((line=br.readLine())!=null){
               System.out.println(line);
           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void copyFile(String srcPath,String destPath) throws  Exception{
        try (
                InputStream fis=new FileInputStream(srcPath);
                //把低级的字节输入流包装成高级的缓冲字节输入流
                InputStream bis=new BufferedInputStream(fis);

                OutputStream fos=new FileOutputStream(destPath);
                //把低级的字节输出流包装成高级的缓冲字节输出流
                OutputStream bos=new BufferedOutputStream(fos);
        ){
            byte[] bytes=new byte[1024];
            int len;
            while((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
