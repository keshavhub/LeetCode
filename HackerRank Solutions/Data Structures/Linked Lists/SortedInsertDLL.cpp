/*
    Insert Node in a doubly sorted linked list 
    After each insertion, the list should be sorted
   Node is defined as
   struct Node
   {
     int data;
     Node *next;
     Node *prev;
   }
*/
Node* SortedInsert(Node *head,int data)
{
    Node *current=new Node;
    current=head;
    Node *temp=new Node;
    temp->data=data;
    temp->next=NULL;
    temp->prev=NULL;
    if(head==NULL)
        {
        head=temp;
        return head;
        }
    if(current->data>temp->data)
        {
        temp->next=current;
        current->prev=temp;
        head=temp;
        return head;
        }
    else
        {
    while(current->next!=NULL)
        {
        if(current->next->data>temp->data)
        {
            break;
        }
        current=current->next;
        }
   
    if(current->next==NULL)
        {
        temp->next=NULL;
        current->next=temp;
        temp->prev=current;
        }
    else
        {
        temp->next=current->next;
        temp->next->prev=temp;
        current->next=temp;
        temp->prev=current;
        }
    }
    return head;
    
}
