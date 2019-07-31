package RevisionCodingNinjas.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void printDecreasin(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printDecreasin(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recursion re=new Recursion();
        int n=sc.nextInt();
        re.printDecreasin(n);


        sc.close();
    }
}
