package BinaryTree.LeetCode606;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeNodeTest {
TreeNode t1=new TreeNode(1);
TreeNode t2=new TreeNode(2);
TreeNode t3=new TreeNode(3);
TreeNode t4=new TreeNode(4);
@Test
    public void tsst1()
{t1.setLeft(t2);
t1.setRight(t3);
t2.setLeft(null);
t2.setRight(t4);
    TreeNode.Solution s=new TreeNode.Solution();
System.out.println(s.tree2str(t1));

}



}