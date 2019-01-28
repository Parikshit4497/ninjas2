package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
     int min=0;
     int max=0;
     boolean first=true;
     while(true)
     {
         System.out.println("Enter the number");
         boolean isAnAnt=scanner.hasNextInt();
         if(isAnAnt)
         {
             int number=scanner.nextInt();
             if(first)
             {
                 first=false;
                 min=number;
                 max=number;
             }
                 if(number>max)
                 {
                     max=number;

                 }
                 if(number<min){
                     min=number;

                 }
                 else{
                     break;
                 }
                 scanner.nextLine();
         }
         else{
             break;
         }
     }
        System.out.println("min="+ min +",max" + max);
       scanner.close();
    }
}
