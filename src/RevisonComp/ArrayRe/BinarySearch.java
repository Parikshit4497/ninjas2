package RevisonComp.ArrayRe;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        int n=s.nextInt();
        int arr[] =new int [n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int fo=0;
        int lo=arr.length-1;
        int so;
        int num=s.nextInt();
        so=(lo+fo)/2;

        while(fo<=lo){
            if(arr[so]==num){
                System.out.println(so);
                break;
            }else if(arr[so]<num){
                fo=so+1;
            }else if(arr[so]>num){
                lo=so-1;
            }
            so=(lo+fo)/2;
        }if(fo>lo){
            System.exit(0);
        }
    }
}
