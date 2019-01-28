package StringsAnd2dArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hp on २५-०६-२०१७.
 */
public class CheckPermution {
    public static void main(String[] args) {
        String input1 = "", input2 = "";
        boolean b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string :");
        input1 = s.next();
        System.out.println("Enter the second string:");
        input2 = s.next();
        b = isPermutation(input1, input2);
        System.out.println("The string are permutation of each other "+b);
    }


        public static boolean isPermutation(String input1, String input2) {
            int i, j;
            int flag = 0;
            char ch[]= input1.toCharArray();
            char ch1[]=input2.toCharArray();
            boolean result=false;
            Arrays.sort(ch);
            Arrays.sort(ch1);
            if (ch.length == ch1.length){
                for(i=0,j=0;i<ch.length&&j<ch1.length;) {
                    if(ch[i]==ch1[j])
                    {
                        i++;
                        j++;
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                }

            } else {
                result = false;
            }


            if (flag == 1) {
                result = true;
            }
            else
            {
                result=false;
            }

            return result;

    }
}
