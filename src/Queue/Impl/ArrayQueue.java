package Queue.Impl;

import Queue.MyQueue;

//基于数组的实现
//test OK!
public class ArrayQueue<E>implements MyQueue {
private Object[]data;
private int head;
private int tail;
public ArrayQueue(int size)
    {data=new Object[size];}
    public ArrayQueue()
    {}


    @Override
    public void enQueue(Object object) {
    if(tail==data.length) {
        if (head == 0)
        {System.out.println("队列已满");return;}
   //如果tail已到队尾，而head不在0，队未满，可以搬移，节约空间

        else
        {for(int i=head;i<tail;i++)
        {data[i-head]=data[i];}
tail=tail-head;
        head=0;
        }


    }




data[tail++]=object;
}

    @Override
    public Object deQueue() {
        if (isEmpty()) {
            System.err.println("当前队列为空");
            return null;}
            return data[head++];
        }

        @Override
        public Object peek(){
            if (isEmpty()) {
                System.err.println("当前队列为空");
                return null;}
                return data[head];
            }

            @Override
            public int getSize () {
                return tail - head;
            }

            @Override
            public boolean isEmpty () {
                return false;
            }
        }