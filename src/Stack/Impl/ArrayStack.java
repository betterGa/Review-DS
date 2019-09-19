//自己写的，test OK
package Stack.Impl;

import Stack.MyStack;

import java.util.ArrayList;
import java.util.List;

//基于数组的栈实现

//泛型接口的实现第一种，仍用泛型，到new时再明确具体类型。
public class ArrayStack<T> implements MyStack<T>{

    List list=new ArrayList();
    private int size=0;

    @Override
    public boolean push(T t) {
    list.add(t);
    size++;
    return true;
    }

    //返回的是Object还是T ？？？
    @Override
    public T pop() {
        T popp=(T)list.get(size-1);
        size--;
        return popp;
    }

    @Override
    public int getSize() {
        return list.size();
    }


    @Override
    public T peak() {
        return (T)list.get(size);
    }

    @Override
    public boolean isEmpty() {
  if(list.size()==0)return true;
  else return false;
    }
}
