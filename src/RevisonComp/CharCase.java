package RevisonComp;

import java.util.Scanner;

public class CharCase {
    public static void main(String[] args) {
        char ch;
        Scanner s=new Scanner(System.in);
        ch=s.next().charAt(0);
        if(ch>=65&&ch<=90){
            System.out.println(1);
        }else if(ch>=97&&ch<=122){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
    }
}
