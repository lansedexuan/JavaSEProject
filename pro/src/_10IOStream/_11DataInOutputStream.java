package _10IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class _11DataInOutputStream {
    public static void main(String[] args) throws Exception{
    /*
        public DataOutputStream(OutputStream out)	创建新数据输出流包装基础的字节输出流

        public final void writeByte(int v) throws IOException	    将 byte 类型的数据写入基础的字节输出流
        public final void writeInt(int v) throws IOException	    将 int 类型的数据写入基础的字节输出流
        public final void writeDouble(Double v) throws IOException	将 double 类型的数据写入基础的字节输出流
        public final void writeUTF(String str) throws IOException	将字符串数据以 UTF-8 编码成字节写入基础的字节输出流
        public void write (int/byte []/byte [] 一部分)	            支持写字节数据出去
     */
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("pro\\src\\_10IOStream\\DataOutputStream.txt"));
                ){
            dos.writeByte(34);
            dos.writeUTF("你好");
            dos.writeInt(34);
            dos.writeDouble(34.34);
        }catch(Exception e){
            e.printStackTrace();
        }
        try(
                DataInputStream dis = new DataInputStream(new FileInputStream("pro\\src\\_10IOStream\\DataOutputStream.txt"));
        ){
            System.out.println(dis.readByte());
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
