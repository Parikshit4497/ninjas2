
import java.util.Scanner ;
import java.util.Arrays;
        public class Assignment3Q6
        {
            public static void main(String[] args) {
                int i,j,a=0,n,b=0;
                Scanner input=new Scanner(System.in);
                n=input.nextInt();
                int arr[]=new int[n];
                for(i=0;i<n;i++)
                {
                    arr[i]=input.nextInt();
                }
                for(i=0;i<n;i++)
                {
                    a=arr[i];
                    for(j=0;j<n;j++)
                    {
                        if(a==arr[j])
                        {
                            ++b;
                       }
                    }
                    if(b>1)
                    {
                        System.out.println(a);
                        break;
                   }
                   b=0;
                }
                /*int i,j,a=0,b=0,k=0,n=0;
                Arrays.sort(arr);
                for(i=0;i<arr.length-1;i++)
                {
                    if(arr[i]==arr[i+1])
                    {
                        n=arr[i];return n/or print depending upon question
                        break;
                    }
                   much better algo;
                }*/
            }
        }