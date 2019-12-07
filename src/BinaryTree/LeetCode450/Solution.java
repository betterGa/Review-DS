package BinaryTree.LeetCode450;

  class TreeNode
  {     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public class Solution {
      //传入二叉树和要删除的值,返回删除后的根节点
      public TreeNode deleteNode(TreeNode root, int key)
      {
          if(root==null) return null;
          else if(key<root.val) {root.left=deleteNode(root.left,key);return root;}
          else if(key>root.val) {root.right=deleteNode(root.right,key);return root;}
          else
          //值相等，说明当前的节点就是需要删除的根节点
          {   //如果只有左孩子，把删除掉后的左孩子链给根节点
              if(root.left==null&&root.right==null) return null;
              if(root.right==null&&root.left!=null)
              { return root.left; }
              else if(root.left==null&&root.right!=null)
              {return root.right;}
              //既有左孩子，又有右孩子。
              //去它的右孩子找右子树中最小的，替换之
              else
              {
                  TreeNode find=getMin(root.right);
                  find.right=moveMin(root.right);
                  find.left=root.left;

                  return find; }}}

      //在二叉搜索树中寻找最小值：沿着左子树，直到走到最左为止
      private  TreeNode getMin(TreeNode root)
      {
          if(root.left==null) return root;
          return getMin(root.left); }


      //传入二叉树，返回删除了最小值后的二叉树根节点
      private TreeNode moveMin(TreeNode root)
      {
          if(root.left==null)
          {
              return root.right;
          }
          root.left=moveMin(root.left);
          return root; }

  }






    //采用递归，不需要去找那个key所对应的节点。
    /*public TreeNode findKey(TreeNode root,int key)
    {
        if(root.val==key) return root;
        TreeNode resultNode=findKey(root.left,key);
        resultNode=findKey(root.right,key);
        return resultNode; }

}*/