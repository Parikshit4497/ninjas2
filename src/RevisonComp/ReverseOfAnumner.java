package RevisonComp;

import java.util.Scanner;

public class ReverseOfAnumner {
    public static void main(String[] args) {
        int num=0,a,result=0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>0){
            a=num%10;
            num=num/10;
            result=result*10+a;

        }
        System.out.println(result);
    }
}
