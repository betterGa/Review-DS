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

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private Node root;
private int size;

/*
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

  */
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



    //再写一遍add()方法
/*
    @Override
    public void add(E e)
    {if(root==null)
    {Node newNode=new Node(e);
    root=newNode; }
    else add(root,e);}
public void add(Node root,E e)
{
    if(e.compareTo(root.data)>0&&root.right==null)
    {Node newNode=new Node(e);
    root.right=newNode;}
if(e.compareTo(root.data)<0&&root.left==null)   {Node newNode=new Node(e);
    root.left=newNode;}
if(e.compareTo(root.data)==0)return;

if(e.compareTo(root.data)>0) add(root.right,e);
if(e.compareTo(root.data)<0) add(root.left,e);
}
*/
//以上的递归不够彻底，优化：
    //使add方法返回E类型

    public Node add(E e)
    {
       root=add(root,e);
       size++;
       return root;
    }


public Node add(Node root,E e)
{
    if(root==null)
    {Node newNode=new Node(e);
    return newNode;}

    if(e.compareTo(root.data)>0) root.right=add(root.right,e);
    if(e.compareTo(root.data)<0) root.left=add(root.left,e);

    return root;

}


//获取二分搜索树BST的最小值，是沿着左子树往左走到最左为止（不一定是叶子节点。）
    @Override
    public E getMin() {
        if(root==null) return null;
        else{Node node=getMin(root);
        return node.data;}
    }

    public Node getMin(Node node)
    {if(node.left==null) return node;
    return getMin(node.left);
    }


//获取二叉搜索树BST的最大值的方法：沿着右子树向右走走到最右。

    @Override
    public E getMax() {
        if(root==null) return null;
        else { Node maxNode=getMax(root);
        return maxNode.data;}
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public E removeMin() {
        E save=getMin();
        root=removeMinNode(root);
        return save;
    }

    public Node getMax(Node node)
    {if(node.right==null) return node;
    return getMax(node.right);
    }

    //删除传入二叉树的最小值节点,返回删除后二叉树的根节点
    public Node removeMinNode(Node root)
    {  if (root.left == null)
    { Node rightNode = root.right;
        root.right = null;
        size--;
        return rightNode; }
    root.left=removeMinNode(root.left);
    return root;
    /*要用递归：
    Node rightNode=root.left.right;
    root.left.right=null;
    root.left=rightNode;
    size--;
    return root;*/
    }




    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int getSize() {
        return size;
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
