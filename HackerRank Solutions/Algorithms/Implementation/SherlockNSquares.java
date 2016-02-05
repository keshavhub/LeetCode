import java.util.*;

public class Demo {
public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t= in.nextInt();
        while(t!=0)
        {
           int count=0;
           int l=in.nextInt();
           int u=in.nextInt();
           int c=(int)Math.ceil(Math.sqrt(l));
           int f=(int)Math.floor(Math.sqrt(u));
           count=(f-c)+1;
           System.out.println(count);
           t--;
        }
 }
}