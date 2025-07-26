package _13innerClass;

public class 对象回调 {//我把对象给你 你又调用我的方法
    public static void main(String[] args) {
        Swim S1=new Swim() {
            @Override
            public void Swimming() {
                System.out.println("学生游泳");
            }
        };
        start(S1);//匿名对象S1传给方法start start又调用匿名对象S1

        Swim S2=new Swim() {
            @Override
            public void Swimming() {
                System.out.println("老师游泳");
            }
        };
        start(S2);

        //简洁写法
        start(new Swim(){
            @Override
            public void Swimming() {
                System.out.println("一起游泳");
            }
        });
    }

    public static void start(Swim s){
        System.out.println("开始游");
        s.Swimming();
        System.out.println("结束游");
    }
}

interface Swim{
    void Swimming();
}
