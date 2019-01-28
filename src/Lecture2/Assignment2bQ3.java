package Lecture2; /**
 * Created by hp on १२-०६-२०१७.
 */

import java.util.Scanner;

public class Assignment2bQ3 {
    public static void main(String[] args) {
        int num,a,i=0;
        double sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the binary number :");
        num=input.nextInt();
        while(num>0)
        {
            a=num%10;
            num=num/10;

            sum = sum + a * Math.pow(2, i);
            i++;
            }
            System.out.println("The number after bainary too decimal conversion is:" + sum);
        }


    }

