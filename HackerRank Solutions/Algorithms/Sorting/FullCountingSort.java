import java.util.Scanner;

/**
 *
 * @author Keshav
 */
public class TheFullCountingSort {
public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        String s[]=new String[n];
        int[] count=new int[101];
        for(int j=0;j<n;j++)
            {
            a[j]=in.nextInt();
            s[j]=in.nextLine();
            }
        for(int j=0;j<n;j++)
            {
            count[a[j]]++;
            }
        int[] result=new int[102];
        result[0]= 0;
        for(int i=1;i<102;i++)
            {
                result[i]=count[i-1]+result[i-1];
            }
       /* for(int i=0;i<102;i++)
            {
                System.out.print(result[i]+" ");
            }
        System.out.println();*/
        int answer[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int number=a[i];
            answer[result[number]++]=i;            
        }
       /* for(int i=0;i<n;i++)
            {
                System.out.print(answer[i]+" ");
            } */
        int halfarray = n/2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) 
        {            
            int kk = answer[i];
            if (kk < halfarray) 
                sb.append(" -");
            else 
                sb.append(s[kk]);
        }
        System.out.println(sb.toString().trim());
    }
}