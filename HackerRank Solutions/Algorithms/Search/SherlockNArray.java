import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int p=0;p<t;p++)
        {
        int n=in.nextInt();
        int[] a= new int[n];
        int result=0;
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum1=0,sum2=0;
        for(int i=0,j=a.length-1;i<a.length && j>i;)
        {
            if(sum1<=sum2)
            {
                sum1=sum1+a[i];
                i++;
            }
            else
                if(sum2<sum1)
                {
                    sum2=sum2+a[j];
                    j--;
                }
            if(sum1==sum2)
            {
                if(i==j)
                {
                   result=1;
                   break;
                }
            }
        }
        if(a.length==1)
            result=1;
        if(result==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    }
}
