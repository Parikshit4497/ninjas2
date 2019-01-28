package ArrayListAutUnbox;

public class Array {

    public static void main(String[] args) {
        int[] myIntArray = new int[ 10 ];
        myIntArray[ 5 ] = 50;
        myIntArray[ 1 ] = 476;
        myIntArray[ 0 ] = 45;
        /*int  []myIntArray=new int[10];*//*this gives error because as we have already declared an array with the variable name
         myIntArray and both the declarations are for the same data type*/
        double[] myDoubleArray = new double[ 10 ];
        System.out.println(myIntArray[ 5 ]);
        int[] myIntArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j < 10; j++) {
            myIntArray1[ j ] = j * 10;
        }
        for (int i = 0; i < 10/*maIntArray1.length*/; i++) {
            System.out.print(myIntArray1[ i ] + " ");
        }
        System.out.println();
        PrintArray(myIntArray1);

    }

    public static void PrintArray(int myIntArray1[]) {

        for (int i = 0; i < myIntArray1.length; i++) {
            System.out.println("Elements " + i + " value is " + myIntArray1[ i ]);
        }
    }

}


