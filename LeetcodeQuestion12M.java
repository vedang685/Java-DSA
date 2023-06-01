import java.util.Arrays;
// Binary search Help taken
public class LeetcodeQuestion12M
{
    public static void main(String[] args)
    {
        int[] nums = {8,8,8,8,8,8,8};
        int target  = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    static int[] searchRange(int[] nums, int target)
    {
        int [] ans = new int[2];
        ans[0] = FirstIndex(nums,target);
        ans[1] = LastIndex(nums,target);
        return ans;
    }

    private static int LastIndex(int[] nums, int target)
    {
        int index = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid] == target)
            {
                index = mid;
                s = mid + 1;
            }
            if(nums[mid] < target)
            {
                s = mid + 1;
            }
            if(nums[mid] > target)
            {
                e = mid - 1;
            }
        }
        return index;
    }
    static int FirstIndex(int[] nums, int target)
    {
        int index = -1;
        int s = 0;
        int e = nums.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid] == target)
            {
                index = mid;
                e = mid - 1;
            }
            if(nums[mid] < target)
            {
                s = mid + 1;
            }
            if(nums[mid] > target)
            {
                e = mid - 1;
            }
        }
        return index;
    }
}