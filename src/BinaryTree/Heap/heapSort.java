package BinaryTree.Heap;


//堆排列
public class heapSort {
    public void heapSort1(Integer[] arr)
    {//将数组调整成堆
        heap<Integer>heap1=new heap<>(arr);

        //接下来，从最后一个位置开始
        for(int i=arr.length-1;i>=0;i--)
        {arr[i]=heap1.extractMax(); }


    }


    //原地堆排序,不用额外空间
public static void heapSort2(Integer[] arr)
{int length=arr.length;
//从最后一个非叶子节点
    for(int i=(length-1-1)/2;i>=0;i--)
    {
        //调用siftDown，不使用额外空间，交换堆顶和最后一个元素
        //swap(0,i)
        //siftDown(i)
    }





}

public static void swap(Integer[]arr,int indexA,int indexB)
{int temp=arr[indexA];
arr[indexA]=arr[indexB];
arr[indexB]=temp;
}



    private static void siftDown(Integer[]arr,int n,int k)
    {//k时当前索引
        while (2*k+1<n)
        {int j=2*k+1;
        //取出左右孩子的最大值
        if(j+1<n)
        {
            if(arr[j].compareTo(arr[j+1])<0)
            {j++;}
        }
        }
    }
}
