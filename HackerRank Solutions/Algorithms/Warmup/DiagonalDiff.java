import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum1=0, sum2=0, sum3;
        int n= in.nextInt();
        int arr[][]= new int[n][n];
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
               arr[i][j]= in.nextInt();
            }
            }
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                if(i+j==n-1)
                    sum2+=arr[i][j];
                if(i==j)
                    sum1+=arr[i][j];
                
            }
            }
        sum3= sum1 - sum2;
        if(sum3<0)
            {
            System.out.println(Math.abs(sum3));
       }
       else
          {
          System.out.println(sum3);
         }
        
    }
}