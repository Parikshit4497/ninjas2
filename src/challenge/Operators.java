package challenge;

public class Operators {
    public static void main(String[] args) {
        double var1 = 20;
        double var2 = 80;
        double result = (var1 + var2) * 25;
        if (result % 40 <= 20) {
            System.out.println("Total was over the limit");
        } else {
            System.out.println("The total was over the limit:");
        }
    }
}
