import java.util.Arrays;
// First find floor of a matrix in first column then apply binary search in that row
public class BinarySearchinMatrix
{
    public static void main(String[] args)
    {
        int[][] nums = {
                {1},
                {3}
        };
        int target = 0;
        int floor = FloorOfRow(nums,target);
        System.out.println(nums[floor][0]);
        System.out.println(Arrays.toString(binarySearch(nums,target,floor)));
    }
    static int[] binarySearch(int[][]nums, int target, int row)
    {
        if(nums[row][0] == target)
        {
            return new int[] {row,0};
        }
        int start = 0;
        int end = nums[0].length-1;
        while (start<=end)
        {
            int mid = (start+end)/2;
            if(nums[row][mid] > target)
            {
                end = mid - 1;
            }
            if(nums[row][mid] < target)
            {
                start = mid + 1;
            }
            if(nums[row][mid] == target)
            {
                return new int[] {row,mid};
            }
        }
        return new int[] {-1,-1};

    }
    static int FloorOfRow(int[][]nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid][0] == target)
            {
                return mid;
            }
            if(nums[mid][0] > target)
            {
                if(mid == 0)
                {
                    return mid;
                }
                end = mid - 1;
            }
            if(nums[mid][0] < target)
            {
                start = mid + 1;
            }
        }
        return end;
    }

}
