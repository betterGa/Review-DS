package BinaryTree.LeetCode94;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
 int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 //中序遍历 左根右
class Solution {
    List result=new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
if(root==null) return result;
inorderTraversal(root.left);
if(root!=null) result.add(root.val);
inorderTraversal(root.right);

return  result;
    }
}