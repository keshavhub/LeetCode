import java.util.*;
public class Twostrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t = Integer.parseInt(in.nextLine());
        String[] str1=new String[t];
        String[] str2=new String[t];
        for(int i=0;i<t;i++)
        {
            str1[i]=in.nextLine();
            str2[i]=in.nextLine();
        }
        int p=0;
        while(p<t)
        {
            int count=0;
            char[] s1= str1[p].toCharArray();
            char[] s2= str2[p].toCharArray();
            int a[]=new int[256];
            int b[]=new int[256];
            for(int i=0;i<s1.length;i++)
            {
                a[s1[i]]++;
            }
            for(int j=0;j<s2.length;j++)
            {
                b[s2[j]]++;    
            }
            for(int k=97;k<123;k++)
            {
                if(a[k]>0&&b[k]>0)
                count++;
            }   
            if(count>0)
                System.out.println("YES");
            else
                System.out.println("NO");
            p++;
    }
}
    
}
