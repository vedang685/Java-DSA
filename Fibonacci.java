import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        System.out.print("Enter the range of Fibonacci");
        Scanner input = new Scanner(System.in);
        int range = input.nextInt();
        int n = input.nextInt();
        int counter = 2;
        for (int i = 2; i< range; i++)
        {
            counter++;
            int next = a+b;
            if(counter == n)
            {
                System.out.println(n+"th fibonacci number is "+ next);
            }
            a = b;
            b = next;
        }


    }
}
