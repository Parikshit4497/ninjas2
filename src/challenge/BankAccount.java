package challenge;

public class BankAccount {
    private String name="";
    private long acc_number;
    private long phone_num;
    private  double balance;
    private String email_id="";
    public  double netbalance;
/*
    BankAccount()
    {
        this("raju ",9989989,45728588," parikshit4497@gmail.com" );
    }
    public  BankAccount(String name,long acc_number,long phone_num,String email_id)
    {
        this.name = name;
        this.email_id =email_id;
        this.phone_num=phone_num;
        this.acc_number=acc_number;
    }*//*  if we are assigning values using a constructor and there is  a situation where we do not pass any parameters then
    the first constructor containing this will get executed which will call a constructor within a constructor and set default values:*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public long getAcc_number() {
        return acc_number;

    }

    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(long phone_num) {
        this.phone_num = phone_num;
    }
    public void  Deposit_Acc(double value)
    {
     this.netbalance=this.netbalance+value;
        System.out.println("The net balance in your account is:" + this.netbalance);

    }
    public  void Widrawl_Acc(double value)
    {
        if(this.netbalance>1000)
        {
            this.netbalance=this.netbalance-value;
            System.out.println("The balance after withdrawal is: " + this.netbalance);
        }
        else {
            System.out.println("The amount in your bank is to less for withdrawal:");
        }
    }
}
