import java.util.Scanner;

public class practice
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        while(i <= n)
        {
            if (isPrime(i))
            {
                System.out.println(i);
            }
            i++;
        }
    }

    static boolean isPrime(int n)
    {
        int i = 2;
        while(i < n)
        {
            if(n % i == 0)
            {
                return false;
            }
            i++;
        }
        return true;
    }


}
