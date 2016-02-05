/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
    Node n=root;
    for(int i=0;i<S.length();i++)
        if(S.charAt(i)=='0')
            {
            n=n.left;
            if(n.left==null && n.right==null)
            {
                System.out.print(n.data);
                n=root;
            }
            }
        else if(S.charAt(i)=='1')
            {
            n=n.right;
            if(n.left==null && n.right==null)
            {
                System.out.print(n.data);
                n=root;
            }
            }
    }
    

