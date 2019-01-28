package RevisonComp.array;

import java.util.Scanner;

public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,j,num;
        System.out.println("Declare the size of the array");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        num=1;
      for(i=0,j=arr.length-1;i<j;){
          if(num%2==1){
              arr[i]=num;
              i++;
              num++;
          }else{
              arr[j]=num;
              j--;
              num++;
          }

      }
      if(i==j){
          arr[i]=num;
      }
        System.out.println("The resultant array is");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
    }
}
