public class LeetcodeQuestion24M
{
    // leetcode problem 153
    // Return minimum element in the rotated sorted array
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(search(nums));
    }
    static int search(int[] nums)
    {
        int pivot = Pivot(nums);
        if (pivot == -1)
        {
            return nums[0];
        } else
        {
            return nums[pivot + 1];
        }
    }

    static int Pivot(int[] nums)
    {
        int s = 0;
        int e = nums.length-1;
        while(s <= e)
        {
            int mid = (s+e)/2;
            if(mid < e && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(mid > s && nums[mid] < nums[mid-1])
            {
                return mid-1;
            }
            if(nums[mid] <= nums[s])
            {
                e = mid-1;
            }
            else
            {
                s = mid + 1;
            }
        }
        return -1;
    }
}
