import java.util.*;
public class CavityMap {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t=Integer.parseInt(in.nextLine());
        int[][] a=new int[100][100];
        String[] s=new String[t];
        for(int i=0;i<t;i++)
        {
            s[i]=in.nextLine();
        }
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<t;j++)
            {
                
                a[i][j]= Integer.parseInt(String.valueOf(s[i].charAt(j)));
            }
            
        }
       for(int i=1;i<=t-2;i++)
        {
            for(int j=1;j<=t-2;j++)
            {
                if(a[i][j]>a[i][j-1] && a[i][j]>a[i-1][j] && a[i][j]>a[i][j+1] && a[i][j]>a[i+1][j])
                {
                    a[i][j]= 'X';
                }
            }
        }
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<t;j++)
            {
                if(a[i][j]==88)
                {
                    System.out.print("X");
                }
                else 
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}