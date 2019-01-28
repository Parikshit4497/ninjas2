package Lecture1;

import java.util.Scanner;

/**
 * Created by hp on १४-०६-२०१७.
 */
public class Question3 {
    public static void main(String[] args) {
        float basic,dr,hra,pf,t_sal;
        int allowance ;
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the basic sal:");
        basic=input.nextFloat();
        System.out.println("Enter the grade of the employee:");
        grade=input.next().charAt(0);

        dr=0.20f*basic;
        hra=0.50f*basic;
        pf=0.11f*basic;
        if(grade=='A')
        {
            allowance=1700;
        }
        else if(grade=='B')
        {
            allowance=1500;
        }
        else
        {
            allowance=1300;
        }
        t_sal=basic+hra+dr+allowance-pf;
        System.out.println("The total salary of the person is:" + t_sal);

    }
}

