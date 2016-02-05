import java.util.*;
public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        
        int t=in.nextInt();
        for(int p=0;p<t;p++)
        {
            int m=in.nextInt();
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]= in.nextInt();
            }

            for(int i=0;i<a.length-1;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                 if(a[i]+a[j]==m)
                     System.out.println((i+1)+" "+(j+1));
                }
            }
        } 
    }
}