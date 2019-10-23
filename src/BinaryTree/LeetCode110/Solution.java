package BinaryTree.LeetCode110;



class TreeNode {
  int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    public boolean isBalanced(TreeNode root) {
    /*超出时间限制
        boolean result=true;
        if(root==null) result=true;
        else if(root.right==null||root.left==null) result=true;
        else  if(height(root.right)-height(root.left)>1||height(root.left)-height(root.right)>1)
            result=false;
        while (root.left!=null&&root.right!=null)
        { result=isBalanced(root.left);
            result=isBalanced(root.right); }



        return result;
    }

    */

        //第一版，不优化
        //递归注意终止条件
        //直到叶子节点，一定是平衡树


        /* if(root==null) return true;
        if(isBalanced(root.left)&&isBalanced(root.right)==true) return true;
        if(Math.abs(height(root.right)-height(root.left))<=1) return true;
        else return false;*/


//问题出在，进不到后面的Math.abs中去。
        //怎么既能进到isBalanced(root.left)&&isBalanced(root.right)==true
        //又能进到height中呢？——用&&


        if (root == null) return true;
        if ((isBalanced(root.left) == true) && (isBalanced(root.right) == true)
                && (Math.abs(height(root.right) - height(root.left)) <= 1)) return true;
        else  return false;
    }




    //   return (root==null)||(isBalanced(root.left)&&isBalanced(root.right)
        //    &&(Math.abs(height(root.left)-height(root.right))<=1));



    public int height(TreeNode root)
    { if(root==null) return 0;
//递归，计算该节点高度
        //根节点高度为1
        if(root.left==null&&root.right==null)
        { return 1; }
        else return Math.max(height(root.left),height(root.right))+1;
    }

}