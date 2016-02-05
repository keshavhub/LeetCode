import java.util.*;
public class MaximumSubarray {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0)
        {
        int n=in.nextInt();
        int max_curr=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        int nonc_max=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                nonc_max+=a[i];
            }
            if(max_curr<0)
            {
                max_curr=a[i];
            }
            else
            {
                max_curr+=a[i];
            }
            if(max<max_curr)
            {
                max=max_curr;
            }
        }
        if(nonc_max==0)
        {
            nonc_max=a[0];
            for(int i=1;i<n;i++)
                if(a[i]>nonc_max)
                {
                    nonc_max=a[i];
                }
        }
        System.out.println(max+" "+nonc_max);
        t--;
        }
    }
}