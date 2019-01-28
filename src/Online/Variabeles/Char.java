package Online.Variabeles;

public class Char {
    public static void main(String[] args) {
        char mychar='a';
        /*can store unicode as well get unicodes from  unicode-table*/
        char copyright='\u00A9';
        System.out.println("Unicode output was:" + copyright);
        String myString ="This is myString ";
        System.out.println("mystring is equal to " +myString);
        myString=myString+",and this is more.";
        System.out.println(" mystring is equal to " +myString);
        myString=myString+"\u00A9 2015";
        System.out.println("mystring is equal to " +myString);
        String numberString="250.55";
        numberString=numberString+"49.55";
        System.out.println("The result is " + numberString);
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        double doublenumber=120.47;
        lastString=lastString+doublenumber;
        System.out.println("Last string is equal to " + lastString);
        /*string on left int on right it will get converted into string*/

    }
}
