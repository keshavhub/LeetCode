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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        if(root==null)
        {
            return l;
        }
        TreeNode k=root;
        while(k!=null || !s.isEmpty())
        {
            while(k!=null)
            {
                s.push(k);
                k=k.left;
            }
            k=s.peek();
            l.add((s.pop()).val);
            k=k.right;
         }
         return l;
    }
}