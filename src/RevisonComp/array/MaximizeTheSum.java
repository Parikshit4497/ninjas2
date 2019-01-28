package RevisonComp.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeTheSum {
    public static void main(String[] args) {
        int i;
        int j = 0;
        int n;
        int m, sum1=0, sum2=0;
        long result=0;
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        int input1[] = new int[ n ];
        for (i = 0; i < input1.length; i++) {
            input1[ i ] = s.nextInt();
        }
        m = s.nextInt();
        int input2[] = new int[ m ];
        for (i = 0; i < input2.length; i++) {
            input2[ i ] = s.nextInt();
        }
        i = 0;

        while(i<input1.length&&j<input2.length){
            if(input1[i]<input2[j]){
                sum1+=input1[i++];
            }
            else if(input2[j]<input1[i]){
                sum2+=input2[j];
            }
            else{
                result+=Math.max(sum1,sum2);
                sum1=0;
                sum2=0;
                while(i<input1[i]&&j<input2[j]&&input1[i]==input2[j]){
                    result+=input1[i];
                    j++;
                }
            }
        }
        while(i<input1.length){
            sum1+=input1[i++];
        }
        while(j<input2.length){
            sum2+=input2[j++];
        }
       result+=Math.max(sum1,sum2);
            System.out.println("The sum of the number is " + result);


        }
    }

