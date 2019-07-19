package RevisionCodingNinjas.ProgrammingFundamental2b;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int sum=0,product=1;
        int n=0,i=0;
        String option="";
        n=s.nextInt();
        s.nextLine();
        option=s.nextLine();
        if(option.equalsIgnoreCase("sum")){
            for(i=0;i<=n;i++){
                sum=sum+i;
            }
            System.out.println("The sum is" +sum);

        }else if(option.equalsIgnoreCase("product")){
            for(i=1;i<n;i++){
                product=product*i;
            }
            System.out.println("The product is" +product);
        }


    }
}
