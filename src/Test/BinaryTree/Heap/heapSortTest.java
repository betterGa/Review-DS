package BinaryTree.Heap;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class heapSortTest {

    @Test
    //Okay!
    public void heapSort1Test() {
        heapSort heapSort2 = new heapSort();
        heap heap2=new heap();
      /*  int n = 10;
       Random random = new Random();
       int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = random.nextInt(10000);}
*/
      Object data[]=new Object[]{41,58,50,60,53,42,59,63,90,3,1};
            for(Object o:heap2.heapify(data))
                System.out.println(o + "、");
    }}
