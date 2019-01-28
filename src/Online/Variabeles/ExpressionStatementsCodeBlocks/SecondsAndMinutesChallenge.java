package Online.Variabeles.ExpressionStatementsCodeBlocks;

import java.util.Scanner;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
           int seconds ;
           int minutes;
           Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        minutes=s.nextInt();
        System.out.println("Enter the number of seconds");
        seconds=s.nextInt();
        if(getDurationString(minutes,seconds)=="Invalid Value")
        {
            System.out.println("The string returns invalid value");
        }
        else{
            System.out.println("The duration string is:" + getDurationString(minutes,seconds) );
        }
        System.out.println("Enter the number of seconds");
        seconds=s.nextInt();
        if (getDurationString(seconds)=="Invalid Value"){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println("The string duration is:" +getDurationString(seconds));
        }
    }
    public static  String getDurationString(int minutes ,int seconds)
    {
        int nhours;
        int nminutes;
        int nseconds;
        String getduration;
        if(minutes>=0&&seconds>=0)
        {
                 nhours=minutes/60;
                 nminutes=minutes%60+seconds/60;
                 if(nminutes>=60)
                 {
                     nhours=nminutes/60;
                     nminutes=nminutes%60;
                 }
                 nseconds=seconds%60;
            getduration=nhours+"h"+nminutes+"m"+nseconds+"s";
             return getduration;
        }else{
            return  "Invalid Value";
        }
    }
    public static  String getDurationString(int seconds)
    {
        int nminutes;
        int nseconds;
        int nhours=0;
        String getduration;
        if(seconds>=0)
        {
            nminutes=seconds/60;
            nseconds=seconds%60;
            if(nminutes>=60) {
                nhours = nminutes / 60;
                nminutes=nminutes%60;
            }
            getduration= nhours+"h"+nminutes+"m"+nseconds+"s";
            return getduration;
        }
        else{
            return  "Invalid String";
        }
    }
}
