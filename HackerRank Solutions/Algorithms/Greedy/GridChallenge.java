import java.util.*;
public class Demo {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Integer t=Integer.parseInt(in.nextLine());
        
        while(t!=0)
        {
            Integer num=Integer.parseInt(in.nextLine());
            boolean result=  true;
            String[] s=new String[num];
            for(int i=0;i<num;i++)
            {
                s[i]=in.nextLine();
                char[] ch=s[i].toCharArray();
                Arrays.sort(ch);
                s[i]= new String(ch);
            }
            for(int i=0;i<num-1;i++)
            {
                for(int j=0;j<num;j++)
                {
                    if(s[i].charAt(j)>s[i+1].charAt(j))
                    {
                        result=false;
                    }
                }
            }
            if(result==true)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}