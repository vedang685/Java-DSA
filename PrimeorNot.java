
// If a number is prime or not

import java.util.Scanner;

public class PrimeorNot
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(IsPrime(n))
        {
            System.out.println("The number is a prime number");
        }
        else
        {
            System.out.println("The number is not a prime number");
        }

    }

    static boolean IsPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        int c = 2;
        while(c*c <= n)
        {
            if(n%c == 0)
            {
                return false;
            }
            c++;
        }
        return true;

    }

}
