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
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root,root);
    }
    boolean ismirror(TreeNode n1, TreeNode n2)
    {
        if(n1==null && n2==null)
        {
            return true;
        }
        if(n1!=null && n2!=null && n1.val==n2.val)
        {
            return (ismirror(n1.left,n2.right) && ismirror(n1.right,n2.left));
        }
        return false;
    }
}