package Lecture3;

/**
 * Created by hp on १३-०६-२०१७.
 */
import java.util.Scanner ;
public class ArraySear1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);
        int i, num1, index;
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number which you to find in the array :");
        num1 = input.nextInt();
        index = arrsea(arr, num1);

            System.out.println("The index of the number in the array is:" + index);

    }

    public static int arrsea(int arr[], int num1) {
        int i, n = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                System.out.println("The number is prsesent in the array :");
                break;

            } else {
                System.out.println("The number is prsesent in the array :");
            }
        }
     return i;
    }
}

