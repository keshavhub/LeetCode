import java.util.Scanner;
public class Demo {
        public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        LarPer(a,s,0);
        for(int i:a)
            System.out.print(i+" ");
    }

public static void LarPer(int[] a,int s, int i)
{
    if(s==0 || i==a.length)
        return;
    int max=i;
    for(int j=i+1;j<a.length;j++)
    {
        if(a[j]>a[max])
        max=j;
    }
    int temp=a[i];
    a[i]=a[max];
    a[max]=temp;
    if(max==i)
        LarPer(a,s,i+1);
    else
        LarPer(a,s-1,i+1);
}
}