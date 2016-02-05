import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] a=new String[10];
        String[] r=new String[10];
        Integer totalInputs = Integer.parseInt(in.nextLine());
        
        for(int j=0;j<totalInputs;j++)
        {
            
            a[j]=in.nextLine();
            r[j]=new StringBuilder(a[j]).reverse().toString();
        }
        for(int j=0;j<totalInputs;j++)
        { 
        int count=0;
        for(int i=1;i<a[j].length();i++)
            {
            if(Math.abs(a[j].charAt(i)-a[j].charAt(i-1))==Math.abs(r[j].charAt(i)-r[j].charAt(i-1)))
            count++;
            }            
            if(count==a[j].length()-1)
            System.out.println("Funny");
            else
            System.out.println("Not Funny");
            
        }    
        }
        
}