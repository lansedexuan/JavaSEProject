package _16API;

public class StringDemo2 {
    public static void main(String[] args) {
        String code=getCode(4);
        System.out.println(code);
    }

        //随机验证码
    public static String getCode(int n){
        //1 字符集
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
        //2 定义变量记住验证码随机字符
        String code = "";
        //3 循环n次，每次生成一个随机字符，拼接字符串
        for (int i = 1; i <= n; i++) {
            int index = (int)(Math.random()*str.length());//【0,1）*62=【0,63】
            code += str.charAt(index);//根据索引提取字符
        }
        return code;
    }

}
