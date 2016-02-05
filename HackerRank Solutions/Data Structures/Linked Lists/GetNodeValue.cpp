/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int GetNode(Node *head,int positionFromTail)
{
  Node *node=new Node;
  node= head;
  Node *current=new Node;
  current= head;
    int count=0;
    while(node!=NULL)
        {
        count++;
        node=node->next;
    }
    for(int i=0;i<count-positionFromTail-1;i++)
        current=current->next;
    return current->data;
}
