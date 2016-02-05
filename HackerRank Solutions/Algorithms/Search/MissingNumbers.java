import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int[] c=new int[10001];
        int[] d=new int[10001];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            c[a[i]]++;
        }
        int m=in.nextInt();
        int[] b=new int[m];
        for(int j=0;j<m;j++)
        {
            b[j]=in.nextInt();
            d[b[j]]++;
        }
        for(int i=0;i<10001;i++)
        {
            if(c[i]!=0 && d[i]!=0)
            {
                if(c[i]!=d[i])
                    System.out.print(i+" ");
            }
        }
    }
}