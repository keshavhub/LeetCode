public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            Integer val=freq.get(nums[i]);
            if(val!=null)
            {
                if((i-val)<=k)
                return true;
                else
                freq.put(nums[i],i);
            }
            else
            {
                freq.put(nums[i],i);
            }
        }
        return false;
    }
}