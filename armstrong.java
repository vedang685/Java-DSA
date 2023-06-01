import java.util.Scanner;

public class armstrong
{
    /*
    Armstrong number:
    Sum of cube of individual digit = digit
     */

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(IsArmstrong(n))
        {
            System.out.println("Given number is Armstrong number");
        }
        else
        {
            System.out.println("Given number is not an armstrong number");
        }
    }
    static boolean IsArmstrong(int n)
    {
        int copy = n;
        int sum = 0;
        while(n>0)
        {
            int last_digit = n%10;
            sum = sum + (last_digit * last_digit * last_digit);
            n = n/10;
        }
        if(sum == copy)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
