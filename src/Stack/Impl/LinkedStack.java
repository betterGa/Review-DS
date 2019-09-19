//基于链表的栈。 test OK!
//需要定义节点类Node
package Stack.Impl;

import Stack.MyStack;

public class LinkedStack<T> implements MyStack<T> {


    class Node
    { T data;
        Node next;
    public Node(T data)
    { this.data=data; }
    }

Node head;
    int CurrentSize=0;
    @Override
    public boolean push(T t) {
        //先新建一个节点
        Node NewNode=new Node(t);
        head=NewNode;
        NewNode.next=null;
        head=NewNode;
        CurrentSize++;
    return true;
    }

    @Override
    public T pop() {
        Node current=head;
        head=current.next;
        CurrentSize--;
        return current.data;
    }

    @Override
    public int getSize() {
        return CurrentSize;
    }

    @Override
    public T peak() {
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        if(CurrentSize==0) return true;
        else return false;
    }
}
