import java.util.Arrays;

public class Searching2DArray
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {23,4,1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == target)
                {
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
