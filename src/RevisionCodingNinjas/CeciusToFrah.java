package RevisionCodingNinjas;

import java.util.Scanner ;
public class CeciusToFrah {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double cel ;
        double st_f;
        double end_f;
        double step_size;
        System.out.println("Enter the starting point of farhenite scale");
        st_f=s.nextDouble();
        System.out.println("Enter the end point of farhenite scale :");
        end_f=s.nextDouble();
        System.out.println("Enter the step size: ");
        step_size=s.nextDouble();
        for(double i=st_f;i<=end_f;i+=step_size)
        {
            cel=(i-32)*9/5;
            System.out.println("Fahrenheit :"+ i +" Corresponding Celsius" + cel);
        }
    }
}
