import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            int ans = 0;
            System.out.println("Enter the operator");
            char operator = in.next().trim().charAt(0);
            if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%')
            {
                System.out.println("input number 1");
                int num1 = in.nextInt();
                System.out.println("input number 2");
                int num2 = in.nextInt();

                if(operator == '+')
                {
                    ans = num1+num2;
                }

                if(operator == '-')
                {
                    ans = num1-num2;
                }

                if(operator == '*')
                {
                    ans = num1*num2;
                }

                if(operator == '/')
                {
                    if(num2 != 0)
                    {
                        ans = num1 / num2;
                    }
                }

                if(operator == '%')
                {
                    ans = num1%num2;
                }

            }
            else if(operator == 'x' || operator == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
