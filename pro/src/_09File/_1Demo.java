package _09File;

import java.io.File;

public class _1Demo {
    public static void main(String[] args) {
/*
    File 类的对象可以代表文件 / 文件夹，并可以调用其提供的方法对象文件进行操作。
    创建 File 类的对象

    构造器	                                 说明
    public File(String pathname)	         根据文件路径创建文件对象
    public File(String parent, String child) 根据父路径和子路径名字创建文件对象
    public File(File parent, String child)	 根据父路径对应文件对象和子路径名字创建文件对象

    注意
    File 对象既可以代表文件、也可以代表文件夹。
    File 封装的对象仅仅是一个路径名，这个路径可以是存在的，也允许是不存在的。

    public boolean exists()	        判断当前文件对象，对应的文件路径是否存在，存在返回 true
    public boolean isFile()	        判断当前文件对象指代的是否是文件，是文件返回 true，反之...
    public boolean isDirectory()	判断当前文件对象指代的是否是文件夹，是文件夹返回 true
    public String getName()	        获取文件的名称（包含后缀）
    public long length()	        获取文件的大小，返回字节个数
    public long lastModified()	    获取文件的最后修改时间。
    public String getPath()	        获取创建文件对象时，使用的路径
    public String getAbsolutePath()	获取绝对路径

    File 类创建文件的功能
    方法名称	                        说明
    public boolean createNewFile()	创建一个新的空的文件
    public boolean mkdir()	        只能创建一级文件夹
    public boolean mkdirs()	        可以创建多级文件夹

    File 类删除文件的功能
    方法名称	                        说明
    public boolean delete()	        删除文件、空文件夹
    注意：delete 方法默认只能删除文件和空文件夹，删除后的文件不会进入回收

    File 类提供的遍历文件夹的功能
    方法名称	                    说明
    public String[] list()	    获取当前目录下所有的 “一级文件名称” 到一个字符串数组中去返回。
    public File[] listFiles()	获取当前目录下所有的 “一级文件对象” 到一个文件对象数组中去返回（重点）

    使用listFiles方法时的注意事项：
    - 当主调是文件，或者路径不存在时，返回null
    - 当主调是空文件夹时，返回一个长度为0的数组
    - 当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
    - 当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
    - 当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
*/
        File file1 = new File("D:\\DkJavaCode\\JavaSE\\JavaSEProject\\pro\\src\\_09File\\Demo.java");
        File file2 = new File("D:/DKJavaCode/JavaSE/JavaSEProject/pro/src/_09File/Demo.java");
        System.out.println("1: "+file1);
        System.out.println("2: "+file2);
        System.out.println((file1.isFile()));

        //相对路径
        File file3 = new File("Demo.java");
    }
}
