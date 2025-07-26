package _15methodReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        //创建接口的匿名内部类对象
//        CarFactory cf=new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car(name);
//            }
//        };

        //Lambda表达式创建对象，并且->前后参数情况一致，可以构造器引用
        //CarFactory cf=name->new Car(name);
        CarFactory cf=Car::new;

        Car c1 =cf.getCar("保时捷");
        System.out.println(c1);
    }
}

interface CarFactory{
    Car getCar(String name);
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Car{
    private String name;
}