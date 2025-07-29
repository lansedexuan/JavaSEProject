package _14junit_reflect_annotation_proxy._3annotation;

@MyBook(name = "张三", age = 18, address = {"北京", "上海"})
//@A(value = "delete")
@A("delete")
public class AnnotationDemo1 {
    @MyBook(name = "张三", age = 18, address = {"北京", "上海"})
    public static void main(String[] args) {

    }
}
