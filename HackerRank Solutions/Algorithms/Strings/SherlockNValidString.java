import java.util.*;
public class ValidString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int[] a=new int[123];
        int count=0;
        int count2=0;
        int countother=0;
        int count1=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]++;
        }
        
        for(int i=97;i<123;i++)
        {
         if(a[i]>max)
             max=a[i];
        }
       
        for(int i=97;i<123;i++)
        {
            if(a[i]!=0 && a[i]!=max)
            {
                if(a[i]==1)
                    count1++;
                else
                    countother++;
            }
        }
        if(count1==1 && countother==0)
        {
            System.out.print("YES");
            System.exit(0);
        }
        for(int i=97;i<123;i++)
        {
         if(a[i]<min && a[i]!=0)
             min=a[i];
        }
        for(int i=97;i<123;i++)
        {
         a[i]=a[i]-min;
        }
        for(int i=97;i<123;i++)
        {
         if(a[i]>0)
         {
             count=count+a[i];
         }
        }
        if(count>1)
            System.out.print("NO");
        else
            System.out.print("YES");
    }
}
