import java.util.Scanner;

public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
        int num=in.nextInt();
        int x=in.nextInt();
        int y=in.nextInt();
        if(x==y)
        {
            System.out.println((num-1)*x+" ");
            continue;
        }
        if(x>y)
        {
            int temp=x;
            x=y;
            y=temp;
        }
        for(int i=num-1,j=0;j<num;i--,j++)
        {
            System.out.print((x*i)+(y*j)+" ");
        }
        System.out.println();
        }
    }
    
}