package OOPSPRACT.Inheritance;

class Loan{
    void applyForLoan(){
        System.out.println("Apply for loan ");
    }
    void score(){
        System.out.println("Score compute ");
    }
    void emi(){
        System.out.println("Compute emi for 12 month period ");
    }
}
class HomeLoan extends  Loan{
    void emi(){
        System.out.println("Home loan emi  for long period");
    }
    void lessRisk(){
        System.out.println("Sell property for high return ");
    }

}
class AutoLoan extends Loan{
              void emi(){
                  System.out.println("Car loan emi for short period ");
              }
               void highrisk(){
                   System.out.println("High risk due to low resale value of car ");
               }
}

public class LoanCaller {
    void callMe(Loan loan){

        loan.applyForLoan();
        loan.score();
        if(loan instanceof HomeLoan){
            HomeLoan home=(HomeLoan)loan;
            home.emi();
            home.lessRisk();
        }else if(loan instanceof AutoLoan){
            AutoLoan auto=(AutoLoan)loan;
            auto.emi();
            auto.highrisk();
        }
    }
    public static void main(String[] args) {
       LoanCaller loan=new LoanCaller();
       loan.callMe(new HomeLoan());
       loan.callMe(new AutoLoan());
    }
}
