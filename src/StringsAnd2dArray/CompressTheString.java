package StringsAnd2dArray;

import java.util.Scanner;

/**
 xvcCreated by hp on २५-०६-२०१७.
 */
public class CompressTheString {
    public static void main(String[] args) {
        String inputString="",str2="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string ");
        inputString=s.nextLine();
      str2=compress(inputString);
      System.out.println("The string after compression:" +str2);
    }
    public static String compress(String inputString) {
        int k=1,i;
        String str1="";
        char ch,ch2;
        char ch1[]= inputString.toCharArray();
    loopname:    for(i=1;i<ch1.length;i=i+1) {
                  if(ch1[i-1]==ch1[i])
                  {
                      k++;
                  }
                  else
                  {   if(k==1) {
                      ch = ch1[ i - 1 ];
                      str1 = str1 + ch ;
                      k = 1;
                      continue loopname;
                  }
                      if(k>1) {
                      ch = ch1[ i - 1 ];
                      str1 = str1 + ch + String.valueOf(k);
                      k = 1;
                      continue loopname;
                  }
                 }

            }
        if(k>1)
        {
            ch2=ch1[ch1.length-1];
            str1=str1+ch2+String.valueOf(k);
        }
        else
        {
            ch2=ch1[ch1.length-1];
            str1=str1+ch2;
        }
        return str1;
    }
}
