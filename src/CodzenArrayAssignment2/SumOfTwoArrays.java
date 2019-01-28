package CodzenArrayAssignment2;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int i, j, m, n;

        Scanner s = new Scanner(System.in);
        System.out.println("Size of first array");
        n = s.nextInt();
        int arr1[] = new int[ n ];
        System.out.println("Enter the elemnts of the first array: ");
        for (i = 0; i < n; i++) {
            arr1[ i ] = s.nextInt();
        }
        System.out.println("Size of second array");
        m = s.nextInt();
        int arr2[] = new int[ m ];

        System.out.println("Enter the elemnts of the second array: ");
        for (j = 0; j < m; j++) {
            arr2[ j ] = s.nextInt();
        }

        sumOfTwoArrays(arr1, arr2);

    }

    public static void sumOfTwoArrays(int[] arr1, int[] arr2) {
        int i, k, j,g, c, sum = 0;

        if (arr1.length > arr2.length) {
            c = arr1.length + 1;
        } else {
            c = arr2.length + 1;
        }
        int arr[] = new int[ c ];
        k=c;
        for (i = arr1.length -1, j = arr2.length-1; i >= 0 && j >= 0 ;i--,j--) {
            if (i!=0&& j!=0) {
                sum = arr1[ i ] + arr2[ j ];

                if (sum >= 10) {
                    arr[ k-- ] = sum % 10;

                    arr1[ i - 1 ] = arr1[ i - 1 ] + 1;
                } else {

                    arr[ k-- ] = sum;

                }
            }
                else if (i == -1) {
                    while (j >= 0) {
                        arr[ k-- ] = arr2[ j --];

                    }


                }
                else if (j == -1) {
                    while (i >= 0) {
                        arr[--k ] = arr[i--];


                    }
                }

            }
            for ( g= 0; g< arr.length; g++) {
                System.out.print(arr[ g ] + " ");
            }

        }

    }

