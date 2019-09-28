package BinaryTree.LeetCode104;

public class TreeNode {
  int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    int size=0;
    //传入根节点，返回二叉树的最大深度
    public int maxDepth(TreeNode root) {
        //如果传入的根节点为空，深度为空。
   if(root==null) return 0;
   //二叉数的最大深度是左右子树两个最大深度值中的最大值再＋1（因为根节点的深度为1）。
    return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }
}