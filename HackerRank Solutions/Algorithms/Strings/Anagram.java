import java.util.Scanner;

/**
 *
 * @author Keshav
 */
public class Solution {

        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t=Integer.parseInt(in.nextLine());
        String[] str=new String[t];
        for(int j=0;j<t;j++)
        {
            str[j]=in.nextLine();
        }
        
        for(String s:str)
        {
        int count=0;
        char[] s1= new char[10000];
        char[] s2= new char[10000];
        int a[]=new int[256];
        int b[]=new int[256];
        for(int i=0;i<s.length()/2;i++)
        {
            s1[i]=s.charAt(i);
            s2[i]=s.charAt((s.length()/2)+i);
        }
        for(int i=0;i<s1.length;i++)
        {
            a[s1[i]]++;
        }
        for(int j=0;j<s2.length;j++)
        {
            b[s2[j]]++;    
        }
        for(int k=97;k<123;k++)
        {
            if(a[k]!=b[k])
                count=count+Math.abs(a[k]-b[k]);
        }
        if((s.length())%2!=0)
            System.out.println("-1");
        else
            System.out.println(count/2);   
        }
    }
}
 