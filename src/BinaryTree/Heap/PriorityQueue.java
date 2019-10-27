
package BinaryTree.Heap;

//优先级队列
//只放整数
public class PriorityQueue<E> {
    heap heap5=new heap();
    //入队
    public void enQueue(int element)
    { heap5.add(element);
    }
    //出队并删除队头，优先级高的先出队
    public int deQueue()
    {return  0;}
        //return (Integer) heap5.extractMax2(); }

    //获取队头元素，不出队
    public int Peek()
    { Object[]data1=heap5.getData();
        return (Integer) data1[0]; }

    public boolean isEmpty()
    { if(heap5.getData().length==0) return true;
        return false; }

}
