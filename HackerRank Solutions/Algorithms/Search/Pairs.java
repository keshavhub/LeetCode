import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int total=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
       for(int i=0,j=1;i<a.length && j<a.length;)
       {
           if(a[j]-a[i]==k)
           {
               total++;
               i++;
               j++;
           }
           else if(a[j]-a[i]<k)
               j++;
           else if(a[j]-a[i]>k)
               i++;
       }
       System.out.print(total);
    }
    
}
