import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a[]= new int[1000];
        int  v= in.nextInt();
        int  n= in.nextInt();
        for(int i=0;i<n;i++)
            {
            a[i]=in.nextInt();
            }
        for(int i=0;i<n;i++)
            {
            if(a[i]==v)
            {
                System.out.println(i);
                break;
            }
            }
    }
}