/*
  Delete Node at a given position in a linked list 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Delete(Node *head, int position)
{
    Node *current=new Node; 
    current=head;
    if(position==0)
        {
         head= head->next;
        }  
    else
        {
        for(int i=0;i<position-1;i++)
            {
            current=current->next;
            }
        current->next=current->next->next;
    }
    return head;
    
}
