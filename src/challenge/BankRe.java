package challenge;

public class BankRe {
    private  long acct_num;
    private  double balance;
    private String custName;
    private  String email;
    private String phone_no;
    public  BankRe()
    {
        this(56789,2.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor ");
    }
    public BankRe(String  name,String email,String phnumber)
    {
            this(9999,100.55,name,email,phnumber);
    }
    public  BankRe(long acct_num,double balance,String custName,String email,String phone_no)
    {

        this.acct_num=acct_num;
        this.email=email;
        this.phone_no=phone_no;
        this.balance=balance;
        this.custName=custName;
    }

    public double getAcct_num() {
        return acct_num;
    }

    public void setAcct_num(long acct_num) {
        this.acct_num = acct_num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
    public void enterAmt(double amt)
    {
        this.balance=this.balance+amt;
        System.out.println("The net balance in the amount is :"+ this.balance);
    }
    public void widrawAmt(double amt)
    {
        if(this.balance>1000) {
            this.balance =this.balance-amt;
            System.out.println("The net amount in the account is:"+ this.balance);
        }
        else {
            System.out.println("The balance in your account is very less you cannot withdraw it: ");
        }
    }
}
