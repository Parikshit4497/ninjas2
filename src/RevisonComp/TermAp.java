package RevisonComp;

import java.util.Scanner;

public class TermAp {
    public static void main(String[] args) {
        int n,i;
          int N;
          Scanner s=new Scanner(System.in);
          n=s.nextInt();
          for(i=0;i<n;i++){
              N=3*i+2;
              if(N%4!=0){
                  System.out.println(N);
              }
          }
    }
}
