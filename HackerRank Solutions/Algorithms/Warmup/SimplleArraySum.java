import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int[] arr = new int[1000];
        int a;
        int sum=0;
        a = in.nextInt();
        for(int i=0;i<a;i++)
            {
            arr[i]= in.nextInt();
        }
        for(int i=0;i<a;i++)
            {
            sum= sum+arr[i];
        }
            
        System.out.println(sum);
    }
}