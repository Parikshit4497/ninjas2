package Lecture1;

/**
 * Created by hp on ११-०६-२०१७.
 */
public class Light{
    public static void main(String[] args) {
        long lightspeed;
        int days;
        long seconds ;
        long distance ;
        lightspeed=186000;
        days=1000;
        seconds=days*24*60*60;
        distance=lightspeed*seconds;
        System.out.printf("In %d days light will travel about %d miles", days, distance);
       /* System.out.print("days light will travel about ");
        System.out.print(distance+" miles");*/


    }

}
