import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int N, int C, int M){
        int j=N/C;
        int total=j;
        while(j-M>=0)
            {
            int k=j%M;
            int l=j/M;
            total+=l;
            j=l+k;
        }
         return total;
    }
    
    
}