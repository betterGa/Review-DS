package Stack.LeetCode225;

import java.util.*;

//用队列模拟栈
// https://leetcode-cn.com/problems/implement-stack-using-queues/
//   java实现，已通过。执行用时 :70 ms，内存消耗 :33.8 MB。
//  用队列实现栈，需要两个队列。
// 考虑到栈与队列的差异，栈的出栈操作是最后进的先出，
// 以用例为例，"1,2,3"，先入队A，如果执行出栈操作，是“3”先出，而队列的出队是队头“1”先出，
// 可以先把除了“3”以外的元素“1”，“2”依次入队B，那么这时队A中就只剩下“3”,让它出队即可。
// 而需要注意的是，如果是栈的peek操作，“3”只是取得它的值并返回，本身没有出栈的，可以先用int peek保存值，然后让它出队A，再通过add()方法让它入队B，返回peek即可完成栈的peek操作，
// 而这时队A的元素为"1""2""3"。
//两个栈始终有一个栈是空的，
// 所以在栈的push()操作中，如果队A为空，元素放入队B即可，哪个队不为空放入哪个队。
// 两个栈就是倒来倒去换着盛放数据，以剩下最后一个来取得“栈”的栈顶。

public class MyStack {

    Queue<Integer> queueA;
    Queue<Integer> queueB;

    /** Initialize your data structure here. */
    public MyStack() {
queueA=new LinkedList<>();
queueB=new LinkedList<>();
}

/** Push element x onto stack. */
    public void push(int x) {
       if(queueB.isEmpty()&&queueA.isEmpty()) queueA.add(x);
        else {if(!queueB.isEmpty())
            queueB.add(x);
        else queueA.add(x);}
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
if(queueB.isEmpty())
{int size=queueA.size();
    for(int i=0;i<size-1;i++)
{queueB.add(queueA.poll());}
   return queueA.poll();}
else {int size=queueB.size();
    for(int i=0;i<size-1;i++)
{queueA.add(queueB.poll());}
    return queueB.poll();}
}

    /** Get the top element. */
    public int top() {
        if (queueB.isEmpty())
        {//易错！！！如果写成这样，这个size每次就在变化了。
           //for(int i=0;i<queueA.size()-1;i++)
            int size=queueA.size();
            for(int i=0;i<size-1;i++)
            {queueB.add(queueA.poll());}
            int result=queueA.poll();
            queueB.add(result);
            return result;
        }
else
        {   int size=queueB.size();
            for(int i=0;i<size-1;i++)
        {queueA.add(queueB.poll());}
            int result=queueB.poll();
            queueA.add(result);
            return result;} }



    /** Returns whether the stack is empty. */
    public boolean empty() {
if(queueA.isEmpty()&&queueB.isEmpty()) return true;
else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */