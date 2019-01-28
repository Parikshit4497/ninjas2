package Online.Variabeles.Class;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
          /*BankAccount b1=new BankAccount();*/
        BankAccount b1=new BankAccount(12345,4432646,"ram","ram@gmail.com",54756876);
        int n;
        BankAccount b2=new BankAccount();
        Scanner s=new Scanner(System.in);
        while(1<2)
        {
            System.out.println("Enter the option you wish to choose :");
            System.out.println("1 .Enter the details of the employee:");
            System.out.println("2. Get the details of your employee :");
            System.out.println("3.  Deposit money :");
            System.out.println("4.  Withdraw:");
            System.out.println("5. exit");
            n=s.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the name of the person");
                    b1.setName(s.next());
                    System.out.println("Enter the name of the account number :");
                    b1.setNumber(s.nextLong());
                    System.out.println("Enter the email of the person");
                    b1.setEmail(s.next());
                    System.out.println("Enter the phone number");
                    b1.setPhoneNo(s.nextLong());
                    break;
                case 2:
                    System.out.println("The name of the employee is: " + b1.getName());
                    System.out.println("The account number is: "+ b1.getNumber());
                    System.out.println("The email address is :" +b1.getEmail());
                    System.out.println("The phone number is:" +b1.getPhoneNo());
                    System.out.println("The balance of the account is: " +b1.getBalance());
                    break;
                case 3:
                    System.out.println("Enter the amount of money you wish to deposit :");
                    b1.depositFunds(s.nextDouble());
                    break;
                case 4:
                    System.out.println("Enter the amount of money you wish to withdraw");
                    double amount=s.nextDouble();
                    double balance=b1.widrawFunds(amount);
                   if(balance==-1 ){
                       System.out.println("The amount of money is too less");
                   }else{
                       System.out.println("The amount in your account after withdrawl is " +balance);
                   }
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}
