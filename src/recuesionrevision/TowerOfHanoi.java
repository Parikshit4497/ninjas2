package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ११-०८-२०१७.
 */
public class TowerOfHanoi {
    public void TowerOfCreate(int n,char source,char helper,char destination)
    {
        if(n==1)
        {
            System.out.println("Disk n:" + n + " From Source : " + source + " To destination :" + destination );
        }
        else
        {
            TowerOfCreate(n-1,source,destination,helper);
            System.out.println("Disk n:" + n + " From Source : " + source +" To destination :" + destination );
            TowerOfCreate(n-1,helper,source,destination);
        }

    }
}
class towerUse
{
    public static void main(String[] args) {
        TowerOfHanoi t1=new TowerOfHanoi();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of disks :");
        int n=s.nextInt();
        System.out.println("Enter the source rod:");
        char source =s.next().charAt(0);
        System.out.println("Enter the helper rod:");
        char helper=s.next().charAt(0);
        System.out.println("Enter the destination rod:");
        char destination=s.next().charAt(0);
        t1.TowerOfCreate(n,source,helper,destination);


    }
}