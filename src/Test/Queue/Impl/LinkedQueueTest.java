package Queue.Impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedQueueTest {

    ArrayQueue<Integer> q=new ArrayQueue(4);

    @Test
   public void test1()
    {
    q.enQueue(1);
    q.enQueue(2);
    q.enQueue(3);
    System.out.println(q.getSize());
q.deQueue();
System.out.println(q.getSize());
System.out.println(q.peek());
q.enQueue(2);
q.enQueue(2);
    }}