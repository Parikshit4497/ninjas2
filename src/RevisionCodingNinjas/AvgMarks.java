package RevisionCodingNinjas;

import java.util.Scanner;
public class AvgMarks {
    public static void main(String[] args) {
        char name;
        double  marks1;
        double marks2;
        double marks3;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the individual ");
        name=s.nextLine().charAt(0);
        System.out.println("Enter the marks in the first subject :");
         marks1=s.nextDouble();
        System.out.println("Enter the marks in the second subject ");
        marks2=s.nextDouble();
        System.out.println("Enter the marks in the third subject ");
        marks3=s.nextDouble();
        System.out.println("The average marks in the three subject are:"+ (marks1 +marks2 +marks3)/3);
    }
}
