package challenge;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
       Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the account holder:");
        b1.setName(s.nextLine());
        System.out.println("Enter the account number of the account holder:");
        b1.setAcc_number(s.nextLong());
        System.out.println("Enter the email id of the account : ");
        b1.setEmail_id(s.next());
        System.out.println("Enter the phone number of the account holder:");
        b1.setPhone_num(s.nextLong());

        System.out.println("The name of the account holder is: "+ b1.getName());
        System.out.println("The account number of the account holder is:"+ b1.getAcc_number());
        System.out.println("The email is of the account holder is:" + b1.getEmail_id());
        System.out.println("The phone number of the account holder is: "+ b1.getPhone_num() );
        System.out.println("Enter the amount that you wish to deposit :");
        b1.Deposit_Acc(s.nextDouble());
        System.out.println("Enter the amount that you wish to withdraw");
        b1.Widrawl_Acc(s.nextDouble());
    }
}
