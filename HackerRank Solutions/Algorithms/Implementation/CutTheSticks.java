import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int arr[]=new int[1000];
        for(int i=0;i<t;i++)
            arr[i]=in.nextInt();
        while(isallzero(arr,t)!=0)
            {
            int k= minValue(arr,t);
            //System.out.println(k);
            int ans= cutstick(arr,k,t);
            System.out.println(ans);
            }
    }
    
public static int isallzero(int[] a, int t)
{
    int zero = 0;
        for (int element : a) {
            if (element != 0) {
                zero++;
            }
        }
        return zero;    
}
    
public static int minValue(int[] a, int t)
{
    int smallest= Integer.MAX_VALUE;
        for(int i=0;i<t;i++)
            {
            if(a[i]!=0)
            {
                if(a[i]<smallest)
                smallest=a[i];
            }
            }
    return smallest;
    
}
    
public static int cutstick(int[] a, int small, int t)
{ int count=0;
    for(int i=0;i<t;i++)
        {
         if(a[i]!=0)
             {
             a[i]=a[i]-small;
             count++;
             }
        }
    return count;
}
}