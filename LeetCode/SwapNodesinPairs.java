public class Solution {
    public int /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next==null)
       {
           return head;
       }
       ListNode n=head.next;
       head.next=swapPairs(head.next.next);
       n.next=head;
       return n; 
    }
}(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
}