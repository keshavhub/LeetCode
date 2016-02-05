/*
  Remove all duplicate elements from a sorted linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* RemoveDuplicates(Node *head)
{
  Node *current=new Node;
  current=head;
    if(current==NULL)
        {return head;}
  while(current->next!=NULL)
      {
      if(current->next->data==current->data)
          {
           current->next=current->next->next;
          }
      else
      {
          current=current->next;
      }
      }
    return head;
}
