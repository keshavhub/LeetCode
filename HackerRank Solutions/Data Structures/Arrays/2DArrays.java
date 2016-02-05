import java.util.*;
public class TwoDArrayDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] a=new int[6][6];
        int max= Integer.MIN_VALUE;
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for(int i=1;i<5;i++)
        {
            for(int j=1;j<5;j++)
            {
                int count=hourglass(a,i,j);
                if(max<count)
                max=count;
            }
        }
        System.out.print(max);
        
    }
    
public static int hourglass(int[][] a,int i,int j)
{
    int count=0;
    count=a[i][j]+a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]+a[i+1][j-1]+a[i+1][j]+a[i+1][j+1];
    return count;
}
}