/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
    Node temp=head;
  Stack<Integer> s=new Stack<Integer>();
    if(head==null)
        return;
    else
        {
        while(temp!=null)
            {
            s.push(temp.data);
            temp=temp.next;
            }
    }
    while(!s.isEmpty())
    System.out.println(s.pop());

}
