import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t = Integer.parseInt(in.nextLine());
        int kk=0;
        String[] s=new String[t];
        int arr[]=new int[123];
        int count[]=new int[123];
        for(int i=0;i<t;i++)
        {
            s[i]=in.nextLine();
        }
        for(int i=0;i<t;i++)
        {   
            for(int j=0;j<s[i].length();j++)
            {
               arr[s[i].charAt(j)]++;
            }
            for(int k=97;k<123;k++)
            {
                if(arr[k]>0)
                {
                    count[k]++;
                    arr[k]=0;
                }
            }
        }
        for(int k=97;k<123;k++)
        {
            if(count[k]==t)
            {
                kk++;
            }
        }
        System.out.print(kk);
    }
    
}