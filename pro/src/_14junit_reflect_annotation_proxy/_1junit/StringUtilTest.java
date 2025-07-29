package _14junit_reflect_annotation_proxy._1junit;


import org.junit.Assert;
import org.junit.Test;

//junit测试类
/*
具体步骤
    将Junit框架的jar包导入到项目中（注意：IDEA集成了Junit框架，不需要我们自己手工导入了）
    为需要测试的业务类，定义对应的测试类，并为每个业务方法，编写对应的测试方法（必须：公共、无参、无返回值）
    测试方法上必须声明@Test注解，然后在测试方法中，编写代码调用被测试的业务方法进行测试；
    开始测试：选中测试方法，右键选择“JUnit运行”，如果测试通过则是绿色；如果测试失败，则是红色
 */
public class StringUtilTest {
    @Test
    public void testPrintNumber() {
        //测试用例
        StringUtil.printNumber("张三");
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        //测试用例
        int index1 = StringUtil.getMaxIndex("abcdefg");//6
        int index2 = StringUtil.getMaxIndex("");//-1
        int index3 = StringUtil.getMaxIndex(null);

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);

        //做断言 断言结果与预期结果是否一致
        Assert.assertEquals(6, index1);
        Assert.assertEquals(-1, index2);
        Assert.assertEquals(-1, index3);

    }
}
