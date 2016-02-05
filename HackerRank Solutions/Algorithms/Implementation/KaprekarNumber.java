import java.util.Scanner;

public class KaprekarNumbers {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int q=in.nextInt();
        boolean ans=false;
        for(long i=p; i<=q;i++)
        {
            long k=1;
            long n=i;
            while(n!=0)
            {
                k=k*10;
                n=n/10;
            }
            long num=i*i;
            if(i==(num/k + num%k))
            {
                System.out.print(i+" ");
                ans=true;
            }
        }
        if(ans==false)
            System.out.print("INVALID RANGE");
    }
}