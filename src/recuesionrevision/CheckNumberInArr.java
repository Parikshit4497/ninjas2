package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class CheckNumberInArr {
    public boolean checkPresence(int arr[],int x,int index)
    {
        if(arr.length==index)
        {
            return false ;
        }
        if(arr[index]==x)
        {
            return true;

        }
        return checkPresence(arr,x,index+1);

    }
}
class checkUse
{
    public static void main(String[] args) {
        CheckNumberInArr c1 =new CheckNumberInArr();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elemnts in the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number x that you wish to see exist in the array");
        int x=s.nextInt();
        boolean result =c1.checkPresence(arr,x,0);
        System.out.println("Is the number present in the array :" + result  );


    }
}
