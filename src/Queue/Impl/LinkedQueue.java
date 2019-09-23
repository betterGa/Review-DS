package Queue.Impl;

import Queue.MyQueue;

//基于链表的队列
public class LinkedQueue<E> implements MyQueue<E> {
    int size=0;
    class Node
    {E data;
    Node next;
    public Node()
    {}
    public Node(E e)
    {data=e;}
    }
private Node tail;

    //这里的tail和head作为私有属性即可，不需要new

        private Node head;

    @Override
    public void enQueue(E e) {
        Node newNode=new Node(e);
        size++;
      if(head==null) tail=head=newNode;
      else { tail.next = newNode;
          tail = newNode;
      }}

    @Override
    public E deQueue() {
        if(isEmpty())System.err.println("队列为空");
        E temp=head.data;
       head=head.next;
       size--;
       return temp;
    }

    @Override
    public E peek() {
if(isEmpty())
{ System.err.println("队列为空");}
        return head.data;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
     if(size==0) return true;
     else return false;
    }



}
