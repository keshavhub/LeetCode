import java.util.*;
public class FindMedian {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int length=n/2;
        quicksort(a,0,n-1,length);
        System.out.print(a[n/2]);
    }
    
public static void quicksort(int[] a,int start,int end, int length)
{
    if(start<end)
    {
    int partitionindex=sortfunc(a,start,end);
    if(partitionindex==length)
    {
        System.out.print(a[partitionindex]);
        System.exit(0);
    }
    quicksort(a, start, partitionindex-1, length);
    quicksort(a, partitionindex+1, end, length);
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
    return partitionindex;
}
}