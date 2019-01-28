package OOPSPRACT.StaticandInterface;

import java.util.Random;

public interface SharedInterface {
    int NO =0;
    int YES=1;
    int LATER=2;
    int MAYBE=3;
    int SOON=4;
    int NEVER=5;
}
class Question implements  SharedInterface{
    Random rand=new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30) {
            return NO;
        } else if (prob < 60) {
            return YES;
        } else if (prob < 75) {
            return LATER;
        } else if (prob < 98) {
            return SOON;
        } else
            return NEVER;
    }
    }
class  AskeMe implements SharedInterface{
    static  void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;

        }

    }
    public static void main(String args[]) {
     Question q=new Question();
     answer(q.ask());
     answer(q.ask());
     answer(q.ask());
     answer(q.ask());
    }
}