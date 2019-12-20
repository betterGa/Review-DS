package Queue.LeetCode232;
import java.util.*;
//用栈实现队列
//类似于用队列实现栈，这里用到两个栈来实现队列。
// 比如“1，2，3，4”入队，执行出队操作，第一个出的应该是1，把元素按顺序入栈A，“1,2,3,4”，倒到栈B中，
// 栈是最先进的最后出，那么栈B中的是"4,3,2,1"这时出栈，即“1”出栈，
// 而如果再有元素入栈，应该保持原来的"1,2,3"顺序，所以，栈还需要颠倒一下顺序，即再倒到栈A中，栈A中顺序是"2，3，4"，
// （要是不这么颠倒，后续再出栈顺序都乱了）可以把之前的“1"先保存起来，然后让它在B中出栈，返回该保存值即可。
// peek（）操作也是同样道理，需要颠倒回原顺序。
// 也就是说，225 题用队列实现栈，每次是当把队列A除最后一个元素（相当于栈顶）外都入队B，让最后一个元素出队，下一次，重复如上操作即可。
// （因为每次队A都会剩下一个元素，等价于栈顶，所以不涉及原顺序问题）。
// 而本题是利用栈的先进后出特点，栈A的出栈到栈B中去，就可以通过出栈等价于出队操作，而下一次之前，需要再把栈B中元素依次入到栈A中，才能保持原顺序。
//




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
