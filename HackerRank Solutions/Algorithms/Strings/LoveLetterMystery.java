import java.util.*;
public class Solution
        {
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t=Integer.parseInt(in.nextLine());
        String[] s=new String[t];
        int p=0;
        for(int i=0;i<t;i++)
            s[i]=in.nextLine();
        while(p<t)
        {
        int total=0;
        for(int i=0,j=s[p].length()-1;i<s[p].length()/2;i++,j--)
        {
            int count=0;
            if(s[p].charAt(i)>s[p].charAt(j))
                count=(int)s[p].charAt(i)-(int)s[p].charAt(j);
            else if(s[p].charAt(i)<s[p].charAt(j))
                count=(int)s[p].charAt(j)-(int)s[p].charAt(i);
            else count=count;
            total+=count;
        }
        System.out.println(total);
        p++;
        }
    }
    
}