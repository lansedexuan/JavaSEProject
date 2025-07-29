package _14junit_reflect_annotation_proxy._3annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//元注解
@Target({ElementType.METHOD})//声明该注解只能用于方法、成员变量
@Retention(RetentionPolicy.RUNTIME)//声明该注解在运行时保留(一直存在)
public @interface MyTest {
    int count() default 1;//表示注解的属性
}
