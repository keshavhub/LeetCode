public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        int[] a=new  int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                a[0]=map.get(target-nums[i]).intValue()+1;
                a[1]=i+1;
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return a;
    }
}