public class Solution {
    public static String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        for(int i=0;i<secret.length();i++)
        {
           if(secret.charAt(i)==guess.charAt(i))
           {
               bull++;
           }
        }
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<secret.length();i++)
        {
            Integer val=map.get(secret.charAt(i));
            if(val==null)
            {
                map.put(secret.charAt(i), 1);
            }
            else
                map.put(secret.charAt(i), val+1);
        }
        for(int i=0;i<guess.length();i++)
        {
            Integer kk=map.get(guess.charAt(i));
            if(kk!=null)
            {
            if(kk>0)
            {
                cow++;
                map.put(guess.charAt(i), kk-1);
            }
            }
        }
        cow-=bull;
        String answer=bull+"A"+cow+"B";
        return answer;
    }  
}