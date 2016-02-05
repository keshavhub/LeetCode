/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        {
            return head;
        }
        if(n==1 && head.next==null)
        {
            head=head.next;
            return head;
        }
        ListNode node=head;
        ListNode kk=head;
        int c=0;
        while(node!=null)
        {
            c++;
            node=node.next;
        }
        if(c==n)
        {
            head=head.next;
            return head;
        }
        for(int i=1;i<c-n;i++)
        {
            kk=kk.next;
        }
        kk.next=kk.next.next;
        return head;
    }
}