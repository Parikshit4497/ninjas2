package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int numOfDigits(int num){
        if(num==0){
            return 0;
        }
        int smallAns=numOfDigits(num/10);
        int result=smallAns+1;
        return  result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("The number of digits " + numOfDigits(num));
        sc.close();
    }
}
