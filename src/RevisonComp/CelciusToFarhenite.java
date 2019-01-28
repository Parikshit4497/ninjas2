package RevisonComp;

import java.util.Scanner;

public class CelciusToFarhenite {
    public static void main(String[] args) {
        int c,f;
        int st,fi;
        int w;
        int i=0;
        Scanner s=new Scanner(System.in);
        st=s.nextInt();
        fi=s.nextInt();
        w=s.nextInt();
        for(f=st;f<=fi;f=f+w){
            c=(int)((5.0/9)*(f-32));
            System.out.println(f+" "+c);


        }
    }
}
