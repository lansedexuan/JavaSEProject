package _12Thread;

public class Demo2_2 {
    public static void main(String[] args) {
        //匿名内部类: 创建Runnable匿名内部类对象,交给Thread线程对象，start

//        Runnable r=new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("子线程：" + i);
//                }
//            }
//        };
//        Thread t1=new Thread(r);
//        t1.start();

//        Thread t1=new Thread(new Runnable(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("子线程：" + i);
//                }
//            }
//        });
//        t1.start();

        Thread t1=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                    System.out.println("子线程：" + i);
                }
        });
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程：" + i);
        }
    }
}

