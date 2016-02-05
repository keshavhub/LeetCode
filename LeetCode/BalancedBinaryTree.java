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
    public boolean isBalanced(TreeNode root) {
        int ans=BalorNot(root);
        if(ans==-1)
        {
            return false;
        }
        return true;
    }
    public int BalorNot(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lheight= BalorNot(root.left);
        int rheight= BalorNot(root.right);
        if(lheight==-1 || rheight==-1)
        {
            return -1;
        }
        if(Math.abs(lheight-rheight)>1)
        {
            return -1;
        }
        if(lheight>rheight)
        {
            return lheight+1;
        }
        else
        {
            return rheight+1;
        }
        
    }
}