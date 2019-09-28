package BinaryTree.BinSearchTree.LeetCode144;

//先序遍历
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
if(root!=null)
{  result.add(root.val);}
if(root==null) return result;
preorderTraversal(root.left);
preorderTraversal(root.right);

return result;
    }
}



