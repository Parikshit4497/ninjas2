package RevisonComp.array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int low=0,mid=0,high=0,num,i;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the number you wish to search");
        num=s.nextInt();
        low=0;
        high=arr.length-1;
        mid=(low +high)/2;
        while(low<=high){

            if(arr[mid]==num){
                System.out.println(arr[mid]);
                break;
            }else if(arr[mid]>num){
                high=mid-1;
            }else if(arr[mid]<num){
                low=mid+1;
            }
            mid=(low+high)/2;
        }if(low>high){
            System.out.println("Wrong entry");
        }
    }
}
