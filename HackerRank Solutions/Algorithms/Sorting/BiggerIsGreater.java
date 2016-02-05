import java.util.*;
import java.io.*;
public class BiggerIsGreater {

    public static void main(String[] args) throws IOException {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Integer t=Integer.parseInt(in.readLine());
        while(t!=0)
        {
        String s=in.readLine();
        int i;
        char ch[]=s.toCharArray();
        for(i=ch.length-2;i>=0;i--)
        {
            if(ch[i]<ch[i+1])
                break;
        }
        if(i==-1)
        {
            sb.append("no answer\n");
            t--;
            continue;
        }
        int k=i+1;
        for(int j=i+2;j<ch.length;j++)
        {
            if(ch[j]>ch[i] && ch[j]<ch[k])
                k=j;
        }
        char temp=ch[k];
        ch[k]=ch[i];
        ch[i]=temp;
        Arrays.sort(ch, i+1, ch.length);
        sb.append(ch).append("\n");
        
        t--;
        }
        System.out.println(sb);
        
    }
    
}