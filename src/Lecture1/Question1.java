package Lecture1;

/**
 * Created by hp on १५-०६-२०१७.
 */
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {

                float  m1;
                float  m2;
                float m3;
                float avg;
                float  f1;
                float  f2;
                String name;
                Scanner user_input = new Scanner(System.in);
                Scanner user_marks = new Scanner(System.in);
                System.out.println("Enter the name of the person:");
                name = user_input.next();
                System.out.println("Enter the marks in first subject :");
                m1 = user_marks.nextInt();
                System.out.println("Enter the marks in second subject :");
                m2 = user_marks.nextInt();
                System.out.println("Enter the marks in third subject :");
                m3 = user_marks.nextInt();
                if (m1 > m2 && m1 > m3) {
                    f1 = m1;
                    if (m2 > m3) {
                        f2 = m2;
                    } else {
                        f2 = m3;
                    }
                } else if (m2 > m3 && m2 > m1) {
                    f1 = m2;
                    if (m1 > m3) {
                        f2 = m1;
                    } else {
                        f2 = m3;
                    }
                } else {
                    f1 = m3;
                    if (m1 > m2) {
                        f2 = m1;
                    } else {
                        f2 = m2;
                    }
                }
                avg = (f1 + f2) / 2;
                System.out.println("The name of the student is: " + name + " The average marks of the best two subject are :" + avg);
            }
        }



