public class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
    boolean row=true;
        boolean column=true;
        if(a[0][0]==1)
        {
            return 0;
        }
        for(int  i=0,j=0;i<a.length;i++)
        {
            if(a[i][j]==0 && row)
            {
                a[i][j]=1;
            }
            else
            {
                row=false;
                a[i][j]=0;
            }
        }
        for(int  i=0,j=1;j<a[0].length;j++)
        {
            if(a[i][j]==0 && column)
            {
                a[i][j]=1;
            }
            else
            {
                column=false;
                a[i][j]=0;
            }
        }
        for(int i=1;i<a.length;i++)
        {
            for(int j=1;j<a[0].length;j++)
            {
                if(a[i][j]==1)
                {
                    a[i][j]=0;
                }
                else
                {
                    a[i][j]=a[i-1][j]+a[i][j-1];
                }
            }
        }
        return a[a.length-1][a[0].length-1];
    }
}