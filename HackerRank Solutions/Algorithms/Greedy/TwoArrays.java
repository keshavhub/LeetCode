import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t!=0)
        {
        int n=in.nextInt();
        int k=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=0;i<n;i++)
            b[i]=in.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=n-1;i>=0;i--)
        {
            if(a[count]+b[i]>=k)
            {
                count++;
            }
            else
                break;
        }
        if(count==n)
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");
        }
        t--;
        }
    }
    
}