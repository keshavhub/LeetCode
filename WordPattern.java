public class Solution {
    public boolean wordPattern(String pattern, String str) {
     Map<Character,String> map=new HashMap<Character,String>();
     String[] s=str.split(" ");
     if (s.length != pattern.length())
        return false;
     for(int i=0;i<pattern.length();i++)
     {
         String val=map.get(pattern.charAt(i));
         if(val==null)
         {
             if(!map.containsValue(s[i]))
             {
             map.put(pattern.charAt(i),s[i]);
             }
             else
                 return false;
         }
         else if(!val.equals(s[i]))
         {
             return false;
         }
     
     }
      return true;   
    }
}