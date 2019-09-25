package Queue.LeetCode232;
import java.util.*;
//用栈实现队列
public class MyQueue {
Stack<Integer> stackA;
    Stack<Integer> stackB;

    /** Initialize your data structure here. */
    public MyQueue() {
stackA=new Stack<>();
stackB=new Stack<>();
    }

    /** Push element x to the back of queue. */
    //哪个不空去哪个
    public void push(int x) {
if(stackB.isEmpty()) stackA.push(x);
else stackB.push(x); }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
if(stackB.isEmpty())
{int size=stackA.size();
for(int i=0;i<size;i++)
{ stackB.push(stackA.pop());}
int pop=stackB.pop();
int size2=stackB.size();
for(int i=0;i<size2;i++)
{stackA.push(stackB.pop());}
return pop; }
else{
    int size=stackB.size();
    for(int i=0;i<size;i++)
    { stackA.push(stackB.pop());}
   int size1=stackA.size();
    int pop=stackA.pop();
    for(int i=0;i<size1;i++)
    {stackB.push(stackA.pop());}
    return pop;
}
    }

    /** Get the front element. */
    public int peek() {
        if(stackB.isEmpty())
        {int size=stackA.size();
            for(int i=0;i<size;i++)
            { stackB.push(stackA.pop());}
            int pop=stackB.peek();
            int size2=stackB.size();
            for(int i=0;i<size2;i++)
            {stackA.push(stackB.pop());}
            return pop; }
        else{
            int size=stackB.size();
            for(int i=0;i<size;i++)
            { stackA.push(stackB.pop());}
            int size1=stackA.size();
            int pop=stackA.peek();
            for(int i=0;i<size1;i++)
            {stackB.push(stackA.pop());}
            return pop;
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
if(stackA.isEmpty()&&stackB.isEmpty())
    return true;
else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
