package BinaryTree.LeetCode102;

import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList();
        Queue<TreeNode> queue=new LinkedList<>();
        List result=new ArrayList();
//根先进队
        queue.add(root);
        int size=1;
//当队里有元素时
        List innerlist=new ArrayList();
        while (size>0)
        {
            //出队
            TreeNode fatherNode=queue.poll();
            size--;
            //将队头加入本层的innerlist中
            innerlist.add(fatherNode.val);
            //如果子树不为空，子树入队
            if(fatherNode.left!=null) queue.add(fatherNode.left);
            if(fatherNode.right!=null) queue.add(fatherNode.right);
            if(size==0)
            {result.add(innerlist);
                innerlist=new ArrayList();
                size=queue.size();}
        }
        return result;




    }
}