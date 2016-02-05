/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        ListNode kk=null;
        while(curr!=null)
        {
            kk=curr.next;
            curr.next=prev;
            prev=curr;
            curr=kk;
        }
        head= prev;
        return head;
    }
}