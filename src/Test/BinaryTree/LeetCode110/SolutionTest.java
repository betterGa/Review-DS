package BinaryTree.LeetCode110;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    TreeNode root=new TreeNode(1);
    TreeNode t2=new TreeNode(2);
    TreeNode t3=new TreeNode(2);
    TreeNode t4=new TreeNode(3);
    TreeNode t5=new TreeNode(3);
    TreeNode t8=new TreeNode(4);
    TreeNode t9=new TreeNode(4);
   Solution solution=new Solution();



    @Test
    public void isBalanced()
    {
        root.left=t2;
        root.right=t3;
        t2.left=t4;
        t2.right=t5;
        t4.left=t8;
        t4.right=t9;
        System.out.println(solution.isBalanced(root));
    }

    @Test
    public void height() {
    }
}