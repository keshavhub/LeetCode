import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[1000];
         
        int t=in.nextInt();
        for(int i=0;i<t;i++)
            {
            int count=0;
            int n=in.nextInt();
            int k=in.nextInt();
            for(int j=0;j<n;j++)
                {
                arr[j]=in.nextInt();
            if(arr[j]<=0)
                count++;
            }
           if(count>=k)
            System.out.println("NO");
        else
           System.out.println("YES");
        }
        
        
    }
}