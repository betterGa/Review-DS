package BinaryTree.Heap;

import java.util.Arrays;
import java.util.Comparator;

//基于数组实现的二叉堆
public class heap<E> {
private Comparator<E> comparator;
private int size;
private E[]elementData;
private static final int DEAUFLT_CAPACITY=10;

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

    private int getSize()
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
    }





