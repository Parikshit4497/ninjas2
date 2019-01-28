package Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone=new DeskPhone(12345);
        /*DeskPhone timsPhone=new DeskPhone(123123)*/
        /*What we have done in the following lines is not allowed as it overrides all the methods
         * of the interface .We cannot do this because we are defining the interface but the actual class implementation is done
          * in the class of particular type of telephone*/
       /* ITelephone timsPhone=new ITelephone() {

            @Override
            public void powerOn() {

            }

            @Override
            public void dial(int phoneNumber) {

            }

            @Override
            public void answer() {

            }

            @Override
            public boolean callPhone(int phoneNumber) {
                return false;
            }

            @Override
            public boolean isRinging() {
                return false;
            }
        }*/
        timsPhone.powerOn();
        timsPhone.answer();
        timsPhone.callPhone(12345);
        timsPhone.answer();
        timsPhone=new MobilePhone(24565);
        /*we are able to create a different object because both of them represent
        * the same interface*/
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();

    }
}
