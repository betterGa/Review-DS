import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

public class FunctionTest {

    //JDK1.5以后引入了三大常用新特性：泛型、枚举、注解。


    //尖括号中的"T"表示类型参数
    //如果一个类被<T>的形式定义，那么它被成为泛型类
    class TestGeneric<T> {
        T value1;
    }

    @Test
    public void test1()

    {
        TestGeneric<Integer> t1 = new TestGeneric<Integer>();
        t1.value1 = 8;
        System.out.println(t1.value1);
    }

    class TestGeneric2<T, E> {
        T t;
        E e;

        //这个不是泛型方法，只是泛型类中的普通方法
        public void MethodNotG(T t) {
            System.out.println(t);
        }

        //泛型方法，虽然重名，泛型方法以自己定义的类型参数为准
        public <T> T GenericMethod(T d) {
            return d;
        }
    }

    @Test
    public void test2() {
        TestGeneric2<Integer, java.lang.String> t2 = new TestGeneric2<Integer, java.lang.String>();
        t2.t = 8;
        t2.e = "ohh";
        Integer i = t2.GenericMethod(7);
        Assert.assertEquals(7, (int) i);
        t2.MethodNotG(1);
    }


//泛型类避免了classCastException问题。

    class Message<T> {
        private T message;

        public T getMessage() {
            return message;
        }

        public void setMessage(T message) {
            this.message = message;
        }
    }

    @Test
    public void test3() {
        //Message<java.lang.String> message=new Message<java.lang.String>();
        //将上一行的泛型改为Integer
        Message<Integer> message = new Message<>();


        // message.setMessage("ohh");
        //这里传入的也应是Integer
        message.setMessage(8);

        //而这里的fun不能接受Interger,只能接收String
        //   fun(message);
    }

    //主要是因为这里的参数设置的是String
    public static void fun(Message<java.lang.String> temp) {
        System.out.println(temp.getMessage());
    }


//需要能够接收所有的泛型类型，但是又不能够让用户随意修改。
//使用通配符"?"来处理

    @Test
    public void test4() {
        Message<Integer> message = new Message<>();
        message.setMessage(99);
        fun1(message);

    }

//上面的泛型类中的<T>的"T"规定是类的类型，而方法中的?可能需要与它一致，用"?"表示可以接收任意类型。


    //使用通配符"?",这样在fun1()方法中就可以接收各种类型的参数。
    public static void fun1(Message<?> temp) {
        System.out.println(temp.getMessage());
    }
//?extends 只能设置为其子类。
//?super  只能设置为其父类。

    //设置泛型上限
    class Message1<T extends Number> {
        private T message;

        public T getMessage() {
            return message;
        }

        public void setMessage(T message) {
            this.message = message;
        }


    }

    //设置泛型上限
    public static void fun2(Message<? extends Number> temp) {
        //设置泛型上限，不能用修改temp.setMessage(100);
        System.out.println(temp.getMessage());
    }

    //设置泛型下限
    public static void fun3(Message<? super java.lang.String> temp) {
        temp.setMessage("bit");
        System.out.println(temp.getMessage());
    }

    @Test
    public void test5() {
        Message<Integer> message = new Message<>();
        //设置泛型上限，可以修改
        message.setMessage(8);
        fun2(message);
    }

    @Test
    public void test6() {
        Message<java.lang.String> message = new Message<>();
        fun3(message);
    }

    @Test
    public void test7() {
        Integer a = 1000;
        Integer b = 1000;
        Integer c = 127;
        Integer d = 127;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    //定义泛型接口
    interface IMessage<T> {
        public void print(T t);
    }

    //子类有两种实现方法
    //1.继续使用泛型
    class MessageImpk<T> implements IMessage<T> {
        @Override
        public void print(T t) {
            System.out.println(t);
        }
    }

    //2.在子类实现接口明确给出具体类型
    class MessageImpl2 implements IMessage<String> {
        @Override
        public void print(String t) {
            System.out.println(t);
        }
    }


    //观察泛型擦除
    class MyClass<T> {
        private T message;

        public T getMessage() {
            return message;
        }

        public void setMessage(T message) {
            this.message = message;
        }

        public void tsstMessage(T t) {
            System.out.println(t);
        }
    }

    @Test
    public void tsst8() {
        MyClass<String> myClass1 = new MyClass<>();
        MyClass<Integer> myClass2 = new MyClass<>();
        System.out.println(myClass1.getClass() == myClass2.getClass());
    }
//运行结果为true。因为Myclass<String>和Myclass<Integer>在JVM中的Class都是Myclass.class

    class Myclass<T, E> {
        private T message;
        private E text;

        public T getMessage() {
            return message;
        }

        public void setMessage(T message) {
            this.message = message;
        }

        public E getText() {
            return text;
        }

        public void setText(E text) {
            this.text = text;
        }

        public void testMethod(T t) {
            System.out.println(t);
        }
    }

    @Test
    public void test9() {
        Myclass<String, Integer> myClass1 = new Myclass<>();
        Class cla = myClass1.getClass();
        Field[] fields = cla.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType());
        }

    }

    //运行结果为
    // class java.lang.Object
    //  class java.lang.Object
    //泛型类中的类型参数部分没有指定上限——<T>会被转译成普通的Object类型，而如果指定了上限，就会替换成类型上限。

    @Test
    public void test10()
    {
        System.out.println(Integer.MAX_VALUE);
    }
}


