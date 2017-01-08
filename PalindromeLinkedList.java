/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head==null || head.next==null)
       {
           return true;
       }
       ListNode p2=head;
       ListNode temp=null;
       ListNode curr=head;
       ListNode kk=null;
       while(p2!=null && p2.next!= null)
       {
           p2=p2.next.next;
           kk=curr.next;
           curr.next=temp;
           temp=curr;
           curr=kk;
       }
       if(p2!=null)
       {
           curr=curr.next;
       }
       while(curr!=null)
       {
           if(curr.val!=temp.val)
           {
               return false;
           }
           curr=curr.next;
           temp=temp.next;
       }
      return true; 
    }
}