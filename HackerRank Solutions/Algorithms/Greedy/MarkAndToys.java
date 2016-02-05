import java.util.*;
public class markandtoys {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),k=in.nextInt();
        int prices[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++) prices[i]=in.nextInt();
        Arrays.sort(prices);
        int answer = 0;
        while(answer<prices.length)
        {
          j+=prices[answer];
          if(j>k)
              break;
          answer++;
        }
        System.out.println(answer);
    }
}