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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        if(root==null)
        {
            return l;
        }
        else
        {
            s.push(root);
        }
        while(!s.isEmpty())
        {
            TreeNode k=s.peek();
            l.add((s.pop()).val);
            if(k.right!=null)
            {
                s.push(k.right);
            }
            if(k.left!=null)
            {
                s.push(k.left);
            }
        }
        return l;
    }
}