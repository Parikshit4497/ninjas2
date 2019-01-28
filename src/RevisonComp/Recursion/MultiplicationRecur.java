package RevisonComp.Recursion;

import java.util.Scanner;

public class MultiplicationRecur {
    public static int multiplyNum(int n,int m){
        if(m==0){
            return 0;
        }
        if(m==1){
            return n;
        }
        return multiplyNum(n,m-1)*n;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int result=multiplyNum(n,m);
        System.out.println("The result of multiplication is " + result);
    }
}
