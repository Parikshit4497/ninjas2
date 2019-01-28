package Online.Variabeles.ExpressionExcercise;

public class DogMain {
    public static void main(String[] args) {
        int time;
        boolean bark=false;
        System.out.println("Is the dog barking " + bark(true,1));
        System.out.println("Is the dog barking " +  bark(true,6));
        System.out.println("Is the dog barking " +   bark(false,5));
        System.out.println("Is the dog barking " +  bark(true,-1));
        System.out.println("Is the dog barking " +   bark(true,26));

    }
    public static boolean bark(boolean bark,int time)
    {
        if(bark)
        {
            if((time>0&&time<8)||(time>22&&time<=23))
            {
                return true;
            }
            else{
                return false;
        }
        }
        else{
            return false;
        }
    }
}
