
import java.util.*;

class Solution{
   public static void main( String args[] ){
      Scanner in = new Scanner(System.in);
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      Arrays.sort(C);
      int y=0;
      int result = 0;
       int count=0;
       for(int i=N-1;i>=0;i--)
           {
            result=result+(C[i]*(count+1));   
           y++;
           if(y==K)
               {
               count++;
               y=0;
           }
           }
      System.out.println( result );
      
   }
}
