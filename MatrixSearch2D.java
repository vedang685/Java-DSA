import java.util.Arrays;

public class MatrixSearch2D
{
    public static void main(String[] args)
    {
        int[][] nums = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 38;
        System.out.println(Arrays.toString(matrixSearch(nums,target)));
    }

    static int[] matrixSearch(int[][]nums, int target)
    {   int start_row = 0;
        int start_column = nums[0].length-1;
        int row_length = nums.length;
        int col_length = nums[0].length;
        int[] ans = {-1,-1};
        while(start_column < row_length && start_column >=0)
        {
            if(nums[start_row][start_column] == target)
            {
                ans[0] = start_row;
                ans[1] = start_column;
                return ans;
            }
            if(nums[start_row][start_column] > target)
            {
                start_column--;
            }
            if(nums[start_row][start_column] < target)
            {
                start_row++;
            }
        }
        return ans;
    }
}
