//常数时间内获取栈的最小值。
//再整一个数据结构——栈。


//双栈解法。

package Stack.LeetCode155;
import sun.plugin.liveconnect.OriginNotAllowedException;

import java.util.Stack;

class MinStack {
   private Stack<Integer> OriginalSta;
   private Stack<Integer> Min;

    /** initialize your data structure here. */
    public MinStack() {
        OriginalSta=new Stack<>();
        Min=new Stack<>(); }

    public void push(int x) {


        //开始要把第一个元素放在Min中的。
/*
        if(x>=Min.peek()) return;
        else Min.push(x);
 */

//如果Min是空的话，放入
        //小于的话，放入
        if(Min.isEmpty()||x<=Min.peek()) {Min.push(x);}
        OriginalSta.push(x);
    }

    public void pop() {

        //注意这里是equals(),比较的是值是否相等。
if(OriginalSta.peek()==(Min.peek())) {Min.pop();}
        OriginalSta.pop();
    }

    public int top() {
return OriginalSta.peek();
    }

    public int getMin() {
return Min.peek();
    }
}

