import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++)
        {
           array[i] = input.nextInt();
        }

        // Binary search
        int key = input.nextInt();
        int s = 0;
        int e = n;
        while(s<e)
        {
            int mid = (s+e)/2;
            if(array[mid] == key)
            {
                System.out.println("found at index "+ mid);
                break;
            }

            if(array[mid]>key)
            {
                e = mid-1;
            }

            if(array[mid]<key)
            {
                s = mid+1;
            }
        }

    }
}
