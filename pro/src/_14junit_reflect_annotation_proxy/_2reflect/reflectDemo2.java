package _14junit_reflect_annotation_proxy._2reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectDemo2 {
    @Test
    public void getClassInfo() {//获取类信息
        //获取类信息
        //1 获取类对象
        Class c1=Dog.class;
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
    }

    /* 用Declared
    Constructor<?>[] getConstructors()	                                获取全部构造器（只能获取public修饰的）
    Constructor<?>[] getDeclaredConstructors()	                        获取全部构造器（只要存在就能拿到）
    Constructor<T> getConstructor(Class<?>... parameterTypes)	        获取某个构造器（只能获取public修饰的）
    Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)	获取某个构造器（只要存在就能拿到）
     */
    @Test
    public void getConstructorInfo() throws Exception{//获取构造器对象
        //1 获取类对象
        Class c1=Dog.class;
        //2 获取构造器对象
        Constructor[] cons=c1.getDeclaredConstructors();
        for (Constructor con:cons) {
            System.out.println(con.getName()+"("+con.getParameterCount()+")");
        }
        //3 获取单个构造器
        Constructor con1=c1.getDeclaredConstructor();//获取无参构造器  私有也能拿到
        System.out.println(con1.getName()+"("+con1.getParameterCount()+")");

        Constructor con2=c1.getDeclaredConstructor(String.class,int.class);//String类型，int类型
        System.out.println(con2.getName()+"("+con2.getParameterCount()+")");

        /*
        获取类构造器的作用：依然是初始化对象返回
        Constructor提供的方法	                    说明
        T newInstance(Object... initargs)	    调用此构造器对象表示的构造器，并传入参数，完成对象的初始化并返回
        public void setAccessible(boolean flag)	设置为true，表示禁止检查访问控制（暴力反射）
         */
        //暴力反射
        con1.setAccessible(true);//临时攻破权限
        Dog d1=(Dog) con1.newInstance();
        System.out.println(d1);

        Dog d2=(Dog) con2.newInstance("小花", 5);
        System.out.println(d2);
    }

    @Test
    public void getFieldInfo() throws Exception{//获取成员变量信息
        //1 获取类对象
        Class c1=Dog.class;
        //2 获取成员变量对象
        Field[] fields=c1.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName()+"("+field.getType().getName()+")");
        }
        //3 获取单个成员变量
        Field f1=c1.getDeclaredField("hobby");
        System.out.println(f1.getName()+"("+f1.getType().getName()+")");
        /*
        获取到成员变量的作用：依然是赋值、取值。

        方法	                                    说明
        void set(Object obj, Object value)	    赋值
        Object get(Object obj)	                取值
        public void setAccessible(boolean flag)	设置为true，表示禁止检查访问控制（暴力反射）
         */
        Dog d=new Dog("泰迪",3);
        f1.setAccessible(true);
        f1.set(d,"社交");
        System.out.println(d);

        String hobby=(String) f1.get(d);
        System.out.println(hobby);
    }

    /*
    Method[] getMethods()	                                            获取类的全部成员方法（只能获取public修饰的）
    Method[] getDeclaredMethods()	                                    获取类的全部成员方法（只要存在就能拿到）
    Method getMethod(String name, Class<?>... parameterTypes)	        获取类的某个成员方法（只能获取public修饰的）
    Method getDeclaredMethod(String name, Class<?>... parameterTypes)	获取类的某个成员方法（只要存在就能拿到）
     */
    @Test
    public void getMethodInfo() throws Exception{//获取方法信息
        //1 获取类对象
        Class c1=Dog.class;
        //2 获取方法
        Method[] methods=c1.getDeclaredMethods();
        for(Method method:methods){
            System.out.println(method.getName()+"("+method.getParameterCount()+")");
        }
        //3 获取单个方法
        Method eat1=c1.getDeclaredMethod("eat");//获取的无参数的eat()
        Method eat2=c1.getDeclaredMethod("eat",String.class);//获取的有参数的eat()
        System.out.println(eat1.getName()+"("+eat1.getParameterCount()+")");
        System.out.println(eat2.getName()+"("+eat2.getParameterCount()+")");
        //4 获取方法的目的是调用方法
        /*
        成员方法的作用：依然是执行

        Method提供的方法	                                    说明
        public Object invoke(Object obj, Object... args)	触发某个对象的该方法执行。
        public void setAccessible(boolean flag)	            设置为true，表示禁止检查访问控制（暴力反射）
         */
        Dog dog=new Dog("旺财",10);
        eat1.setAccessible( true);
        Object obj1=eat1.invoke(dog);//dog.eat();
        System.out.println(obj1);//null

        Object obj2=eat2.invoke(dog, "骨头");
        System.out.println(obj2);//有参eat方法 吃吃吃骨头
    }
}
