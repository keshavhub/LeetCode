import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long sum=0;
        int num=in.nextInt();
        for(int i =0;i<num;i++)
            {
            sum+= in.nextLong();
        }
        System.out.println(sum);
        
        
    }
}