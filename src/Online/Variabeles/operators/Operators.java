package Online.Variabeles.operators;

public class Operators {
    public static void main(String[] args) {
        int result=1+2;
        System.out.println("1+2=" +result);
        int previousResult=result;
       result=result*10;
        System.out.println(previousResult+"*10=" +result);
        previousResult=result;
        result=result/5;
        System.out.println(previousResult +"/5=" +result);
        result=result+1;
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result+=2;
        System.out.println(result);
        result*=10;
        System.out.println(result);
        result-=10;

        System.out.println(result);
        result/=10;
        System.out.println(result);
        boolean isAlien=false;
        if(isAlien==true)
        {
            System.out.println("It is not an alien!");
        }
        int topScore=100;
        if(topScore>100)
        {
            System.out.println("You got the high score!");
        }
        if(topScore!=100)
        {
            System.out.println("You got the high score!");
        }
        if(topScore==100)
        {
            System.out.println("You got the high score!");
        }
    }
}
