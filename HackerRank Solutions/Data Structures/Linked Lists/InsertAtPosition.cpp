/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* InsertNth(Node *head, int data, int position)
{
    Node *temp=new Node;
    Node *cur=new Node;
    cur=head;
    temp->data=data;
    temp->next=NULL;
    if(head == NULL)
    {  
     head = temp;
    }
    else
    {
        int i=0;  
     cur = head;  
     while(cur!=NULL){  
       if(position == 0){  
           temp->next = cur;  
           head= temp;  
           break;
       }  
       else if(i==position-1){  
         temp->next = cur->next;  
         cur ->next = temp;  
           break;
       }
         i++;  
       cur= cur->next;  
     }  
   }  
   return head; 
}
