package RevisonComp.ArrayRe;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        int i;
        n=s.nextInt();
        int arr[]= new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                break;
            }
        }
        System.out.println(arr[i]);
    }
}
