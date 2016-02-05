import java.util.*;
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length();
        int row=(int) Math.floor(Math.sqrt(len));
        int column= (int) Math.ceil(Math.sqrt(len));
        while(row*column<len)
        {
            row++;
        }
        char[][] sa=new char[row][column];
        
        int p=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                sa[i][j]='\0';
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                sa[i][j]=str.charAt(p);
                p++;
                if(p==len)
                    break;
            }
        }
     /*   for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(sa[i][j]);
            }
            System.out.println(" ");
        }*/
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                if(sa[j][i]=='\0')
                {
                 System.out.print(""); 
                }
                else
                System.out.print(sa[j][i]);
                if(i==(column-1) && j==(row-1))
                {
                    System.exit(0);
                }
            }
            System.out.print(" ");
        }  
        
    }
    
}