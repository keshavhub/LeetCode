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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        if(root==null)
        {
            return l;
        }
        Stack<TreeNode> s=new Stack<TreeNode>();
        Stack<TreeNode> p=new Stack<TreeNode>();
        
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode k=s.peek();
            p.push(s.pop());
            if(k.left!=null)
            {
                s.push(k.left);
            }
            if(k.right!=null)
            {
                s.push(k.right);
            }
        }
        while(!p.isEmpty())
        {
            l.add(p.pop().val);        
        }
        return l;
     }
}
    