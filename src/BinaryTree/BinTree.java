package BinaryTree;

public interface BinTree<E>{


boolean contains(E e);
E getMin();
E getMax();
    E removeMax();
    E removeMin();
boolean remove(E e);
int getSize();
//遍历
    //前序
    void preOrder();
    //中序
    void inOrder();
//后序
    void postOrder();
}
