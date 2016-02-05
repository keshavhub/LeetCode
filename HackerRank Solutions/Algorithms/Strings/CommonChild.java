import java.util.*;
public class Demo {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n=in.nextLine();
        String m=in.nextLine();
        char[] s=n.toCharArray();
        char[] k=m.toCharArray();
        int answer=LCS(s,k,s.length,k.length);
        System.out.print(answer);
    }
    
public static int LCS(char[] s,char[]k, int n, int m)
{
    int[][] result=new int[n+1][m+1];
    for(int i=0;i<n+1; i++)
    {
        for(int j=0;j<m+1;j++)
        {
            
            if(i==0 || j==0)
            {
                result[i][j]=0;
            }
            else if(s[i-1]==k[j-1])
            {
                result[i][j]=result[i-1][j-1]+1;
            }
            else
            {
                result[i][j]=Math.max(result[i-1][j], result[i][j-1]);
            }
        }
        
    }
    return result[s.length][k.length];
}
}