 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
    Node kk=new Node();
    kk.data=value;
    
     if(root==null)
     {
        root=kk;
        return root;
     }
    if(value<root.data)
    {
        root.left=Insert(root.left,value);
    } 
    if(value>root.data)
    {
        root.right=Insert(root.right,value);
    }
    return root;
    }


