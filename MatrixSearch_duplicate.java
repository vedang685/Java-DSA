import java.util.Arrays;

public class MatrixSearch_duplicate
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
        System.out.println(Arrays.toString(MatrixSearch(nums,target)));
    }
    static int[] MatrixSearch(int[][]nums, int target)
    {
        int start = 0;
        int end = nums[0].length-1;
        int[] ans = {-1,-1};
        while(start < nums.length && end >= 0)
        {
            if(nums[start][end]==target)
            {
                ans[0] = start;
                ans[1] =end;
                return ans;
            }
            if(nums[start][end] > target)
            {
                end--;
            }
            if(nums[start][end] < target)
            {
                start++;
            }
        }
        return ans;
    }

}
