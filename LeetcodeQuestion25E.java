import java.util.Arrays;

public class LeetcodeQuestion25E
{
    public static void main(String[] args)
    {
        int [] nums ={4,4,4,3,2};
        System.out.println(majorityElement(nums));

    }
    static int majorityElement(int[] nums)
    {
        SelectionSort(nums);
        return (nums[nums.length/2]);
    }
    static void SelectionSort(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            int start = 0;
            int end = nums.length-i-1;
            int max = getmax(nums,start,end);
            swap(nums,max,end);
        }
    }
    static int getmax(int[] nums, int start, int end)
    {
        int max = start;
        for(int i = start; i <= end; i++)
        {
            if(nums[i] > nums[max])
            {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] nums, int low, int high)
    {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

}

