package _14junit_reflect_annotation_proxy._1junit;

/**
 * 字符串工具类
 */
public class StringUtil {
    public static void printNumber(String name) {
        if (name == null) {
            System.out.println("参数不能为null");
            return;
        }
        System.out.println("名字长度是：" + name.length());
    }

    /**
     * 求字符串的最大索引
     */
    public static int getMaxIndex(String data) {
        if (data == null || "".equals(data)) {//确定值放前面防止空指针异常
            return -1;
        }
        return data.length();//有问题
    }
}