import java.util.*;
public class Candies {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int[] cg=new int[n];
        int total=0;
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            cg[i]=1;
        }
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[i-1])
            {
                cg[i]=cg[i-1]+1;
            }
        }
        
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>a[i+1])
            {
                if(cg[i]<=cg[i+1])
                {
                    cg[i]=cg[i+1]+1;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            total+=cg[i];
        }
        System.out.print(total);
        
    }
}