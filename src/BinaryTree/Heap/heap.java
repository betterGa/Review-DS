package BinaryTree.Heap;

import java.util.Arrays;
import java.util.Comparator;

//基于数组实现的二叉堆
public class heap<E> {
private Comparator<E> comparator;
private int size;
private E[]elementData;
private static final int DEAUFLT_CAPACITY=10;

//该构造方法将任意数组调整成堆
public heap(E[] arr)
{
    elementData=(E[]) new Object[arr.length];
    for(int i=0;i<arr.length;i++)
    { elementData[i]=arr[i];}
        size=elementData.length;
    //从最后一个非叶子节点开始下沉
    for(int i=(arr.length-1-1)/2;i>=0;i--)
    {siftDown(i);}

}

public heap(){
    this(DEAUFLT_CAPACITY,null);
}

public heap(int initCapacity)
{this(initCapacity,null);
    //this.elementData=(E[])new Object[initCapacity]; }
}

public heap(int initCapacity,Comparator<E> comparator)
{this.elementData=(E[])new Object[initCapacity];
    this.comparator=comparator; }

    public int getSize()
    {return size;}

    public  boolean isEmpty()
    {return size==0;}

private int compare(E o1,E o2)
{if(comparator==null)
//此时o1，o2必须是Compareable的子类
{
    return ((Comparable<E>)o1).compareTo(o2);}
    return comparator.compare(o1,o2);
}

//取得左孩子下标
    private int leftChildIndex(int index)
    {return  index*2+1;}

    private int rightChildIndex(int index)
    {return index*2+2;}



    private int FatherIndex(int index)
    {if(index==0) throw new IllegalArgumentException("not have");
        return (index-1)/2;}

        //数组的扩容
        private void grow()
        {
            int oldCap=elementData.length;
            int newCap=oldCap+(oldCap<64?oldCap:oldCap>>1);
        if(newCap>Integer.MAX_VALUE-8)
            throw new IndexOutOfBoundsException("数组太大");
        elementData= Arrays.copyOf(elementData,newCap);
        }

    public void add(E e)

    {if(size==elementData.length)
    {grow();}
        elementData[size++]=e;
    siftUp(size-1);

    }

        public String toString()
        {
            StringBuilder res=new StringBuilder();
            for(E e:elementData)
            {if(e!=null) res.append(e+"、");}
            return res.toString();
        }

        private void siftUp(int index)
        {while (index>0&& compare(elementData[index],elementData[FatherIndex(index)])>0)
        { swap(index,FatherIndex(index));
        index=FatherIndex(index);}
        }

        private void swap(int indexA,int indexB)
        {E temp=elementData[indexA];
        elementData[indexA]=elementData[indexB];
        elementData[indexB]=temp;
        }

public E findMax()
{
    if(isEmpty())
        throw new IndexOutOfBoundsException("heap is empty.");
    return elementData[0];
}


        //可以取得大顶堆的最大值,并删除
    public E extractMax()
    {
        E result=findMax();
        swap(0,size-1);
        elementData[--size]=null;
        siftDown(0);
        return result;
    }
//将二叉树节点下沉到正确位置
private void siftDown(int index)
{
    while (leftChildIndex(index)<size)
    {//暂存当前节点左孩子下标
        int j=leftChildIndex(index);
        //判断左右孩子哪个大
        if(j+1<size)
        //此时有右孩子
        {
            if(compare(elementData[j],elementData[j+1])<0)
                //右孩子大
                j++;}
            //j指向右孩子索引下标,此时elementData[j]是左右孩子的最大值，就算不走这个分支
            if(compare(elementData[index],elementData[j])>0){break;}
            swap(index,j);
        index=j;
        }
    }

    //用新元素替换堆顶元素。返回替换前的堆顶元素,
    // 方法一：可以先用extrcatMax()把堆顶元素删除，再用add()添加。
    // 方法二：直接把堆顶元素替换成新元素，然后调用下沉。
    public E replace(E newValue)
    {//方法二
E result=findMax();
elementData[0]=newValue;
siftDown(0);
return result;
    }


//将任意数组变成堆，方法：叶子节点没有子树，就相当于已经是堆了，不需要移动。
//可以从最后一个非叶子节点开始siftDown



}









