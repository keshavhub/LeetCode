public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int l=0;
        int u=nums.length-1;
        while(true)
        {
            int mid=l+(u-l)/2;
            if(nums[mid]==target)
            {
                return mid;
                
            }
            if(mid==0 && target <nums[mid])
            {
                return 0;
            }
            else if(mid==nums.length-1 && target>nums[mid])
            {
                return nums.length;
            }
            
            if(target<nums[mid] )
            { 
                if(nums[mid-1]<target)
                {
                  return mid;  
                }
                else
                {
                    u=mid-1;
                }
            }
            else if(target>nums[mid])
            {
                if(target<nums[mid+1])
                {
                    return mid+1;
                }
                else
                    l=mid+1;
                
            }
            
        }
        
    }
}