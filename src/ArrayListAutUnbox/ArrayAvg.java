package ArrayListAutUnbox;

import java.util.Scanner;

public class ArrayAvg {
    private static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers=getIntegers(5);
        for(int i=0;i<myIntegers.length;i++)
        {
            System.out.println("Elements " + i+ ",typed values was :" + myIntegers[i]);
        }
        System.out.println("The average of teh elements that have been entered are :" +getAverage(myIntegers));

    }
    public static  int [] getIntegers(int number)
    {
        System.out.println("Enter " + number + "Integer values. \r ");
        int []values =new int[number];
        for(int i=0;i<values.length;i++)
        {
            values[i]=s.nextInt();
        }
        return  values;
    }
    public static  double getAverage(int array[])
    {
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}
