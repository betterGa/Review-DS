package BinaryTree.Heap;


//堆排列
//跟着录屏敲的
/*
public class heapSort {
    public void heapSort1(Integer[] arr)
    {//将数组调整成堆
       // heap<Integer>heap1=new heap<Integer>(arr);

        //接下来，从最后一个位置开始
       // for(int i=arr.length-1;i>=0;i--)
        //{arr[i]=heap1.extractMax(); }
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
*/


//自己写一遍 堆排序
public class heapSort
{
    //方法一：先把数组变成堆.再调用extractMax方法，逆序存储堆顶元素，即从小到大排序

    public Object[] heapSort1(Object[] disorderly)
    { heap heap4=new heap(disorderly);
        Object[]orderly=new Object[disorderly.length];
        int length=heap4.getSize();
        for(int i=length-1;i>=0;i--)
        { orderly[i]=heap4.extractMax();}
        return orderly; }

        //方法二：原地堆排序。
    //首先，将数组变成堆，不使用heap类中的data数组，在原数组基础上交换元素，
    // 先原地变成堆
    //然后每次将堆顶——即最大值和数组最后的元素交换
    //除堆顶外其他子树仍是堆结构
    //再将根siftDown
    //次数为数组的length
    //简便起见，不像heap的构造器中传入了比较器，这里的类型为int
    public int[] heapSort3(int[] disordly)
    {//最后一个非叶子节点
        int i=getFather(disordly.length-1);
        for(int j=i;j>=0;j--)
        {siftDown2(disordly,j);}
return disordly;
    }

    private void siftDown2(int[] data,int index)
    {
if(data[index]<data[getMaxChild(data,index)])  swap2(data,index,getMaxChild(data,index));
    }

    private void swap2(int[]data,int index1,int index2)
    { int temp=data[index1];
        data[index1]=data[index2];
        data[index2]=temp; }

    private int getFather(int index)
    {return (index-1)/2;}

    private int getLeft(int index)
    {return index*2+1;}

    private int getRight(int index)
    {return index*2+2;}

    private int getMaxChild(int[]data,int index1)
    {if(getRight(index1)==data.length) return getLeft(index1);
        if(data[getLeft(index1)]>data[getRight(index1)])
            return getLeft(index1);
        else return getRight(index1);
    }

}
