package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class SumOddRange {
    public static void main(String[] args) {
        int start;
        int end;
        Scanner s=new Scanner (System.in);
        System.out.println("Enter the starting point :");
        start=s.nextInt();
        System.out.println("Enter the ending point");
        end=s.nextInt();
        System.out.println("The sum of the odd numbers in the range is:" +sumIsOdd(start,end));

    }
    public static  int sumIsOdd(int start ,int end)
    {
        int sum=0;
        if((start<=end)&&(start>0&&end>0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum =sum+ i;
                }

            }
        }else{
            return -1;
        }
        return sum;
    }
    public  static boolean isOdd(int i)
    {
        if(i<0)
        {
            return false;
        }
        else{
          if(i%2==1) {
              return true;
          }else{
              return false;
          }
        }
    }
}
