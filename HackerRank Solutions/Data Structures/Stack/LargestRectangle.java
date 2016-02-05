import  java.util.*;
public class Solution{
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int[] houses=new int[N];
        for(int i=0;i<N;i++)
        {
            houses[i]=in.nextInt();
        }
        System.out.print(largestarea(houses,N));
    }
    
public static int largestarea(int[] houses, int n)
{
    Stack<Integer> height=new Stack<Integer>();
    Stack<Integer> index=new Stack<Integer>();
    int maxarea=0;
    for(int i=0;i<houses.length;i++)
    {
        if(height.isEmpty() || height.peek()<houses[i])
        {
            height.push(houses[i]);
            index.push(i);
        }
        else if(height.peek()>houses[i])
        {
            int lastindex=0;
            while(!height.isEmpty() && height.peek()>houses[i])
            {
                int kk=height.pop();
                lastindex=index.pop();
                int area=kk*(i-lastindex);
                if(area>maxarea)
                    maxarea=area;
            }
            height.push(houses[i]);
            index.push(lastindex);
            }
        }
    while(!height.isEmpty())
            {
                int kk=height.pop();
                int area=kk*(houses.length-index.pop());
                if(area>maxarea)
                    maxarea=area;
            }
    return maxarea;
    }
}