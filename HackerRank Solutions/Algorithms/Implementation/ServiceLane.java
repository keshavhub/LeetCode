import java.util.*;
public class Solution {

    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int N=in.nextInt();
       int T=in.nextInt();
       int a[]=new int[N];
       int entry[]=new int[T];
       int exit[]=new int[T];
       for(int i=0;i<N;i++)
           a[i]=in.nextInt();
       for(int i=0;i<T;i++)
       {
           entry[i]=in.nextInt();
           exit[i]=in.nextInt();
       }
       for(int j=0;j<T;j++)
       {   
           int smallest=Integer.MAX_VALUE;
           for(int i=entry[j];i<=exit[j];i++)
           {
               if(a[i]<smallest)
                   smallest=a[i];
           }
           System.out.println(smallest);
       }
    }
    
}
