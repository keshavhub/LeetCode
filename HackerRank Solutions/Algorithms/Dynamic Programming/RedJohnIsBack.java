import java.util.Scanner;

public class RedJohnIsBack {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
        int n=in.nextInt();
        int count[]=new int[n+1];
        count[0]=1;
        for(int i=1;i<=n;i++)
        {
            count[i]=count[i-1];
            if(i-4>=0)
            {
                count[i]+=count[i-4];
            }
        }
        int total=0;
        for(int i=2;i<=count[n];i++)
        {
            boolean answer=count_prime(i);
            if(answer)
                total++;
        }
        System.out.println(total);
        t--;
        }
    }

public static boolean count_prime(int num)
{
    if (num!= 2 && num%2==0) 
        return false;
    for(int i=3;i<=Math.sqrt(num);i+=2)
    {
        if(num%i==0)
            return false;
    }
    return true;    
}
}