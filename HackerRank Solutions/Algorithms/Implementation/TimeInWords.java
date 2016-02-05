import java.util.*;
public class TimeInWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] hr=new String[14];
            hr[1]= "one";
            hr[2]="two";
            hr[3]="three";
            hr[4]="four";
            hr[5]="five";
            hr[6]="six";
            hr[7]="seven";
            hr[8]="eight";
            hr[9]="nine";
            hr[10]="ten";
            hr[11]="eleven";
            hr[12]="twelve";
            hr[13]="one";
        
        String[] min=new String[31];
        
            min[1]="one minute";
            min[2]="two minutes";
            min[3]="three minutes";
            min[4]="four minutes";
            min[5]="five minutes";
            min[6]="six minutes";
            min[7]="seven minutes";
            min[8]="eight minutes";
            min[9]="nine minutes";
            min[10]="ten minutes";        
            min[11]="eleven minutes";
            min[12]="twelve minutes";
            min[13]="thirteen minutes";
            min[14]="fourteen minutes";
            min[15]="quarter";
            min[16]="sixteen minutes";
            min[17]="seventeen minutes";
            min[18]="eighteen minutes";
            min[19]="nineteen minutes";
            min[20]="twenty minutes";
            min[21]="twenty one minutes";
            min[22]="twenty two minutes";
            min[23]="twenty three minutes";
            min[24]="twenty four minutes";
            min[25]="twenty five minutes";
            min[26]="twenty six minutes";
            min[27]="twenty seven minutes";
            min[28]="twenty eight minutes";
            min[29]="twenty nine minutes";
            min[30]="half";
        
        int hour=in.nextInt();
        int minute=in.nextInt();
        if(minute==0)
            System.out.print(hr[hour]+" o' clock");
        else if(minute<=30)
            System.out.print(min[minute]+" past "+hr[hour]);
        else
            System.out.print(min[60-minute]+" to "+hr[hour+1]);
        
    }
    
}
