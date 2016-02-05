import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
            {
            int n=in.nextInt();
            int j=1;
            for(int i=1;i<=n;i++)
                {
                if(i%2!=0)
                    j=j*2;
                else
                    j=j+1;
                }
            System.out.println(j);
            t--;
            }
    }
}