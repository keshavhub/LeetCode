import java.util.Scanner;
public class ChiefHopper {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        double count=0;
        for(int i=0;i<n;i++)
        {
          a[i]=in.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            //e=e-(h-e) => 2e-h>=0  e>=h/2  e=ceil(h/2)
            //e=e+(e-h) => 2e-h>=0  e>=h/2  e=ceil(h/2)
            // e+(e-h)>=e'   e=ceil(e+h)/2
            count= Math.ceil((count + a[i])/2);
        }
        System.out.print((int)count);
    }
    
}