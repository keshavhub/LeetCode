import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        char[] s1= str1.toCharArray();
        char[] s2= str2.toCharArray();
        int a[]=new int[256];
        int b[]=new int[256];
        int count=0;
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
        System.out.print(count);
    }
}
