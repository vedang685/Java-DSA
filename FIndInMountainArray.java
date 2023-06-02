public class FIndInMountainArray
{
    // Practiced Leetcode Question 1095 Hard
    public static void main(String[] args)
    {
        int[] nums = {1,2,4,5,1};
        int target = 3;
        int peakIndex = peakIndex(nums);
        int firstIndex = OrderAgnosticBinarySearch(nums, 0, peakIndex, target);
        int lastIndex = OrderAgnosticBinarySearch(nums,peakIndex,nums.length-1,target);
        int min = Math.min(firstIndex,lastIndex);
        if(firstIndex == -1 || lastIndex == -1)
        {
            min = Math.max(firstIndex,lastIndex);
        }
        System.out.println(min);
    }

    static int OrderAgnosticBinarySearch(int[] nums, int start, int end, int target)
    {
        Boolean IsAscending = true;
        if(nums[0] > nums[1])
        {
            IsAscending = false;
        }
        if(IsAscending)
        {
            while(start<=end)
            {
                int mid = (start+end)/2;
                if(nums[mid] == target)
                {
                    return mid;
                }
                if(nums[mid] > target)
                {
                    end = mid - 1;
                }
                if(nums[mid] < target)
                {
                    start = mid + 1;
                }
            }
            return -1;
        }
        else
        {
            while(start<=end)
            {
                int mid = (start+end)/2;
                if(nums[mid] == target)
                {
                    return mid;
                }
                if(nums[mid] > target)
                {
                    start = mid + 1;
                }
                if(nums[mid] < target)
                {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }

    static int peakIndex(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while (start<end)
        {
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid+1])
            {
                end = mid;
            }
            else
            {
                start = mid+1;
            }
        }
        return start;
    }
}
