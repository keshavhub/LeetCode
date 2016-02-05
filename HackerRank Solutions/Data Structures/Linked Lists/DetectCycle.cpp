/*
   Find merge point of two linked lists
   Node is defined as
   struct Node
   {
       int data;
       Node* next;
   }
*/
int FindMergeNode(Node *headA, Node *headB)
{
    Node *h1=headA;
    Node *h2=headB;
    int count1=0, count2=0;
    while(h1!=NULL)
    {
        h1=h1->next;
        count1++;
    }
    while(h2!=NULL)
    {
        h2=h2->next;
        count2++;
    }
    int d=abs(count1-count2);
    h1=headA; h2=headB;
    if(count1>count2)
        {
        while(d!=0)
            {
            h1=h1->next;
            d--;
        }
    }
    else if(count1<count2)
    {
        while(d!=0)
            {
            h2=h2->next;
            d--;
        }
    }
    while(h1!=NULL)
        {
        if(h1==h2)
            return h1->data;
        h1=h1->next;
        h2=h2->next;
    }
    return 0;
}
