public class Solution {
    public void sortColors(int[] nums) {
        int p1=0;
        int p2=nums.length-1;
        int i=0;
        while(i<=p2)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[p1];
                nums[p1]=temp;
                p1++;
                i++;
            }
            else if(nums[i]==1)
            {
             i++;   
            }
            else if(nums[i]==2)
            {
                int kk=nums[i];
                nums[i]=nums[p2];
                nums[p2]=kk;
                p2--;
            }
            
        }
    }
}