/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Insert(Node *head,int data)
{
    Node *temp=new  Node;
    temp=head;
    Node *cur= new Node;
    cur->data=data;
    cur->next=NULL;
    if(head==NULL)
        {head=cur;
        }
    else
    {
    while(temp->next!=NULL)
        temp=temp->next;
    temp->next=cur;
    }
    return head;
}
