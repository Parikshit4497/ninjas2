package RevisionCodingNinjas.Recursion2;

import java.util.Scanner;

public class StairCase {
    public static int stepsTaken(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 3;
        }
        return  stepsTaken(n-1)+stepsTaken(n-2)+stepsTaken(n-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The number of of possible combination of steps " +stepsTaken(n));
    }
}
