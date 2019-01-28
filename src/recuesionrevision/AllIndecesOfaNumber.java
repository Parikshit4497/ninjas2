package recuesionrevision;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hp on ०९-०८-२०१७.
 */
public class AllIndecesOfaNumber {
    public ArrayList findindexes(int arr[],int index,int x,ArrayList<Integer> al2)
    {

        if(arr.length==index)
        {
            return al2;
        }
        if(arr[index]==x)
        {
            al2.add(index);
        }
        findindexes(arr,index+1,x,al2);

      return al2;
    }
}
class AllindecesUse
{
    public static void main(String[] args) {
        AllIndecesOfaNumber a1=new AllIndecesOfaNumber();
        ArrayList al;
        ArrayList<Integer> al2=new ArrayList <>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number whose indexes you wish to find ");
        int x=s.nextInt();
        al=a1.findindexes(arr,0,x,al2);
        System.out.println("All the indexex of the number are :" + al );


    }
}
