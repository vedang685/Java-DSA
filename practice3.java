import java.util.Scanner;

public class practice3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        for(int i = n; i > 0; i--)
        {
            for(int j = 0; j < i-1; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
