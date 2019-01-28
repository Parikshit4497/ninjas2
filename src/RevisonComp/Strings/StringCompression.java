package RevisonComp.Strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1="";
        String str2="";
        char CharArray[];
        str1=s.next();
        int i=0;
        int count=1;
        CharArray=str1.toCharArray();
        char ch=0;
        for(i=1;i<CharArray.length;i++){

            if(CharArray[i-1]==CharArray[i]){
                count++;
            }else{
                if(count>1){
                    ch=CharArray[i-1];
                    str2+=ch+String.valueOf(count);
                }else{
                    ch=CharArray[i-1];
                    str2+=ch;
                }
                count=1;
            }

        }
        if(count>1){
            ch=CharArray[i-1];
            str2+=ch+String.valueOf(count);
        }else{
            ch=CharArray[i-1];
            str2+=ch;
        }
        System.out.println("The compressed string is :" + str2);


    }
}
