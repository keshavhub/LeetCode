import java.util.*;
public class ClosestNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new  int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int p1=0;
        int p2=1;
        int sd=Integer.MAX_VALUE;
        while(p2<a.length)
        {
            if(a[p2]-a[p1]<sd)
            {
                sd=a[p2]-a[p1];
            }
            p1++; p2++;
        }
        p1=0; p2=1;
        while(p2<a.length)
        {
            if(a[p2]-a[p1]==sd)
            {
                sd=a[p2]-a[p1];
                System.out.print(a[p1]+" "+a[p2]+" ");
            }
            p1++; p2++;
        }
    }
    
}