/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==head)
        {
            return head;
        }
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null && p2.next.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2)
            {
                p1=head;
                break;
            }
        }
        if(p2.next==null || p2.next.next==null)
        {
            return null;
        }
        while(true)
        {
            if(p1==p2)
            {
                return p2;
            }
            p1=p1.next;
            p2=p2.next;
        }
    }
}