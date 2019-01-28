package codzen;

/**
 * Created by hp on १६-०६-२*
 */
 import java.util.Scanner;
 public class Main {

 public static void main(String[] args) {

 int n;
 Scanner input=new Scanner(System.in);
 n=input.nextInt();
 int x=1,y=0;
 for(int i=0;i<n;i++){
 if(i<2){
 if(i==0){
 System.out.print(x);
 System.out.print("\n");
 }else{
 System.out.print(x);
 System.out.println(x);
 }
 }else{
 for(int j=0;j<=i;j++){
 if(j==0 || j==i){
 System.out.print(i);
 }else{
 System.out.print(y);
 }
 }
 System.out.print("\n");
 }
 }



 }
 }

