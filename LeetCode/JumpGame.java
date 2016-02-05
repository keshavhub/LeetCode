public class Solution {
    public boolean canJump(int[] a) {
        int max=0;
       for(int i=0;i<a.length;i++)
       {
           if(i>max)
           {
               return false;
           }
           max=Math.max(max,i+a[i]);
       }
     return true;
    }
}