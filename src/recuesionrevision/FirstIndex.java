package recuesionrevision;

import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class FirstIndex {
 public int search(int arr[],int index,int x)
 {
     if(index==arr.length)
     {
         return 0;

     }
     if(arr[index]==x)
     {
         return index;
     }
     return search(arr,index+1,x);
 }
}
class Use
{
    public static void main(String[] args) {
        FirstIndex f1 =new FirstIndex();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number you wish to search: ");
        int x=s.nextInt();
       int result= f1.search(arr,0,x);
        System.out.println("The first index of the number is:" + result);

    }
}
