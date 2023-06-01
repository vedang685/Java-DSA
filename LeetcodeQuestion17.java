import java.util.*;
public class LeetcodeQuestion17
{
    public static void main(String[] args)
    {
        String[] operations = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    static int finalValueAfterOperations(String[] operations)
    {
        int length = operations.length;
        int x = 0;
        for(int i = 0; i < length; i++)
        {
            if(operations[i].charAt(1) == '+')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        return x;
    }
}
