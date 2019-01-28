package challenge;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankRe b1 = new BankRe();
        int n;
        Scanner s=new Scanner(System.in);
        while(1<2)
        {
            System.out.println("Enter the the option you wish to choose:");
            System.out.println("1.Create the  a new account :");
            System.out.println("2. Deposit money in the account:");
            System.out.println("3. Withdraw money from the account:");
            System.out.println("4. print the detail of the person:");
            System.out.println("5. create new account 2");
            System.out.println("Enter the option you wish to choose:");
            n=s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the name of the person");
                    b1.setCustName(s.next());
                    System.out.println("Enter the  account number :");
                    long num = s.nextLong();
                    b1.setAcct_num(num);
                    System.out.println("Enter the phone number : ");
                    b1.setPhone_no(s.next());
                    System.out.println("Enter the initial balance ");
                    b1.setBalance(s.nextDouble());
                    System.out.println("Enter the email address");
                    b1.setEmail(s.nextLine());
                    break;
                case 2:
                    System.out.println("Enter the amount to be deposited :");
                    b1.enterAmt(s.nextDouble());
                case 3:
                    System.out.println("Enter the amount to be withdrawn:");
                    b1.widrawAmt(s.nextDouble());
                    break;
                case 4:
                    System.out.println("The name of the person is:" + b1.getCustName());
                    System.out.println("The account number of the person is:" + b1.getAcct_num());
                    System.out.println("The email id of the customer is :" + b1.getEmail());
                    System.out.println("The phone number of the customer is:" + b1.getPhone_no());
                    System.out.println("The current balance is" + b1.getBalance());
                    break;
                case 5:

                    System.out.println("Enter the name of the person");
                    String  name=s.next();
                    System.out.println("Enter the  account number :");
                    long num1 = s.nextLong();
                    System.out.println("Enter the phone number : ");
                    String phone_no=s.next();
                    System.out.println("Enter the initial balance ");
                    double inbal=s.nextDouble();
                    System.out.println("Enter the email address");
                    String email=s.next();
                    BankRe b2=new BankRe(num1,inbal,name,email,phone_no);

                    break;
            }
        }
    }
}
