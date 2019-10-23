package BinaryTree.LeetCode101;

public class Solution {




    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

        public boolean isSymmetric(TreeNode root) {
        /*太憨了 不是这样的。
        //递归终止条件
            //空树或叶子节点是对称树
if(root==null||(root.left==null&&root.right==null))
             return true;

if(isSymmetric(root.left)==true&&isSymmetric(root.right)==true&&root.left.val==root.right.val)
    return true;

else if(root.left.left.val==root.right.right.val&&root.left.right.val==root.right.left.val)
    return true;
return false;
*/


        if(root==null) return true;
       else return isSymmetric(root.left,root.right);

    }

    //递归三部曲：返回值是boolean，传入的参数是左右子树，
    // 我们可以得到左右子树和它们的父节点。三个节点。
    //如何判断这颗二叉树是否对称二叉树？
    //如果左右子树任意一个为null，一定不是。
    //如果左右子树值不相等，一定不是。
    //可以得到的返回值是左右子树为根的两棵树是否对称二叉树
    //如果左右子树都是对称二叉树，那么这棵树一定是对称二叉树。
    //但是如果左右子树不都是/都不是对称二叉树，这颗树也可能是对称二叉树的。
    //我们传入的是左右子树，得到的是三个节点。
    //如果左右子树值已经相等了，那么如果左的左与右的右，和这个“相等的左右子树值”，构成了三个节点。
    //同理，左的右与右的左，和这个“相等的左右子树值”，也构成了三个节点。
    //如果这两组三个节点都满足对称，这棵树才是对称树。


public boolean isSymmetric(TreeNode left,TreeNode right)
{
    if(left==null||right==null) return false;
    else if(left.val!=right.val) return false;
     return isSymmetric(left.right,right.left)&&isSymmetric(right.right,left.left);
}
}
