public class LeetcodeQuestion23M
{
    // Elements that are occuring exactly twice are present in the array
    // There is one element in the array that is occuring exactly once
    // Find the number which has time complexity of O(log(n)) and space complexity of O(1)

    public static void main(String[] args)
    {
        int[] nums ={1,1,2,2,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
    static int singleNonDuplicate(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        // checking boundary conditions
        if(end == 0)
        {
            return nums[0];
        }
        if(nums[0] != nums[1])
        {
            return nums[0];
        }
        if(nums[end]!=nums[end-1])
        {
            return nums[end];
        }
        while (start<=end)
        {
            int mid = (start+end)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
            {
                return nums[mid];
            }
            // checking for the first occurrence and the last occurrence
            if((mid)%2 == 0 && nums[mid] == nums[mid+1] || (mid)%2 == 1 && nums[mid] == nums[mid-1])
            {
                start = mid + 1; // it is following pair index property, hence the element is on
                // on the right
            }
            else
            {
                // we are on the right side of the unique element and the pair index property is not
                // being followed
                end = mid - 1;
            }
        }
        return -1;
    }
}
