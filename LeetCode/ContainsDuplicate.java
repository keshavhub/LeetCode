public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            Integer val=freq.get(i);
            if(val!=null)
            {
                return true;
            }
            else
            {
                freq.put(i,1);
            }
            
        }
        return false;
    }
}