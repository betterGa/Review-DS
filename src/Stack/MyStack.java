package Stack;

//顺序栈和链式栈都要用到Stack接口

public interface MyStack<T> {


    //入栈：push,返回布尔值，插入成功与否
    //出栈：pop,返回泛型T
    //返回栈顶元素，但是不出栈：peak,返回泛型T
    //返回栈的当前元素个数
    //返回栈是否为空 isEmpty()

boolean push(T t);
T pop();
int getSize();
T peak();
boolean isEmpty();

}
