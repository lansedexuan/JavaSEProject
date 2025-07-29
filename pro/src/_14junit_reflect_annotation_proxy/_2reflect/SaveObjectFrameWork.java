package _14junit_reflect_annotation_proxy._2reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    public static void saveObject(Object obj) throws Exception{
        PrintStream ps = new PrintStream(new FileOutputStream("pro/src/_14junit_reflect_annotation_proxy/_2reflect/SaveObjectFrameWork.txt",true));
        //只有反射知道对象有多少字段
        //1 获取class对象
        Class c=obj.getClass();
        String simpleName=c.getSimpleName();//类名
        ps.println("--------------"+simpleName+"--------------");
        //2 获取calss的所有属性
        Field[] fields=c.getDeclaredFields();
        //3 遍历所有字段
        for (Field field:fields){
            field.setAccessible(true);//暴力反射
            //4 获取字段的名称
            String fieldName=field.getName();
            //5 获取字段的值
            Object fieldValue=field.get(obj)+"";
            //6 保存到文件中
            ps.println(fieldName+"="+fieldValue);
        }
        ps.close();
    }

}
