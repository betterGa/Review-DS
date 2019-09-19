package Stack.Impl;


import Stack.MyStack;

import java.util.ArrayList;

//关键词：数组

//test OK!
public class ArrayStack1<T> implements MyStack<T> {

    //数组，是静态的，会有MaxSize
    private int MaxSize;
private Object[] data;
private int CurrentSize=0;

    //构造方法，初始化MaxSize和data数组
    public ArrayStack1(int MaxSize)
    { this.MaxSize=MaxSize;
        data=new Object[MaxSize]; }


    @Override
    public boolean push(T t) {
      if(CurrentSize<MaxSize)
      {data[CurrentSize]=t;
        CurrentSize++;
    return true;}
    else{ System.err.println("栈已满，无法添加");return false;}
    }

    @Override
    public T pop() {
        Object temp=data[CurrentSize-1];
        CurrentSize--;
        return (T)temp;
    }

    @Override
    public int getSize() {
        return CurrentSize;
    }

    @Override
    public T peak() {
        return (T)data[CurrentSize-1];
    }

    @Override
    public boolean isEmpty() {
        if(CurrentSize==0)return true;
        else return false;
    }
}
