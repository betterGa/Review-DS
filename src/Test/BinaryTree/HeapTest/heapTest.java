package BinaryTree.HeapTest;

import BinaryTree.Heap.heap;
import org.junit.Test;

public class heapTest {
    @Test
            public void testHeap()
    {
int[] data=new int[]{41,62,30,28,16,22,13,19,17,15};
int[] nums=new int[data.length];
heap<Integer> heap1=new heap<>();
        for(int i:data)
            heap1.add(i);

        heap1.replace1(100);

for(int i=heap1.getSize()-1;i>=0;i--)
{
    nums[i]=heap1.extractMax();}
for(int i:nums)
{System.out.print(i+"、");}
/*for(int i:data)
    heap1.add(i);
heap1.add(56);
heap1.extractMax();
System.out.println(heap1);
*/
}

@Test
    public void testReplace()
{
    /*heap<Integer> heap2=new heap<>();
int[] nums=new int[]{62,41,30,28,16,22,13,19,17,15};
for(int i:nums)
{heap2.add(i);}
System.out.println(heap2.replace(25));
System.out.println(heap2.findMax());
*/


}

@Test
//Okay!
    public void testConstractor()
{
    /*
    Integer[]nums=new Integer[]{62,41,30,28,16,22,13,19,17,15};
    heap<Integer> heap3=new heap<Integer>(nums);
    System.out.println(heap3);
*/

}

@Test
    public void HeapifyTest()
{//41,58,50,60,53,42,59,63
    //28,16,22,13,19,15,17,41,30,62
    Integer[]data=new Integer[]{28,16,22,13,19,15,17,41,30,62};
    heap<Integer> heap2=new heap();
    Object[]result= heap2.heapify2(data);
    for(Object o:result)
    {if(o!=null)
        System.out.print(o+"、");
    }
    System.out.println();
    System.out.println(heap2.getSize());

   /* for(int i=0;i<10;i++)
    System.out.print(heap2.extra
    ctMax()+"、");
    */

   int size=heap2.getSize();
   Integer[]fromMaxToMin=new Integer[heap2.getSize()];
              for(int i=0;i<size;i++)
              {fromMaxToMin[i]=heap2.extractMax();}
              for (Object o:fromMaxToMin)
              System.out.print(o+"、");


}}
