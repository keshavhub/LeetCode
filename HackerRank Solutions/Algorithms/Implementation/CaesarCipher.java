
package caesarcipher;

import java.util.*;
public class CaesarCipher {
public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=Integer.parseInt(in.nextLine());
            String s=in.nextLine();
            int n=Integer.parseInt(in.nextLine());
            if(n>26)
                n=n%26;
            char[] ch=s.toCharArray();
            for(char c:ch)
                {
                int k=c;
                if(k>=65 && k<=90)
                    {
                        k=k+n;
                    if(k>90)
                        k=64+(k-90);
                    char d=(char) k;
                    System.out.print(d);
                    }
                else
                    if(k>=97 && k<=122)
                    {
                        k=k+n;
                    if(k>122)
                        k=96+(k-122);
                    
                        
                    char d=(char) k;
                    System.out.print(d);
                    }
                else
                    System.out.print(c);
                }
        }
    }