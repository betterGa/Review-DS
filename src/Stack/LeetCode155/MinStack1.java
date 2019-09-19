package Stack.LeetCode155;

//单栈解法

import java.util.Stack;

public class MinStack1 {
    Stack<Integer> data;
    /** initialize your data structure here. */
    public MinStack1() {
        data=new Stack<>();
    }

    //进栈进两次。
    public void push(int x) {
        if(data.isEmpty())
        {data.push(x);
        data.push(x);}
        else {
            int min=data.peek();
            data.push(x);
            if(x<=min) data.push(x);
            else data.push(min); }
}


    public void pop() {
        if(!data.isEmpty())
        {data.pop();}
        if(!data.isEmpty())
        {data.pop();}
    }

    public int top() {
int temp=data.peek();
if(!data.isEmpty())
{data.pop();}
int save=data.peek();
data.push(temp);
    return save;
    }

    public int getMin() {
return data.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

