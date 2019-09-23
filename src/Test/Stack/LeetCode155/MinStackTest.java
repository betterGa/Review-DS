package Stack.LeetCode155;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {
MinStack1 minStack=new MinStack1();

@Test
   public void test1()
{
    minStack.push(512);
    minStack.push(-1024);
    minStack.push(-1024);
    minStack.push(512);

    minStack.pop();
System.out.println(minStack.getMin());
    minStack.pop();
    System.out.println(minStack.getMin());
    minStack.pop();
  System.out.println(minStack.getMin());
}}