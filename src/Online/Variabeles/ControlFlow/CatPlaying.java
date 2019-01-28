package Online.Variabeles.ControlFlow;

import java.util.Scanner;

public class CatPlaying {
    public static void main(String[] args) {
        boolean summer=false;
        int tempRange;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter whether it is summer or winter");
        summer=s.nextBoolean();
        System.out.println("Enter the temperature change ");
        tempRange=s.nextInt();
        System.out.println("Is the cat playing or not" + isCatPlaying(summer,tempRange));
    }
    public static boolean isCatPlaying(boolean summer,int tempRange)
    {
            if(summer)
            {
                if(tempRange>=25&&tempRange<=45)
                {
                    return true;
                }
                else{
                    return false;
                }
            }
            else {
                 if (tempRange >= 25 && tempRange <= 35){
                        return  true;
                }else{
                     return false;
                 }
            }
    }

}
