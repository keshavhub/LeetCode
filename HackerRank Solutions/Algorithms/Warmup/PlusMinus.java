import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int countneg=0, countpos=0, countzero=0;
        double k=0;
        int arr[]= new int[100];
        int num= in.nextInt();
        for(int i=0;i<num;i++)
            {
            arr[i]= in.nextInt();
        }
            
        for(int i=0;i<num;i++)
            {
            if(arr[i]<0)
                countneg+= 1;
            else if(arr[i]>0)
                countpos+= 1;
            else
                countzero+= 1;
        }
        double j= (double) countpos/num;
        k= (double) countneg/num;
        double l= (double) countzero/num;
        System.out.printf("%.3f\n", j);
        System.out.println(Math.round(k*1000d)/1000d);
        System.out.printf("%.3f\n", l);
   }
}