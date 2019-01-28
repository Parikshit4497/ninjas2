package OOPSBOOK;

/**
 * Created by hp on २१-०८-२०१७.
 */
public class Light {
    public static void main(String[] args) {
        int lightspeed ;
        int days ;
        long seconds ;
        long distance;
         lightspeed=186000;
        days=1000;
        seconds=days*24*60*60;
        distance=lightspeed*seconds;
        System.out.println("In "+ days + " days light will travel a distance of " + distance + " miles");
    }
}
