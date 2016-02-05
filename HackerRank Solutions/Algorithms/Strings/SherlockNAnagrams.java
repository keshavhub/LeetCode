import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Integer t=Integer.parseInt(in.nextLine());
        while(t>0)
        {
        String s=in.nextLine();
        Map<String,Integer> map=new HashMap<String,Integer>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                char[] c=s.substring(i, j).toCharArray();
                Arrays.sort(c);
                String str=String.valueOf(c);
                Integer val=map.get(str);
                if(val!=null)
                {
                    map.put(str, val+1);
                }
                else
                    map.put(str, 1);
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            //System.out.println(entry.getKey()+":"+entry.getValue());
            count=count+(entry.getValue()*((entry.getValue()-1))/2);
        }
        System.out.println(count);
        t--;
        }    
    }
}