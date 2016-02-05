import java.util.*;
public class StockMaximize {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int  t=in.nextInt();
        while(t!=0)
        {
        int max=Integer.MIN_VALUE;
        long stock_max=0;
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        // 1 7 2 4 5 9 1 2 6
        // (6-6)+(6-2)+(6-1)+(9-9)+(9-5)+(9-4)+(9-2)+(9-7)+(9-1)
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            stock_max+=max-a[i];
        }
        System.out.println(stock_max);
        t--;
        }
    }
}
