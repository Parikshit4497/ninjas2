package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,result=0;
        int num=0;
        num=sc.nextInt();
        while(num>0){
            a=num%10;
            result=result*10+a;
            num=num/10;
        }
        System.out.println("The result of the number is " + result);
    }
}
