/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
       if(root==null)
       {
           return 0;
       }
       int lheight=minDepth(root.left);
       int rheight=minDepth(root.right);
       if(lheight==0)
       {
           return rheight+1;
       }
       else if(rheight==0)
       {
           return lheight+1;
       }
       else if(lheight<rheight)
       {
           return lheight+1;
       }
       else
       {
           return rheight+1;
       }
    }
}