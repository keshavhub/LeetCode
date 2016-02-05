import java.util.Arrays;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int j=0;
        int  count=1;
        for(int i=1;i<n;i++)
        {
            if(a[i]>a[j]+4)
            {
                j=i;
                count++;
            }
        }
        System.out.print(count);
    }
    
}