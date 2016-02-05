import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int[] count=new int[100];
        for(int j=0;j<n;j++)
            a[j]=in.nextInt();
        for(int j=0;j<n;j++)
            {
            count[a[j]]++;
            }
        for(int i=0;i<100;i++)
            {
            while(count[i]>0)
                {
                System.out.print(i+" ");
                count[i]--;
                }
            }
    }
}