/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode n=new ListNode(0);
        n=null;
        if(l1==null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        if(l1.val<l2.val)
        {
            n=l1;
            n.next=mergeTwoLists(l1.next,l2);
        }
        else
        {
            n=l2;
            n.next=mergeTwoLists(l1, l2.next);
        }
        return n;
    }
}