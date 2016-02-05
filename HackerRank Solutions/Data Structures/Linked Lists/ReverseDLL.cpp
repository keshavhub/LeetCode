/*
   Reverse a doubly linked list, input list may also be empty
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* Reverse(Node* head)
{
    Node *current=new Node;
    current=head;
    if(head==NULL)
        return head;
    while(current->next!=NULL)
        {
        current=current->next;
        }
    head=current;
    Node *temp=new Node;
    temp=NULL;
    while(current!=NULL)
        {
        current->next=current->prev;
        current->prev=temp;
        temp=current;
        current=current->next;
        }
    return head;
}
