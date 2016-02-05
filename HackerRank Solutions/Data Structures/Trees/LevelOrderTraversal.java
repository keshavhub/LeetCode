   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
      if(root==null)
          return;
       Queue<Node> q=new LinkedList<Node>();
       q.add(root);
       while(!(q.isEmpty()))
           {
           Node kk=q.peek();
           System.out.print(kk.data+" ");
           if(kk.left!=null)
               q.add(kk.left);
           if(kk.right!=null)
               q.add(kk.right);
           q.remove();
           }
      
    }
