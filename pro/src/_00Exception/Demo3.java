package _00Exception;

public class Demo3 {
    public static void main(String[] args) {
        while(true){//最外层捕获异常 尝试重新修复
            try{
                saveAge(300);
                break;
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    public static void saveAge(int age) {
        if(age<1||age>200){
            throw new AgeIllegalRuntimeException("年龄需要在1-200之间！");//自定义运行时异常
        }
        else{
            System.out.println("保存年龄成功！");
        }
    }
}
