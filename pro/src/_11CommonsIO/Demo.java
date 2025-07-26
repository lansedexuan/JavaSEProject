package _11CommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Demo {
    public static void main(String[] args) throws Exception{
        /*
        导入 commons-io-2.11.0.jar 框架到项目中去。

        1. 在项目中创建一个文件夹：lib
        2. 将 commons-io-2.6.jar 文件复制到 lib 文件夹
        3. 在 jar 文件上点右键，选择 Add as Library -> 点击 OK
        4. 在类中导包使用

        方法	                                                                说明
        public static void copyFile(File srcFile, File destFile)	        复制文件
        public static void copyDirectory(File srcDir, File destDir)	        复制文件夹
        public static void deleteDirectory(File directory)	                删除文件夹
        public static String readFileToString(File file, String encoding)	读数据
        public static void writeStringToFile(File file, String data, String charname, boolean append)	写数据

        public static int copy(InputStream inputStream, OutputStream outputStream)	    复制文件
        public static int copy(Reader reader, Writer writer)	                        复制文件
        public static void write(String data, OutputStream output, String charsetName)	写数据
         */
        //IO框架
        FileUtils.copyFile(new File("pro\\src\\_10IOStream\\Demo.txt"),new File("pro\\src\\_11CommonsIO\\CopyDemo.txt"));
        //JDK7提供
        //Files.copy(Path.of("pro\\src\\_10IOStream\\Demo.txt"), Path.of("pro\\src\\_11CommonIO\\CopyDemo.txt"));

        //删除
        //FileUtils.deleteDirectory(new File("pro\\src\\_11CommonsIO\\CopyDemo.txt"));
    }
}
