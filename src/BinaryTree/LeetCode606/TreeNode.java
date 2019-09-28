//根据二叉树构建字符串
//Java实现执行用时 :11 ms,内存消耗 :40.9 MB
// 本题是二叉树的先序遍历，递归调用，先new一个结果字符串result，
// 首先，传入的是根节点，（当该节点不为null时）需要它的值，
// 如果传入的是左子树，这时的result需要在原字符串的基础上。需要先加“(”，再取它的值，（递归调用该函数即可）然后加上")",
// 如果传入的是右子树同理。需要先加"(",再取它的值，然后加上")",
// 特殊的情况是传入的节点只有右节点而无左节点，可以看作传入的是左子树，只不过左子树为null，那么此时应返回空字符串，
// 因此，在递归的边界语句中需要协商:if(t==null) return " "; 这时就在原结果字符串的基础上加上了"()",
// 接下来，会去判断右子树是否为空，若不为空，会在结果字符串上加"(右子树的值)"。
// 因此，传入左子树的条件应为1.第一种，当左子树不为空时(if(t.left!=null))
//                           2.第二种，当左子树为空，但右子树不为空时，即if(t.left!=null || t,right!=null)

        package BinaryTree.LeetCode606;

public class TreeNode {
      int val;

    public void setVal(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

static class Solution {
          String result=new String();
    public String tree2str(TreeNode t) {
if(t!=null) result=""+t.val+"";
if(t==null) return "";

        if(t.left!=null||t.right!=null) {result=result+"("+tree2str(t.left)+")";}
if(t.right!=null)                { result=result+"("+tree2str(t.right)+")";}

return result;

    }
}}
