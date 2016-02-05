import java.util.*;
public class QuickSort {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        quicksort(a,0,a.length-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }

    public static void quicksort(int[] a, int first, int last) 
    {
        
        int  i,j,pivot;
        if(first<last)
        {
            i=first;
            j=last;
            pivot= first;
            while(i<j)
            {
                while(a[i]<=a[pivot] && i<last)
                    i++;
                while(a[j]>a[pivot])
                    j--;
                if(i<j)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            int temp=a[pivot];
            a[pivot]=a[j];
            a[j]=temp;
             quicksort(a, first, j-1);
             quicksort(a, j+1, last);

        }
    }
    
}