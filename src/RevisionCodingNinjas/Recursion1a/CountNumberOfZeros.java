package RevisionCodingNinjas.Recursion1a;

import java.util.Scanner;

public class CountNumberOfZeros {
    public static int countNumberOfZeroes(int data){
        if(data==0){
            return 0;
        }
        if(data%10==0){
            int smallAns=countNumberOfZeroes(data/10);
            int result=smallAns+1;
            return result;
        }else {

            int smallAns = countNumberOfZeroes(data / 10);
            int result = smallAns + 0;
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();

        System.out.println("The number of zeroes " + countNumberOfZeroes(data));
        sc.close();
    }
}
