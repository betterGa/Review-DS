package BinaryTree;

public interface BinTree<E>{
void add(E e);
boolean contains(E e);
E getNin();
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
