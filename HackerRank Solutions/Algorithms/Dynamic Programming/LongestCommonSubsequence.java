import java.util.*;
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=in.nextInt();
        }
        int[] answer=LCS(a,b,a.length,b.length);
        for(int i=0;i<answer.length;i++)
            System.out.print(answer[i]+" ");
    }
    
public static int[] LCS(int[] a, int[] b,int n, int m)
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
            else if(a[i-1]==b[j-1])
            {
                result[i][j]=result[i-1][j-1]+1;
            }
            else
            {
                result[i][j]=Math.max(result[i-1][j], result[i][j-1]);
            }
        }
    }
    
    /* for(int i=0;i<n+1; i++)
    {
        for(int j=0;j<m+1;j++)
        {
            System.out.print(result[i][j]);
        }
        System.out.println();
    } */
    int[] answer=new int[result[n][m]];
    int len=answer.length;
    int i=n; int j=m;
    while(result[i][j]!=0)
    {
        if(result[i][j]==result[i-1][j])
                {
                    i=i-1; 
                }
            else
                    if(result[i][j]==result[i][j-1])
                    {
                        j=j-1;
                    }
                    else 
                        if(result[i][j]==result[i-1][j-1]+1)
                        {
                            answer[len-1]=a[i-1];
                            //System.out.print(answer[len-1]+" ");
                            len--;
                            i=i-1; j=j-1;
                        }
    }
    //System.out.println();
 
    return answer;
}
}