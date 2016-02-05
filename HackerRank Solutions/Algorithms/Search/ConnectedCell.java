import java.util.*;
public class ConnectedCell {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] a=new int[m][n];
        boolean[][] b=new boolean[m][n];
        int max=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
                b[i][j]=false;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
        if(!b[i][j]) max = Math.max(max, connectedcell(a,b,i,j,m,n));
            }
        }
        System.out.print(max);
    }
    
public static int connectedcell(int[][] a,boolean[][] b,int i, int j,int m, int n)
{
    if(i<0 || j<0 || i>=m || j >= n) return 0;
    if(b[i][j]) return 0;
    b[i][j]=true;
    if(a[i][j]==0) return 0;
    else return 1 +
            connectedcell(a,b, i-1, j-1, m, n) +
            connectedcell(a,b, i-1, j, m, n) + 
            connectedcell(a,b, i-1, j+1, m, n) + 
            connectedcell(a,b, i, j-1, m, n) + 
            connectedcell(a,b, i, j, m, n) + 
            connectedcell(a,b, i, j+1, m, n) + 
            connectedcell(a,b, i+1, j-1, m, n) + 
            connectedcell(a,b, i+1, j, m, n) + 
            connectedcell(a,b, i+1, j+1, m, n);
    }
}