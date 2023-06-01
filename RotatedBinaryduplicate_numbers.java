public class RotatedBinaryduplicate_numbers
    //unsolved
{
    public static void main(String[] args)
    {
        int[] nums = {7,7,6,7};
        int pivotIndex = pivotIndex(nums);
        System.out.println(pivotIndex);
    }

    static int pivotIndex(int[] nums)
    {
        int s = 0;
        int e = nums.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(mid < nums.length && nums[mid] > nums[mid+1])
            {
                return mid;
            }
            if(mid > s && nums[mid] < nums[mid-1])
            {
                return mid-1;
            }
            if(nums[s] == nums[mid] && nums[s] == nums[e])
            {
                s++;
                e--;
            }
        }
        return -1;
    }
//    static int rotatedbinarySearch(int[] nums)
//    {
//
//    }
}
