/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/

int CompareLists(Node *headA, Node* headB)
{
    Node *current1=new Node;
    Node *current2=new Node;
    int count1=0, count2=0;
    current1= headA;
    current2= headB;
    while(current1!=NULL)
        {
        count1++;
        current1=current1->next;
        }
    while(current2!=NULL)
        {
        count2++;
        current2=current2->next;
        }
    if(count1!=count2)
        return 0;
    else
        {
        Node *node1=new Node;
        Node *node2=new Node;
        node1= headA;
        node2= headB;
        int kk=0;
        for(int i=0;i<count1;i++)
            {
            if(node1->data== node2->data)
            {
                kk++;
            }
            node1=node1->next;
            node2=node2->next;
            }
        if(kk==count1)
            return 1;
            else
            return 0;
        
}
}
