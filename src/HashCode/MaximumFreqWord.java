package HashCode;


import java.util.HashMap;
import java.util.Scanner;

public class MaximumFreqWord {
    public static  String findMax(String str1,HashMap<String,Integer> hm)
    {
        String[] result =str1.split(" ");
        for(String currentString :result) {
            if (hm.containsKey(currentString))
            {
                hm.put(currentString,hm.get(currentString)+1);
            }
            else
            {
                hm.put(currentString,1);
            }
        }

        int maxFreq=Integer.MIN_VALUE;
        String maxfreqword=" ";
        for(HashMap.Entry<String,Integer> currentEntry : hm.entrySet())
        {
            if(maxFreq<currentEntry.getValue())
            {
                maxFreq=currentEntry.getValue();
                maxfreqword=currentEntry.getKey();
            }
        }
        return maxfreqword;
    }

}

class MaxFreqWordUse
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        MaximumFreqWord m1 =new MaximumFreqWord();
        HashMap<String,Integer> hm =new HashMap <>();
        String str1="";
        System.out.println("Enter the string ");
        str1=s.nextLine();
        String str2 =m1.findMax(str1,hm);
        System.out.println("The maximum frequency word is " + str2);

    }
}
