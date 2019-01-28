package OOPSPRACT.StaticandInterface;

class finalValidation {
    static boolean mobileValidation(String mobile) {

        if (mobile.length() == 10) {
            for (int i = 0; i < mobile.length(); i++) {
                char singleChar = mobile.charAt(i);
                if (!Character.isDigit(singleChar)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    static  boolean  isBlank(String userName){

        if(userName==null){
            return true;
        }
        if(userName!=null&&userName.trim().length()==0){
            return true;
        }
       return false;
    }
}
public class StaticMethodDemo {
    public static void main(String[] args) {
      finalValidation f1=new finalValidation();
      String result=finalValidation.mobileValidation("9810980101")?"Is A Valid Number":"Is Invalid Number";
      System.out.println("The result is " + result);
      result=f1.mobileValidation("98109")?"Is A Valid Number":"Is Invalid Number";
      System.out.println("The result is " + result);

      String check="  Amit Rawat  ";
        System.out.println("The string is empty " + finalValidation.isBlank(check));
        check="      ";
        System.out.println("The string is empty " + finalValidation.isBlank(check));
    }
}

