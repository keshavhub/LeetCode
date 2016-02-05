import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int arr[]= new int[15];
        int r;
        for(int i=0;i<t;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int j=0;j<t;j++)
        {   int count=0;
            int nn=arr[j];
            while(arr[j]!=0)
            {
            r=arr[j]%10;
            if(r==0)
                count=count;
            else if(nn%r==0)
                count++;
            arr[j]=arr[j]/10;
            }
        System.out.println(count);    
        }
    }
}