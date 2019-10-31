package BinaryTree.BinSearchTree.BSTandBLL;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
Solution solution=new Solution();
List resultList=new ArrayList();
TreeNode root=new TreeNode(12);
TreeNode node1=new TreeNode(11);
TreeNode node2=new TreeNode(30);
TreeNode node3=new TreeNode(5);
TreeNode node4=new TreeNode(14);

    @Test
    public void LRootR() {
        root.left=node1;
        root.right=node2;
        node1.left=node3;
        node1.right=node4;

    solution.LRootR(root);
    System.out.println(solution.resultList);


    }
}