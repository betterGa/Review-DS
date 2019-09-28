package BinaryTree.BinSearchTree.LeetCode144;

import org.junit.Test;

import java.util.List;
import java.util.TimerTask;

import static org.junit.Assert.*;

public class TreeNodeTest {
Solution solution=new Solution();
TreeNode t1=new TreeNode(1);
TreeNode t2=new TreeNode(2);
TreeNode t3=new TreeNode(3);
    @Test
    public void test1()
    {
        t1.setLeft(null);
        t1.setRight(t2);
        t2.setLeft(t3);

        List<Integer> r=solution.preorderTraversal(t1);
        for (int list:r) {System.out.println(list);

        }
    }
}