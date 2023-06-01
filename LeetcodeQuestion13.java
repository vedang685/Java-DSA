public class LeetcodeQuestion13
{
    public static void main(String[] args)
    {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
    static int searchInsert(int[] nums, int target)
    {
        int s = 0;
        int e = nums.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid] == target)
            {
                return mid;
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
        return s;
    }
}
