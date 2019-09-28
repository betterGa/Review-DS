package BinaryTree.LeetCode100;
//检查两棵树是否相同。
//递归调用，如果当前两个节点的值不相等，一定是不同的树。
       // 如果当前节点一个为null.一个不为null,那么也一定是不同的树，
// 其他情况下均不改变两棵树是不同的的事实。接下来递归调用，去比较两个树的当前节点的左子树、右子树即可。

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; } }

class Solution {
      boolean judge=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
if(p==null&&q==null)return true;
if(p!=null&&q!=null)
{if(p.val!=q.val) return false;
   judge= isSameTree(p.left,q.left);
    judge=isSameTree(p.right,p.right);}

    return judge;
    }
}