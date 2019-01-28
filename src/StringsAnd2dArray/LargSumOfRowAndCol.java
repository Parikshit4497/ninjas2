package StringsAnd2dArray;

import java.util.Scanner;

/**
 * for uneven coulmns
 */
public class LargSumOfRowAndCol {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("No of rows");
        int rows = s.nextInt();
        int[][] input = new int[ rows ][];

        for (int i = 0; i < input.length; i++) {
            System.out.println("Number of cols for row " + i);
            int col = s.nextInt();
            input[ i ] = new int[ col ];
            for (int j = 0; j < input[ i ].length; j++) {
                input[ i ][ j ] = s.nextInt();
            }
        }

        findLargest(input);
    }
        public static void findLargest(int input[][]){

            int sum1=0,i,j,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
            int index1=0,index2=0;
            int temp[]=new int[input.length];
            for(i=0;i<input.length;i++)
            {
                sum1=0;
                for(j=0;j<input[i].length;j++)
                {
                    sum1=sum1+input[i][j];
                    if(sum1>max1)
                    {
                        max1=sum1;
                        index1=i;
                    }
                }
            }
            for(i=0;i<input.length;i++)
            {       temp[0]=0;
                for (j = 0; j < input[i].length; j++) {
                    temp[j]+=input[i][j];
                    if(max2<temp[j])
                    {
                        max2=temp[j];
                        index2=j;

                    }
                }
            }
            if(max1>=max2)
            {
                System.out.println("row " +index1+" "+ max1);
            }
            else
            {
                System.out.println("column "+index2+" "+max2);
            }

    }
}
