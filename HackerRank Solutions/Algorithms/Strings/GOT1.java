import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        int[] arr=new int[123];
        int count=0;
        for(char s:ch)
            arr[s]++;
        for(int i=97;i<123;i++)
        {
            if(arr[i]%2==1)
                count++;
        }
        if(count>1)
            System.out.print("NO");
        else
            System.out.print("YES");
    }
    
    
}
