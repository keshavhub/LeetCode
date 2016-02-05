import java.util.*;
import java.math.*;
public class FibonacciModified {

    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        int n=in.nextInt();
        while(n!=2)
        {
            BigInteger c = new BigInteger("0");
            c=(b.multiply(b)).add(a);
            a=b;
            b=c;
            n--;
        }
        System.out.print(b);
    }

}
