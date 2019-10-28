package Queue.LeetCode622;

public class MyCircularQueue {
private int[]queue;
 private  int head=0;
   private int tail=0;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
queue=new int[k+1];
    //多开辟一块空间用来区分空和满
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
        {System.err.println("队已满");return false;}
        queue[tail]=value;
        tail=(tail+1)%queue.length;
        return true;}



        /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
if(isEmpty()) {System.err.println("栈已空，无法出栈");return false;}
    head=(head+1)%queue.length;
  return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
if(isEmpty())return -1;
else return queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
if(isEmpty()) return -1;
else return queue[(tail-1+queue.length)%queue.length];}

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
if(head%(queue.length-1)==tail)
    return true;
else return  false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
if((tail+1)%queue.length==head)return true;
else return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */