package BinaryTree.LeetCode236;

import java.util.*;

public class TreeNode {
  int val;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }

    TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
//递归大法好。
    public TreeNode  lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode leftResult = lowestCommonAncestor(root.left, p, q);
        TreeNode rightResult = lowestCommonAncestor(root.right, p, q);

        if (leftResult == null && rightResult == null) return null;
        else if (leftResult != null && rightResult == null) return leftResult;
        else if (rightResult != null && leftResult == null) return rightResult;
        else return root;
    }}














        /*憨死了，Map不允许Key值重复，那么每对父与子都需要新建Map，然后放到一个List里，通过遍历List时，又无法直接取到那个Map的Key
        ,Value,而且父 子的key value对应关系是确定的，很难取得某一个节点的祖先

List Ancestor=new ArrayList();
//通过getFather方法可使Ancestor这个List集合存的是整棵树所有的父与子Map。
    getFather(Ancestor,root);
//接下来需要遍历这个Ancestor的每一个成员，通过p，q获得它们的key即父亲节点，将父亲节点集中起来。
        List pFather=new ArrayList();
        List qFather=new ArrayList();

        ListIterator listIterator=Ancestor.listIterator();

*/



/*
public static void getFather(List result,TreeNode node)
//将父与子节点以key-value形式存储，从根遍历到叶子节点上一层
{//if(node==null) return;

    if (node != null) {
        if (node.left != null) {
            Map pMap1 = new HashMap();
            pMap1.put(node, node.left);
            result.add(pMap1);
        }

        if (node.right != null) {
            Map pMap2 = new HashMap();
            pMap2.put(node, node.right);
        result.add(pMap2);}

    getFather(result,node.left);
    getFather(result,node.right);
}
}



    }

*/




