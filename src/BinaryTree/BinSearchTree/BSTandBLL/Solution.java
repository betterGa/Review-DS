package BinaryTree.BinSearchTree.BSTandBLL;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val;
    }

    public TreeNode(int val) {
        this.val = val;
    }

}

public class Solution {
    List resultList=new ArrayList();
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        //递归调用，中序遍历二叉树,存在集合List中
    resultList=LRootR(pRootOfTree);
    //将这个List变成双向链表
        for(int i=0;i<resultList.size()-1;i++)
        {
            ((TreeNode)resultList.get(i)).right=(TreeNode)resultList.get(i+1);
            ((TreeNode)resultList.get(i+1)).left=(TreeNode)resultList.get(i);
        }
return  (TreeNode) resultList.get(0);



    }
public List LRootR(TreeNode root)
{
   if(root==null) return resultList;

    LRootR(root.left);
if(root!=null) resultList.add(root);
    LRootR(root.right);

return resultList;


}

}