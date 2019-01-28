package RevisonComp;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int num;
        int sume=0;
        int sumodd=0;
        int a;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>0)
        {
            a=num%10;
            if(a%2==0){
                sume=sume+a;
            }else{
                sumodd=sumodd+a;
            }
            num=num/10;
        }
        System.out.println("The sum of even numbers is:" +sume);
        System.out.println("The sum of odd numbers is:" + sumodd);
    }
}
