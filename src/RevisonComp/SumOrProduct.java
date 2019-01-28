package RevisonComp;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        int n;
        int sum=0;
        int prod=1;
        int m;
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number uptill you wish to find the sum ");
        n=s.nextInt();
        System.out.println("Enter the choice you wish to make 1: sum of number 2:product of numbers");
        m=s.nextInt();
        if(m==1){
            for(i=1;i<=n;i++) {
                sum=sum+i;
            }
            System.out.println("The sum of numbers is: " + sum);
        }else{
            for(i=1;i<=n;i++){
                prod=prod*i;
            }
            System.out.println("The product of numbers is:" +prod);
        }
    }
}
