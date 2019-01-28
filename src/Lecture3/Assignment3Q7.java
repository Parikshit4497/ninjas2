package Lecture3;

/**
 * Created by hp on १४-०६-२०१७.
 */
import java.util.Scanner ;
public class Assignment3Q7 {
    public static void main(String[] args) {


        int n, a, i, j, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elelments in the array :");
        n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the  elements of the array :");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (i = 0; i < n; i++) {
            a = arr[i];
            b=0;
            for (j = 0; j < n; j++) {
                if (arr[j] == a) {
                    b++;

                }

            }
            if (b==1) {
                System.out.println("The first non repeating number in the array:" + a);
                break;
            }

        }

    }
}
