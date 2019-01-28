package RevisonComp.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class HighestOccuringChar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="";
        char CharArray[];
        str1=s.next();
        int i;
        int count=1;
        int max=-99999;
        char ch=0;
        int FreqArra[]=new int[256];
//        CharArray=str1.toCharArray();
//        Arrays.sort(CharArray);
//        for(i=0;i<CharArray.length-1;i++){
//
//            if(CharArray[i]==CharArray[i+1]) {
//                count++;
//            }else{
//                if (max < count) {
//                    ch = CharArray[ i ];
//                    max = count;
//                }
//                count=1;
//            }
//
//        }
//        System.out.println("The character with maximum frequency " + ch);
          for(i=0;i<str1.length();i++){
              FreqArra[str1.charAt(i)]++;
          }
          for(i=0;i<str1.length();i++){
              if(max<FreqArra[str1.charAt(i)]){
                  max=FreqArra[str1.charAt(i)];
                  ch=str1.charAt(i);
              }
          }
        System.out.println("The highest frequency char " +ch );
    }
}
