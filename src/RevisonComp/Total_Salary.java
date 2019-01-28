package RevisonComp;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Scanner;

public class Total_Salary {
    public static void main(String[] args) {
        int basic =0;
        float hr,da,pf;
        int allow=0;
        float t_sal=0;
        float fbasic=0;
        char grade;
        Scanner s=new Scanner(System.in);
         basic=s.nextInt();
         grade=s.next().charAt(0);
         fbasic=(float)basic;
         hr=(float)0.20*fbasic;
         da=(float)0.50*fbasic;
         pf=(float)0.11*fbasic;
         if(grade=='A'){
             allow=1700;
         }else if(grade=='B'){
             allow=1500;
         }
         else if(grade=='C'){
             allow=1300;
         }
         t_sal=fbasic+hr+da+allow-pf;
        System.out.println("The total salary is :" +Math.round(t_sal));

    }
}
