package Online.Variabeles.Methods;

public class Main {
    public static void main(String[] args) {
    boolean gameOver=true;
     int score=800;
     int levelCompleted=5;
     int bonus=100;
     calculateScore(true,800,5,100);
    calculateScore(true,200,8,500);

        System.out.println("the answer is :"+ calculateScore(true,200,8,500));
    }
   /** public  static  void calculateScore(){
             boolean gameOver=true;
             int score=800;
             int levelCompleted=5;
             int bonus=100;
             if(gameOver)
             {
                 int finalScore=score+(levelCompleted*bonus);
                 finalScore+=1000;
                 System.out.println("Your final score was " +finalScore);
             }
    }*/
   public  static int /* void */calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){

       if(gameOver)
       {
           int finalScore=score+(levelCompleted*bonus);
           finalScore+=1000;
           System.out.println("Your final score was " +finalScore);
           return finalScore;
       }
       else{
           return -1;/*negative one indicates errors */
       }
   }
}
