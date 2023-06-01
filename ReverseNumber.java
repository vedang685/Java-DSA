public class ReverseNumber

    // Reverse the number
//    ans = ans * 10 + remainder
{
    public static void main(String[] args)
    {
        int number = 238575787;
        System.out.println("Original number = "+number);
        int last_digit = 0;
        double new_number = 0;
        int copy = number;
        int total_digits = 0;
        int count = 0;
        while(copy > 0)
        {
            copy = copy/10;
            total_digits++;
        }

        for(int i = total_digits-1; i >= 0; i--)
        {
            last_digit = number%10;
            new_number = new_number + (last_digit *Math.pow(10,i));
            number = number/10;
        }
        System.out.println("Number in reversed order = "+ (int)new_number);

    }
}
