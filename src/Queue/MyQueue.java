package Queue;

public interface MyQueue<E> {
    //入队，在队尾插入
   void enQueue(E e);

   //出队，返回队首元素
    E deQueue();

    //返回队首但不出队
    E peek();

    //队列长度
    int getSize();

        //是否为空
    boolean isEmpty();


}
