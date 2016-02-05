import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String s= in.nextLine();
        int k= Integer.parseInt(s.substring(0,2));
       if(s.contains("PM"))
        //  if(s.endsWith("PM"))
             {
                 if(k!=12)
                     k=k+12;
              System.out.print(k+s.substring(2,8)); 
             }
        if(s.endsWith("AM"))
            {
            if(k==12)
                System.out.print("00"+s.substring(2,8));
            else
                System.out.print(s.substring(0,8));
        }
       
             
            
             
            
        
    }
}