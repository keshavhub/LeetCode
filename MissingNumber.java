public class Solution {
    public int missingNumber(int[] nums) {
        int count=0;
        int len=nums.length;
        int sum= (len*(len+1))/2;
        for(int i=0;i<nums.length;i++)
        {
            count=count+nums[i];
        }
        return sum-count;
    }
}