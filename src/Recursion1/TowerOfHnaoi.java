package Recursion1;

import java.util.Scanner;

/**
 * Created by hp on ३०-०६-२०१७.
 */
public class TowerOfHnaoi {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of disks");
        n=s.nextInt();
        char source;
        char destination;
        char auxilary;
        System.out.println("Enter the name of the source rod");
        source=s.next().charAt(0);
        System.out.println("Enter the name of the auxilary rod");
        auxilary=s.next().charAt(0);
        System.out.println("Enter the name of the destination rod");
        destination=s.next().charAt(0);
        towerOfHanoi(n,source,auxilary,destination);

    }
    public static void towerOfHanoi(int n,char source,char auxilary,char destination)
    {
        if(n==1)
        {
            System.out.println("Move disk " + n + " from "+ source+ " to " + destination);
            return ;
        }
        towerOfHanoi(n-1,source,destination,auxilary);
        System.out.println("Move disk " + n + " from "+ source + " to " + destination);
        towerOfHanoi(n-1,auxilary,source,destination);
    }
}
