public class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0;
        int p2=0;
        while(p1<nums.length-1)
        {
            if(nums[p1]==0)
            {
                p2=p1+1;
                while(nums[p2]==0 && p2<nums.length-1)
                {
                    p2++;
                }
                int temp=nums[p1];
                nums[p1]=nums[p2];
                nums[p2]=temp;
            }
            p1++;
        }
    }
}