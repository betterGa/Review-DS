package BinaryTree.BinSearchTree.LeetCode144;

//先序遍历,最自然的访问方式，用来输出二叉树。
import java.util.ArrayList;
import java.util.List;

public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

class Solution {
    List<Integer> result=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
if(root==null) return result;
if(root!=null) result.add(root.val);
preorderTraversal(root.left);
 preorderTraversal(root.right);


return result;
    }
}



