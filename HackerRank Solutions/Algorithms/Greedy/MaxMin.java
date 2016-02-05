import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class MaxMin {
    
   public static void main(String[] args) throws NumberFormatException, IOException {

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(in.readLine());
      int K = Integer.parseInt(in.readLine());
      int[] list = new int[N];

      for(int i = 0; i < N; i ++)
         list[i] = Integer.parseInt(in.readLine());
      Arrays.sort(list);
      int unfairness = Integer.MAX_VALUE;
      if(N==2)
      {
          System.out.print(list[1]-list[0]);
      }
      else
      {
          int p1=0;
          int p2=K-1;
          while(p2<list.length)
          {
              if(list[p2]-list[p1]<unfairness)
              {
                  unfairness=list[p2]-list[p1];
              }
              p1++; p2++;
          }
          System.out.println(unfairness);
      }
   }
}
