import java.io.*;
import java.util.*;


public class CompareSortingAlgo {

    public static void insertionSort(int[] ar)
    {       
           for(int i=1;i<ar.length;i++)
           {
               int temp=ar[i];
               int j;
                for(j=i-1;j>=0 && ar[j]>temp;j--)
                {
                       ar[j+1]=ar[j];
                    count1++;
                }
                ar[j+1]=temp;
           }
    }  
    static int count1=0;
    static int count2=0;
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++)
       {
            ar[i]=in.nextInt(); 
       }
       int[] qa=new int[s];
       for(int i=0;i<s;i++)
       {
            qa[i]=ar[i]; 
       }
       insertionSort(ar);
       quicksort(qa,0,s-1); 
       System.out.print(count1-count2);
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
            count2++;
            int temp=a[i];
            a[i]=a[partitionindex];
            a[partitionindex]=temp;
            partitionindex++;
        }
    }
    count2++;
    int temp=a[partitionindex];
    a[partitionindex]=a[end];
    a[end]=temp;
    return partitionindex;
}
}