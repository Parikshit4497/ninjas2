package Lecture1;


import java.util.Scanner ;

public class Question7 {
    public static void main(String[] args) {
        int num ,sum=0,a;
        Scanner input= new  Scanner(System.in);
        System.out.println("Enter the number the reverse of which you wish to find out:");
        num=input.nextInt();
        while(num>0)
        {
            a=num%10;
            num=num/10;
            sum=sum*10+a;
        }
     System.out.println("The reverse of the number is:" + sum);

    }
}
