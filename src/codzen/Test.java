package codzen;

/**
 * Created by hp on १६-०६-२०१७.
 */
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int n;
        int isprime;
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
for(int i=2;i<=n;i++)

{
    isprime =0;
    for (int j = 2; j <=i / 2;j++) {
        if (i % j == 0) {
            ++isprime ;
            break;
        }
    }
    if (isprime == 0)
    {
        System.out.println(i);
    }
}
    }
}
