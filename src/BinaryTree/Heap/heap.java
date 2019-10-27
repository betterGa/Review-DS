package BinaryTree.Heap;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
/*跟着录屏敲的
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
*/



//代码自己写一遍
//堆一般用完全二叉树实现。
//完全二叉树可以使用数组存储

/*
public class heap<E>
{
    private E[] data;
    private static int DEFULTSIZE=10;
    private int size;
    //

    public heap()
    {this(DEFULTSIZE);}

    public heap(int initSize)
    {
        data=new E[initSize];
        TreeMap
    }


    //数组存储，如果存储不够需要扩容。
    public void enlargeCap() {
        int oldCapcity = size;
        int newCapcity = oldCapcity + (oldCapcity < 64 ? oldCapcity >> 1 : oldCapcity);
        //如果数组的长度大于等于容量，说明需要扩容
        if (oldCapcity <= data.length) {
            size = newCapcity;
            Arrays.copyOf(data, size);
        }
    }


    //sift 元素
    //删除堆顶并返回堆顶值，即整个二叉树的最大值——根一定是最大的
    public void deleteMax()
    {//先找到最后一个非叶子的节点,先时size-1找到最后一个叶子节点，
        // 再通过节点数-1/2找到它的父亲节点
int j=(size-1-1)/2;
int i;
swap(j,0);

if(j*2+1<size&&j*2+2<size)
//这时看非叶子节点，如果有左右孩子，需要将值大的子树链给原来的根
        {  i=getMax(j*2+1,j*2+2);}
        //如果不是既有左孩子又有右孩子，那一定是只有左孩子了。
        else {i=j*2+1;}
data[j]=data[i];
//相当于删除了原来的根
size--;
    //接下来，需要保持堆的特性
        //从根开始，将它的子树中最大的与之交换
        //直到换到叶子节点
        for(int m=0;m<j;m++)
        { siftDown(m); }
    }

    //siftDown操作，传入根节点的下标，与它的子树比较，与它的子树的最大值交换
    public void siftDown(int index)
    {
        int max=getMax(index*2+1,index*2+2);
        swap(max,index);
    }


    //传入两个节点，比较大小
    public int getMax(int index1,int index2)
    {
  if((int)data[index1]>=(int)data[index2]) return index1;
        else return index2;
    }



    //传入数组下标，交换
    public void swap(int index1,int index2)
    {E temp=data[index1];
    data[index1]=data[index2];
    data[index2]=temp;
    }

    //向堆中添加元素
    public void add(E e)
    {//先扩容

        enlargeCap();
        //把要添加的元素先加到数组末尾
        data[size++]=e;
        //与它的父亲节点比较，不断上浮siftUp，直到根为止
    }

public siftUp(int index)
{

}
}
*/


public class heap<E> {
    private int size;
    private static int DEFAULTSIZE = 6;
    private Object[] data;
    private Comparator<E> comparator;

    public Object[] getData() {
        return data;
    }

    public heap() {
        this(DEFAULTSIZE, null);
    }

    public heap(int initSize) {
        this(initSize, null);
    }

    public heap(int initSize, Comparator comparator) {
        data = new Object[initSize];
        this.comparator = comparator;
    }

    //将任意数组变成堆
    //调用add方法
    public heap(Object[] disorderly) {
        data = disorderly;
        heapify(disorderly);
    }


    private void grow() {
        int oldSize = data.length;
        int newSize = oldSize + (oldSize < 64 ? oldSize >> 1 : oldSize);
        data = Arrays.copyOf(data, newSize);
    }

    public int Compare(E e1, E e2) {
        //如果这个堆在构造时并没有传入外部比较器，
        // 而堆是完全二叉树，应当是具有可比较性的，说明它是具有内部比较器的。
        //即覆写过CompareTo方法
        //可以把泛型类强转为Comparable
        if (comparator == null) {
            return ((Comparable<E>) e1).compareTo(e2);
        } else return comparator.compare(e1, e2);
    }


    private int getLeftIndex(int index) {
        return index * 2 + 1;
    }

    private int getRightIndex(int index) {
        return index * 2 + 2;
    }

    private int getFatherIndex(int index) {
        return (index - 1) / 2;
    }

    public int getSize() {
        return size;
    }

    //向堆中添加元素
    public void add(E e) {
        //可能需要扩容
        grow();
        //首先把元素加到数组的末尾
        data[size++] = e;
        //与父节点比较，如果大于父节点，将它与父节点交换，siftUp上浮操作

        //直到交换到为根或者当前节点已经大于
        int j = size - 1;
        while (j != 0) {
            siftUp(j);
            j = getFatherIndex(j);
        }
    }


    private void siftUp(int index) {//如果当前节点大于父亲节点，需要互换


        if (Compare((E) data[index], (E) data[getFatherIndex(index)]) > 0) {
            swap(index, getFatherIndex(index));
        }
    }

    private void swap(int index1, int index2) {
        E temp = (E) data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

















 //取得并删除堆的最大值，即顶
public E extractMax()
{E max=(E)data[0];
//先将顶与最后一个叶子节点交换值
    swap(size-1,0);
    //注意！！！这里因为把堆顶扔到了数组的最后，
    // 如果此时数的叶子是左叶子，就会与堆顶构成一对子树，然后根会和这对子树的最大值互换......
data[size-1]=0;

//让顶下沉，直到它所在的根可以看成堆或者沉到叶子节点
    //连左孩子都没有的一定是叶子节点
    int LastNLeaf=getFatherIndex(data.length-1);
   for(int i=0;i<=LastNLeaf  ;i++)
       siftDown(i);
return max;
}


//将当前节点下沉到正确位置
private void siftDown(int index) {
    //10.21   修改：
    //int temp=size+1;
    while (getLeftIndex(index) < data.length) {
       if(Compare((E) data[getMax(getLeftIndex(index), getRightIndex(index))], (E) data[index]) > 0)
        { int change=getMax(getLeftIndex(index),getRightIndex(index));
           // temp = getMax(getLeftIndex(index), getRightIndex(index));
            swap(getMax(getLeftIndex(index), getRightIndex(index)), index);
            index=change;}
            else break;
    }
    }



    /*if(Compare((E)data[getMax(getLeftIndex(index),getRightIndex(index))],(E)data[index])>0)
    { int temp=getMax(getLeftIndex(index),getRightIndex(index));
        swap(getMax(getLeftIndex(index),getRightIndex(index)),index);
    return temp;}
    else return size+1;*/


private int getMax(int index1,int index2)
{

    //注意！！！   需要考虑如果传进来的值为null怎么办
    //堆是完全二叉树，只可能出现右子树为null的情况
    if(data[index2]==null)
        return index1;

    if(Compare((E)data[index1],(E)data[index2])>0)
    {return index1;}
    else return index2;
}


//将堆顶元素替换为新元素
    //方法一：
    //直接将新元素赋给data[0]，然后堆顶siftDown
public void replace1(E e)
{ data[0] = e;
    int i = 0;
    //直到换到叶子节点为止
    while (getLeftIndex(i) <= size) {

        int max=getMax(getLeftIndex(i),getRightIndex(i));
        if(Compare((E)data[i],(E)data[max])>0) break;
        if (max== getLeftIndex(i))
            i = getLeftIndex(i);
        else i = getRightIndex(i);
        siftDown(i); }
}

//方法二：先调用extractMax删除堆顶元素，再将替换的元素加到末尾，使用siftUp
    //(远比方法一麻烦，不想写)



    //将任意数组调整成堆
    //方法一，挨个add（）
    public Object[] heapify(Object[] disordlydata)
    {
       for(int i=0;i<disordlydata.length;i++)
       { add((E)disordlydata[i]); }
       return data;
    }

    public Object[] heapify2(Object[] disorderly)
    {/*System.out.print(data.length);
    while (data.length<=disorderly.length)
    {grow();}*/
           /* data=new Object[disorderly.length+1];
        for(int i=0;i<disorderly.length;i++)
        { data[i]=disorderly[i];}
*/

        //错错错了。


       //方法二：从最后一个非叶子开始，siftDown保证它为根的二叉树为堆
        //由于叶子节点已经是天然的堆了。
        //这样每次只对三个节点操作，直到根为止
        //如果要采用siftUp,一边上浮着，可能还会与叶子节点交换，就又要下沉，复杂度太高
       /* int lastNotL=getFatherIndex(data.length-1);
        if(getRightIndex(lastNotL)==disorderly.length)
        { data[disorderly.length]=null; }
        int i=lastNotL;
      //  System.out.println(":i"+i);
        while (i>0)
        {siftDown(i);
       // i=getFatherIndex(i);
            //错了，不是找父亲节点，是每一个节点，直到根
        i=i-1;
        }
        siftDown(0);*/

       //改：10.21
        data=new Object[disorderly.length+1];
        for(int i=0;i<disorderly.length;i++)
            data[i]=disorderly[i];

        int lastNLeaf=getFatherIndex(data.length-1);
       for(int i=lastNLeaf;i>=0;i--)
       {siftDown(i);}
        return data;
    }
}









 



