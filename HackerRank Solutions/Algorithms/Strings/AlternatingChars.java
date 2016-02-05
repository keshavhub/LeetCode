import java.util.*;
public class AltChar {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t=Integer.parseInt(in.nextLine());
        String[] str=new String[t];
        for(int i=0;i<t;i++)
        {
        str[i]=in.nextLine();
        }
        for(String s:str)
        {
        int count=0;
        int i=0;
        while(i<s.length()-1)
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                 count++;
                }
                i++;
            }
        System.out.println(count); 
    }
    }
}