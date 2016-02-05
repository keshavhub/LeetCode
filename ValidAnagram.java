public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1=new int[124];
        for(int i=0;i<s.length();i++)
        {
           s1[s.charAt(i)]++; 
        }
        for(int i=0;i<t.length();i++)
        {
           s1[t.charAt(i)]--; 
        }
        for(int i=0;i<s1.length;i++)
        {
           if(s1[i]!=0)
           {
               return false;
           }
        }
        return true;
    }
}