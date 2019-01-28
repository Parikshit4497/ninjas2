package Lecture2;

/**
 * Created by hp on १२-०६-२०१७.
 */
public class Assignment2bQ2
{
    public static void main(String[] args) {
        int n=0,i=0,s;

        while(i<=20)
        {
            n++;
            s=3*n+2;
            if(s%4!=0)
            {
                System.out.println("The series is "+ s);
                i++;
            }
        }
    }
}

