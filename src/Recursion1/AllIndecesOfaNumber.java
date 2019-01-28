package Recursion1;
import  java.util.Scanner;

public class AllIndecesOfaNumber {
    public static void main(String[] args) {


        int n, i, x;
        int arr4[];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = s.nextInt();
        int input[] = new int[ n ];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++)

        {
            input[ i ] = s.nextInt();
        }
        System.out.println("Enter the number:");
        x = s.nextInt();
        arr4=AllIndex(input, x);
        for (i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }
    public static int [] AllIndex(int input[],int x) {
        int k = 0;
        int i = 0;
        int arr5[];
        for (i = 0; i < input.length; i++) {
            if (input[ i ] == x) {
                k++;
            }
        }


        int arr4[] = new int[ k ];
        arr5=search(arr4,input,x,0,0);
        return arr5;
    }
    public static int [] search(int arr4[],int input[],int x,int i,int j)
    {

        if(input.length==0)
        {
            arr4[0]=0;
            return arr4;
        }
        if(input.length==i)
        {
            return arr4;
        }
        if(input[i]==x) {
            arr4[ j++ ] =  i ;
            return search(arr4, input, x, i + 1,  j);

        }
        else
        {
            return search(arr4, input, x, i + 1,  j);
        }

    }
}
