package Queue.LeetCode622;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircularQueueTest {
MyCircularQueue q=new MyCircularQueue(3);
@Test
    public void test()
{q.enQueue(1);
q.enQueue(2);
q.enQueue(3);
q.enQueue(4);

System.out.println(q.Rear());

System.out.println(q.isFull());

q.deQueue();

q.enQueue(4);

System.out.println(q.Rear());}
}