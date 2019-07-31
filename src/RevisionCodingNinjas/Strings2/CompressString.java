package RevisionCodingNinjas.Strings2;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        String output = "";
        int count = 1, i = 0;
        input = sc.nextLine();
        int inputArr[] = new int[ 256 ];
        for (i = 0; i < input.length(); i++) {
            inputArr[ input.charAt(i) ]++;
        }
        for (i = 0; i < input.length(); ) {
            if (inputArr[ input.charAt(i) ] > 1){
                output += input.charAt(i) + String.valueOf(inputArr[ input.charAt(i) ]);
                i=i+inputArr[input.charAt(i)];
        }else{
            output += input.charAt(i);
            i++;
        }
    }
        System.out.println(output);
        sc.close();
    }
}
