import java.util.*;
public class JimAndTheOrders {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t[]=new int[n];
        int d[]=new int[n];
        int s[]=new int[n];
        int k[]=new int[n];
        for(int i=0;i<n;i++)
        {
            t[i]=in.nextInt();
            d[i]=in.nextInt();
            s[i]=t[i]+d[i];
            k[i]=s[i];
        }
        Arrays.sort(k);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(k[i]==s[j])
                {
                    System.out.print(j+1+" ");
                    s[j]=-1;
                    break;
                }
            }
        }
        
        
    }
    
}