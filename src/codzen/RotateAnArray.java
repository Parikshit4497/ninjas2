package codzen;

/**
 * Created by hp on १९-०६-२०१७.
 */
import java.util.Scanner ;
public class RotateAnArray {
    public static void main(String[] args) {

        int i ,n,d;
        Scanner input=new Scanner(System.in);
        System.out.println("Size of first array");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the time by wich you wish to rotate: ");
        d=input.nextInt();
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        rotate(arr,d);
    }
    public static void rotate(int[] arr, int d) {
        int i=0,j=0,count=0,k;
        int arr1[]=new int[arr.length];
        for(i=d;i<arr.length;i++) {
            arr1[ j ] = arr[ i ];
            j++;
        }

      for (i=0;i<d;i++)
      {
          arr1[j]=arr[i];
                  j++;
      }
      System.arraycopy(arr1,0,arr,0,arr.length);
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

      }
    }


