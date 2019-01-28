package Assignment4;

/**
 * Created by hp on १५-०६-२०१७.
 */
import java.util.Scanner;
public class Assign4Q2b {
    public static void main(String[] args) {
        int n,m,i,key,j=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        n=input.nextInt();
        System.out.println("Enter the number of elements of the array :");
        m=input.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter the number of elements in the first array :");
        for(i=0;i<m;i++)
        {
            arr1[i]=input.nextInt();
        }
        System.out.println("Enter the number of in the second array");
        for(i=0;i<m;i++)
        {
            arr1[i]=input.nextInt();
        }
        key=intersect(arr1,arr2,i,j,m);
        System.out.println("The intersection point is:"+key);
    }
    public static int intersect(int arr1[],int arr2[],int i,int j,int m)
    {  int key, a=0;
        for(j=0;j<m;j++) {
            key=arr1[j];
            for (i = 0; i < m; i++) {
                if(key==arr2[i])
                {
                    a=key;
                }

            }
        }
        return a;
    }
}
