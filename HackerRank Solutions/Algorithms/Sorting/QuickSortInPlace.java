import java.util.*;
public class QuicksortInPlace {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        quicksort(a,0,n-1);
    }
    
public static void quicksort(int[] a,int start,int end)
{
    if(start<end)
    {
    int partitionindex=sortfunc(a,start,end);
    quicksort(a, start, partitionindex-1);
    quicksort(a, partitionindex+1, end);
    }
}
public static int sortfunc(int a[],int start,int end)
{
    int pivot=a[end];
    int partitionindex=start;
    for(int i=start;i<end;i++)
    {
        if(a[i]<=pivot)
        {
            int temp=a[i];
            a[i]=a[partitionindex];
            a[partitionindex]=temp;
            partitionindex++;
        }
    }
    int temp=a[partitionindex];
    a[partitionindex]=a[end];
    a[end]=temp;
    for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    System.out.println();
    return partitionindex;
}
    
}