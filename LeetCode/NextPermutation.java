public class Solution {
    public void nextPermutation(int[] a) {
        int k=-1;
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]>a[i-1])
            {
                  k=i-1;
                  break;
            }
        }
        if(k==-1)
        {
          Arrays.sort(a);
          return ;
        }
        int d=-1;
        int min=Integer.MAX_VALUE;
        for(int i=k+1;i<a.length;i++)
        {
            if(a[i]>a[k] && a[i]<min)
            {
                min=a[i];
                d=i;
            }
        }
        int temp=a[k];
        a[k]=a[d];
        a[d]=temp;
        Arrays.sort(a,k+1,a.length);
        return;
            
    }
    
}