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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode ans=new TreeNode(0);
        ans=toBST(nums,0,nums.length-1);
        return ans;
    }
    public TreeNode toBST(int[] nums,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=toBST(nums,start,mid-1);
        root.right=toBST(nums,mid+1,end);
        return root;
    }
}