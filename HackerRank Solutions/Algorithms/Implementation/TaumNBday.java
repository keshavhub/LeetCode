import java.util.*;
public class Solution {

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        long[] x=new long[t];
        long[] y=new long[t];
        long[] z=new long[t];
        long[] B=new long[t];
        long[] W=new long[t];
        for(int i=0;i<t;i++)
        {
            B[i]=in.nextLong();
            W[i]=in.nextLong();
            x[i]=in.nextLong();
            y[i]=in.nextLong();
            z[i]=in.nextLong();
        }
        for(int i=0;i<t;i++)
        {
            long cost=0;
            if(x[i]>y[i]+z[i])
                x[i]=y[i]+z[i];
            if(y[i]>x[i]+z[i])
                y[i]=x[i]+z[i];
            cost=(B[i]*x[i])+(W[i]*y[i]);
            System.out.println(cost);
        }
        }
}