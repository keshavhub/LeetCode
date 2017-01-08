/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null)
        {
            return null;
        }
        ListNode A=headA;
        ListNode B=headB;
        while(A!=null && B!=null && A!=B)
        {
            A=A.next;
            B=B.next;
            if(A==B)
            {
                return A;
            }
            if(A==null)
            {
                A=headB;
            }
            if(B==null)
            {
                B=headA;
            }
        }
        return A;
    }
}