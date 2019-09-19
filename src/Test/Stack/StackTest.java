package Stack;

import Stack.Impl.ArrayStack;
import Stack.Impl.ArrayStack1;
import Stack.Impl.LinkedStack;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class StackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new ArrayStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(2);
        System.out.println(myStack.getSize());
        if(!myStack.isEmpty()) myStack.pop();
        System.out.println(myStack.peak());
    }

    @Test
    public void test1()
    {
        MyStack<Integer> myStack1=new ArrayStack1(3);
        myStack1.push(1);
        myStack1.push(2);
        myStack1.push(3);
        System.out.println(myStack1.pop());
        System.out.println(myStack1.peak());
        System.out.println(myStack1.getSize());


    }

    @Test
    public void test2()
    {
        MyStack<Integer>myStack2=new LinkedStack<>();
        myStack2.push(1);
        myStack2.push(2);
        myStack2.push(3);
        System.out.println(myStack2.peak());
        System.out.println(myStack2.pop());
        System.out.println(myStack2.getSize());
    }
}