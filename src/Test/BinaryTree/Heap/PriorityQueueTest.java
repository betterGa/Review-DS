package BinaryTree.Heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueTest {

    PriorityQueue priorityQueue=new PriorityQueue();
    @Test
    public void test()
    {
        System.out.print(priorityQueue.isEmpty());
        priorityQueue.enQueue(28);
        priorityQueue.enQueue(16);
        priorityQueue.enQueue(22);
        priorityQueue.enQueue(13);
        priorityQueue.enQueue(19);
        priorityQueue.enQueue(15);
        priorityQueue.enQueue(17);
        for(int i=0;i<7;i++)
        { System.out.println(priorityQueue.deQueue());}
    }}


