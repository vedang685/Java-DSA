public class RotatedBinarySearch
    /*
    Meaning of rotation:
    Let the number = {1,2,3,4,5,6,7,8}
    if the number is rotated one times the number will become
    {8,1,2,3,4,5,6,7}
    if the number is rotated two times the number will become
    {7,8,1,2,3,4,5,6}
    if the number is rotated three times the number will become
    {6,7,8,1,2,3,4,5,6}
     */
{
    public static void main(String[] args) 
    {
        int[] nums = {6,7,1,2,3,4,5};
        int target = 3;
        System.out.println(search(nums,target));

    }

    static int search(int[] nums, int target)
    {
        int pivot = pivot(nums);
        if(pivot == -1)
        {
            return binarySearch(nums,target,0, nums.length-1);
        }
        if(nums[pivot] == target)
        {
            return pivot;
        }
        if(nums[0] > target)
        {
            return binarySearch(nums,target,pivot+1, nums.length-1);
        }
        else
        {
            return binarySearch(nums,target,0,pivot-1);
        }
    }
    static int pivot(int[] nums)
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

    static int binarySearch(int[] nums, int target, int s, int e)
    {
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                e = mid-1;
            }
            else
            {
                s = mid+1;
            }
        }
        return -1;
    }

}
