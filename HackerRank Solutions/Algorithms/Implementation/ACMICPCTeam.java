
import java.io.*;
import java.util.*;
public class ACMICPCTeam {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] splited = str.split(" ");
        int n=Integer.parseInt(splited[0]);
        int topic=0;
        int maxtopic=0;
        int teamknown=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=in.nextLine();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                topic=stringcom(s[i],s[j]);
                if(topic>maxtopic)
                {
                    maxtopic=topic;
                    teamknown=1;
                }
                else
                if(topic==maxtopic)
                {
                    maxtopic=topic;
                    teamknown++;
                }    
            }
        }
        System.out.println(maxtopic);
        System.out.println(teamknown);
    }

public static int stringcom(String  s1,String s2)    
{
    int topicknown=0;
    for(int l=0;l<s1.length();l++)
    {
        if(s1.charAt(l)=='1'||s2.charAt(l)=='1')
        {
            topicknown++;
        }
    }
    return topicknown;
}
}
