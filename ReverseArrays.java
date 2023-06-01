import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] arr = {1,3,23,9,18};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
