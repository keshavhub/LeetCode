public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls=new ArrayList<String>();
        if(nums.length==0)
        return ls;
        int j=nums[0];
        if(nums.length==1)
        {
            ls.add(String.valueOf(nums[0]));
            return ls;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=(nums[i+1]-1))
            {
                if(j==nums[i])
                ls.add(String.valueOf(j));
                else
                ls.add(j+"->"+nums[i]);
                j=nums[i+1];
            }
        }
        if(nums[nums.length-2]!=nums[nums.length-1]-1)
        {
            ls.add(String.valueOf(nums[nums.length-1]));
        }
        else
        {
            ls.add(j+"->"+nums[nums.length-1]);
        }
        return ls;
    }
}