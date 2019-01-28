package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {


    Scanner scanner =new Scanner(System.in);
      int counter=0;
      int sum=0;
    while(1<2){
        int order =counter+1;
        System.out.println("Enter number #" + order +":");
        boolean isAnt=scanner.hasNextInt();
        if(isAnt)
        {
             int number=scanner.nextInt();
             counter++;
             if(counter==10)
             {
                 break;
             }
             sum+=number;
        }
        else{
            System.out.println("Invalid Number");
        }
        scanner.nextLine();

    }
        System.out.println("sum= "+sum);
    scanner.close();

    }
}
