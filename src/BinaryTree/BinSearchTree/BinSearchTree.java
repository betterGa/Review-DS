package BinaryTree.BinSearchTree;

import BinaryTree.BinTree;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.omg.CORBA.PUBLIC_MEMBER;

//二叉搜索树
//只考虑无重复元素的情况

public class BinSearchTree<E extends Comparable>implements BinTree<E> {
class Node
{E data;
Node left;
Node right;

    public Node(E e)
    {data=e;}}


private Node root;
private int size;

public BinSearchTree()
{}
    @Override
    public void add(E e) {
if(root==null)
{ Node newNode=new Node(e);
    root=newNode;
size++;}

else {add(root,e);
}

    }

    //Test:OK!
    public void add(Node root,E e)
    {//递归调用需要先写终止条件
        if(e.compareTo(root.data)<0&&root.left==null)
        {Node node=new Node(e);
        root.left=node; }
        if(e.compareTo(root.data)>0&&root.right==null)
        {Node node=new Node(e);
            root.right=node;}
        if(e.compareTo(root.data)==0) return;

        if(e.compareTo(root.data)<0) add(root.left,e);
        if(e.compareTo(root.data)>0) add(root.right,e);
    }
    @Override
    public boolean contains(E e) {
        return contains(root,e);
    }

    public boolean contains(Node root,E e)
    {if(root!=null&&root.data.compareTo(e)==0) return true;
    else{
        if(root!=null&&e.compareTo(root.data)<0) {return contains(root.left,e);}
        if(root!=null&&e.compareTo(root.data)>0) {return contains(root.right,e);}
    }


    return false;
    }
    @Override
    public E getNin() {
        return null;
    }

    @Override
    public E getMax() {
        return null;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public E removeMin() {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void preOrder() {

    }

    @Override
    public void inOrder() {

    }

    @Override
    public void postOrder() {

    }
}
