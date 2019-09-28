package BinaryTree.LeetCode572;
//树s是否包含树t
//在LeetCode100 是否为相同的子树的基础上递归实现。
// 检查s种是否包含子树t，首先，如果s为null，一定返回false.如果s不为null，且根节点s与根节点t的值相等，那么可以检查s和t是否为相同的树，
// 设置一个布尔类型的值result,若根节点s和根节点t表示的树是相同的，那么result被改为true,而如果这时result仍为false,说明根是不同的，
// 遍历s的左子树、右子树，返回值为左、右的并集（有真：是相同的树即为真，两个都假才为假。


import sun.reflect.generics.tree.Tree;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }}



class Solution {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean judge=false;
        if(s!=null)
        {if(s.val==t.val) judge=isSame(s,t);
        if(!judge) judge=isSubtree(s.left,t)||isSubtree(s.right,t);
         }
return judge;
    }

    public boolean isSame(TreeNode s,TreeNode t)
    {if(s==null&&t==null) return true;
    if(s==null||t==null) return false;
    if(s.val!=t.val) return false;
    return isSame(s.left,t.left)&&isSame(s.right,t.right);
        }
}
