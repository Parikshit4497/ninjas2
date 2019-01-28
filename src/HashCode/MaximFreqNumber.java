package HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hp on ०४-०८-२०१७.
 */
public class MaximFreqNumber {
    public static int calculate(int arr[],HashMap<Integer,Integer> map )
    {
        for(int type : arr)
        {
            if(map.containsKey(type))
            {
                map.put(type,map.get(type)+1);
            }
            else
            {
                map.put(type,1);
            }
        }
        int maxfreq=Integer.MIN_VALUE;
        int maxfreNum=0;
        for(int type : arr)
        {
            if(map.containsKey(type))
            {
                if(map.get(type)>maxfreq)
                {
                    maxfreq=map.get(type);
                    maxfreNum=type;

                }
            }
        }

        return maxfreNum;
    }
}
class MaximFreqNumUse
{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=0,i;
        MaximFreqNumber m1=new MaximFreqNumber();
        HashMap<Integer,Integer> map=new HashMap <>();
        System.out.println("Enter the number of elemnts in the array ");
        n=s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the  elemnts of the array ");
        for( i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int result =m1.calculate(arr,map);
        System.out.println("The maximum freq number is: "+ result);

    }
        }