import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=Integer.parseInt(in.nextLine());
        while(t>0)
        {
            int index=-1;
            String s=in.nextLine();
            for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    if(s.charAt(i+1)==s.charAt(j) && (s.charAt(j-1)==s.charAt(i)))
                    {
                        if(s.charAt(i)==s.charAt(i+2))
                        {
                            index=i;
                            break;
                        }
                        else 
                            if(s.charAt(j)==s.charAt(j-2))
                            {
                                index=j;
                                break;
                            }
                    }
                    else if(s.charAt(i+1)==s.charAt(j))
                    {
                        index=i;
                        break;
                        
                    }
                    else if(s.charAt(j-1)==s.charAt(i))
                    {
                        index=j;
                        break;
                    }
                }
                
            }
            System.out.println(index);
            t--;
        }
    }
    
}