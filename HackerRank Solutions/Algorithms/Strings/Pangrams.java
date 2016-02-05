import  java.util.*;
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s=str.toUpperCase();
        int count=0;
        int[] arr=new int[91];
        char[] ch=s.toCharArray();
        for(char c:ch)
        { 
          arr[c]++;  
        }
        for(int k=65;k<91;k++)
        {
            if(arr[k]!=0)
                count++;
        }
        if(count==26)
            System.out.print("pangram");
        else
            System.out.print("not pangram");
    }
}